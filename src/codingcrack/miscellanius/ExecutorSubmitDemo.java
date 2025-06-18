package codingcrack.miscellanius;

import java.util.concurrent.*;
import java.util.List;
import java.util.ArrayList;

public class ExecutorSubmitDemo {
    
    public static void main(String[] args) {
        // Create thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);
        
        try {
            // Example 1: Submit Callable tasks
            System.out.println("=== Callable Tasks ===");
            submitCallableTasks(executor);
            
            System.out.println("\n=== Runnable Tasks ===");
            // Example 2: Submit Runnable tasks
            submitRunnableTasks(executor);
            
            System.out.println("\n=== Mixed Tasks ===");
            // Example 3: Submit multiple tasks and collect results
            submitMultipleTasks(executor);
            
        } finally {
            // Always shutdown the executor
            executor.shutdown();
            try {
                if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                    executor.shutdownNow();
                }
            } catch (InterruptedException e) {
                executor.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }
    }
    
    // Example 1: Callable tasks that return results
    private static void submitCallableTasks(ExecutorService executor) {
        // Create Callable tasks
        Callable<String> task1 = new DatabaseTask("User123");
        Callable<Integer> task2 = new CalculationTask(10, 20);
        Callable<String> task3 = () -> {
            Thread.sleep(1000);
            return "Lambda Callable Result: " + Thread.currentThread().getName();
        };
        
        try {
            // Submit tasks and get Future objects
            Future<String> future1 = executor.submit(task1);
            Future<Integer> future2 = executor.submit(task2);
            Future<String> future3 = executor.submit(task3);
            
            // Get results (blocking calls)
            System.out.println("Database result: " + future1.get());
            System.out.println("Calculation result: " + future2.get());
            System.out.println("Lambda result: " + future3.get());
            
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Task execution failed: " + e.getMessage());
        }
    }
    
    // Example 2: Runnable tasks
    private static void submitRunnableTasks(ExecutorService executor) {
        // Create Runnable tasks
        Runnable task1 = new LoggingTask("Important log message");
        Runnable task2 = () -> {
            System.out.println("Lambda Runnable executed on: " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };
        
        // Submit Runnable tasks (returns Future<?> with null result)
        Future<?> future1 = executor.submit(task1);
        Future<?> future2 = executor.submit(task2);
        
        // You can also submit Runnable with a result value
        Future<String> future3 = executor.submit(new NotificationTask(), "Task Completed");
        
        try {
            // Wait for completion
            future1.get(); // Returns null for Runnable
            future2.get(); // Returns null for Runnable
            String result = future3.get(); // Returns the provided result value
            System.out.println("Runnable with result: " + result);
            
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Task execution failed: " + e.getMessage());
        }
    }
    
    // Example 3: Submit multiple tasks and handle results
    private static void submitMultipleTasks(ExecutorService executor) {
        List<Future<String>> futures = new ArrayList<>();
        
        // Submit multiple similar tasks
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            Callable<String> task = () -> {
                Thread.sleep(1000 + (taskId * 200)); // Different execution times
                return "Task " + taskId + " completed on " + Thread.currentThread().getName();
            };
            
            Future<String> future = executor.submit(task);
            futures.add(future);
        }
        
        // Collect results as they complete
        for (int i = 0; i < futures.size(); i++) {
            try {
                String result = futures.get(i).get(3, TimeUnit.SECONDS); // With timeout
                System.out.println("Result " + (i + 1) + ": " + result);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                System.err.println("Task " + (i + 1) + " failed or timed out: " + e.getMessage());
            }
        }
    }
}

// Callable implementation for database operations
class DatabaseTask implements Callable<String> {
    private final String userId;
    
    public DatabaseTask(String userId) {
        this.userId = userId;
    }
    
    @Override
    public String call() throws Exception {
        // Simulate database operation
        Thread.sleep(800);
        
        // Simulate potential exception
        if (userId == null || userId.isEmpty()) {
            throw new IllegalArgumentException("User ID cannot be null or empty");
        }
        
        return "User data retrieved for: " + userId + " on thread: " + Thread.currentThread().getName();
    }
}

// Callable implementation for calculations
class CalculationTask implements Callable<Integer> {
    private final int a, b;
    
    public CalculationTask(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public Integer call() throws Exception {
        Thread.sleep(500); // Simulate complex calculation
        return a * b + (a + b);
    }
}

// Runnable implementation for logging
class LoggingTask implements Runnable {
    private final String message;
    
    public LoggingTask(String message) {
        this.message = message;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(300);
            System.out.println("[LOG] " + message + " - Thread: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Logging task interrupted");
        }
    }
}

// Runnable implementation for notifications
class NotificationTask implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(400);
            System.out.println("[NOTIFICATION] Email sent on thread: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Notification task interrupted");
        }
    }
}