package reviews.desparate;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/*
Parallel execution using CompletableFuture.supplyAsync(...).

Non-blocking until .get() is called for result aggregation.

Uses a custom ExecutorService for better thread control in real-world apps.
 */

public class UserDashboardService {

    private static final ExecutorService executor = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        long start = System.currentTimeMillis();

        CompletableFuture<String> userFuture = CompletableFuture.supplyAsync(() -> fetchUserProfile(), executor);
        CompletableFuture<String> ordersFuture = CompletableFuture.supplyAsync(() -> fetchOrderHistory(), executor);
        CompletableFuture<String> paymentsFuture = CompletableFuture.supplyAsync(() -> fetchPaymentStatus(), executor);

        // Combine all results
        CompletableFuture<String> dashboardFuture = userFuture
                .thenCombine(ordersFuture, (user, orders) -> user + "\n" + orders)
                .thenCombine(paymentsFuture, (userAndOrders, payments) -> userAndOrders + "\n" + payments);

        // Get final result
        String dashboard = dashboardFuture.get();
        System.out.println("Final Dashboard:\n" + dashboard);

        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + " ms");

        executor.shutdown();
    }

    // Simulate API/service call with delay
    private static String fetchUserProfile() {
        sleep(1000);
        return "User Profile: John Doe, Age: 30";
    }

    private static String fetchOrderHistory() {
        sleep(1200);
        return "Order History: [Order#123, Order#124]";
    }

    private static String fetchPaymentStatus() {
        sleep(800);
        return "Payment Status: Paid in Full";
    }

    private static void sleep(int millis) {
        try { Thread.sleep(millis); } catch (InterruptedException e) { e.printStackTrace(); }
    }
}
