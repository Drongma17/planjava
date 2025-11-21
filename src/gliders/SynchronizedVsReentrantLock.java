package gliders;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.TimeUnit;

public class SynchronizedVsReentrantLock {
    
    // Shared resource
    private static int sharedCounterSync = 0;
    private static int sharedCounterLock = 0;
    
    // ReentrantLock instance
    private static final Lock lock = new ReentrantLock();
    
    // Object for synchronized blocks
    private static final Object syncLock = new Object();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Comparing synchronized vs ReentrantLock ===\n");
        
        // Test 1: Basic functionality
        testBasicFunctionality();
        
        // Test 2: Try-Lock functionality
        testTryLockFunctionality();
        
        // Test 3: Fairness demonstration
        testFairness();
        
        // Test 4: Interruptibility
        testInterruptibility();
    }
    
    /**
     * Test 1: Basic functionality - both achieve the same thread safety
     */
    private static void testBasicFunctionality() throws InterruptedException {
        System.out.println("1. BASIC FUNCTIONALITY TEST");
        System.out.println("Both ensure thread-safe counter increment:");
        
        Thread[] syncThreads = new Thread[5];
        Thread[] lockThreads = new Thread[5];
        
        // Reset counters
        sharedCounterSync = 0;
        sharedCounterLock = 0;
        
        // Create threads using synchronized
        for (int i = 0; i < 5; i++) {
            syncThreads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    incrementWithSynchronized();
                }
            });
        }
        
        // Create threads using ReentrantLock
        for (int i = 0; i < 5; i++) {
            lockThreads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    incrementWithReentrantLock();
                }
            });
        }
        
        // Start all threads
        for (int i = 0; i < 5; i++) {
            syncThreads[i].start();
            lockThreads[i].start();
        }
        
        // Wait for completion
        for (int i = 0; i < 5; i++) {
            syncThreads[i].join();
            lockThreads[i].join();
        }
        
        System.out.println("Synchronized counter: " + sharedCounterSync + " (Expected: 5000)");
        System.out.println("ReentrantLock counter: " + sharedCounterLock + " (Expected: 5000)");
        System.out.println();
    }
    
    /**
     * Test 2: Try-Lock functionality (Only available with ReentrantLock)
     */
    private static void testTryLockFunctionality() throws InterruptedException {
        System.out.println("2. TRY-LOCK FUNCTIONALITY TEST");
        System.out.println("ReentrantLock can attempt to acquire lock without blocking:");
        
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1: Acquiring lock with synchronized...");
            synchronized(syncLock) {
                System.out.println("Thread 1: Holding synchronized lock for 2 seconds");
                try { Thread.sleep(2000); } catch (InterruptedException e) {}
            }
        });
        
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(100); // Give t1 time to acquire lock first
                System.out.println("Thread 2: Trying to acquire synchronized lock (will block)...");
                synchronized(syncLock) {
                    System.out.println("Thread 2: Acquired synchronized lock");
                }
            } catch (InterruptedException e) {}
        });
        
        Thread t3 = new Thread(() -> {
            System.out.println("Thread 3: Acquiring ReentrantLock...");
            lock.lock();
            try {
                System.out.println("Thread 3: Holding ReentrantLock for 2 seconds");
                try { Thread.sleep(2000); } catch (InterruptedException e) {}
            } finally {
                lock.unlock();
            }
        });
        
        Thread t4 = new Thread(() -> {
            try {
                Thread.sleep(100); // Give t3 time to acquire lock first
                System.out.println("Thread 4: Trying tryLock()...");
                boolean acquired = lock.tryLock(500, TimeUnit.MILLISECONDS); // Wait up to 500ms
                if (acquired) {
                    try {
                        System.out.println("Thread 4: Successfully acquired lock with tryLock()");
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println("Thread 4: Could not acquire lock within timeout, doing alternative work");
                }
            } catch (InterruptedException e) {}
        });
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        System.out.println();
    }
    
    /**
     * Test 3: Fairness demonstration
     */
    private static void testFairness() throws InterruptedException {
        System.out.println("3. FAIRNESS TEST");
        System.out.println("ReentrantLock can be fair (FIFO ordering):");
        
        // Create a fair lock
        Lock fairLock = new ReentrantLock(true);
        Object unfairSyncLock = new Object();
        
        Thread[] fairThreads = new Thread[3];
        Thread[] unfairThreads = new Thread[3];
        
        // Test fair ReentrantLock
        System.out.println("Testing Fair ReentrantLock:");
        for (int i = 0; i < 3; i++) {
            final int threadId = i;
            fairThreads[i] = new Thread(() -> {
                fairLock.lock();
                try {
                    System.out.println("Fair Lock - Thread " + threadId + " acquired lock");
                    try { Thread.sleep(100); } catch (InterruptedException e) {}
                } finally {
                    fairLock.unlock();
                }
            });
        }
        
        for (Thread t : fairThreads) {
            t.start();
            Thread.sleep(10); // Stagger thread starts
        }
        
        for (Thread t : fairThreads) {
            t.join();
        }
        
        // Test unfair synchronized
        System.out.println("\nTesting synchronized (unfair):");
        for (int i = 0; i < 3; i++) {
            final int threadId = i;
            unfairThreads[i] = new Thread(() -> {
                synchronized(unfairSyncLock) {
                    System.out.println("Synchronized - Thread " + threadId + " acquired lock");
                    try { Thread.sleep(100); } catch (InterruptedException e) {}
                }
            });
        }
        
        for (Thread t : unfairThreads) {
            t.start();
            Thread.sleep(10); // Stagger thread starts
        }
        
        for (Thread t : unfairThreads) {
            t.join();
        }
        System.out.println();
    }
    
    /**
     * Test 4: Interruptibility
     */
    private static void testInterruptibility() throws InterruptedException {
        System.out.println("4. INTERRUPTIBILITY TEST");
        System.out.println("ReentrantLock.lockInterruptibly() vs synchronized:");
        
        final Object syncLock2 = new Object();
        final Lock interruptibleLock = new ReentrantLock();
        
        // Thread that holds lock for a long time
        Thread holder1 = new Thread(() -> {
            synchronized(syncLock2) {
                System.out.println("Sync Holder: Acquired lock, holding for 5 seconds...");
                try { Thread.sleep(5000); } catch (InterruptedException e) {
                    System.out.println("Sync Holder: Interrupted while holding lock");
                }
            }
        });
        
        Thread holder2 = new Thread(() -> {
            interruptibleLock.lock();
            try {
                System.out.println("Lock Holder: Acquired ReentrantLock, holding for 5 seconds...");
                try { Thread.sleep(5000); } catch (InterruptedException e) {
                    System.out.println("Lock Holder: Interrupted while holding lock");
                }
            } finally {
                interruptibleLock.unlock();
            }
        });
        
        // Thread that will be interrupted while waiting for lock
        Thread waiter1 = new Thread(() -> {
            System.out.println("Sync Waiter: Trying to acquire synchronized lock...");
            synchronized(syncLock2) {
                System.out.println("Sync Waiter: Acquired lock (this shouldn't print if interrupted)");
            }
        });
        
        Thread waiter2 = new Thread(() -> {
            System.out.println("Lock Waiter: Trying to acquire lock with lockInterruptibly()...");
            try {
                interruptibleLock.lockInterruptibly();
                try {
                    System.out.println("Lock Waiter: Acquired lock (this shouldn't print if interrupted)");
                } finally {
                    interruptibleLock.unlock();
                }
            } catch (InterruptedException e) {
                System.out.println("Lock Waiter: Interrupted while waiting for lock!");
            }
        });
        
        holder1.start();
        holder2.start();
        
        Thread.sleep(100); // Ensure holders get the lock first
        
        waiter1.start();
        waiter2.start();
        
        Thread.sleep(100); // Let waiters start waiting
        
        // Interrupt the waiting threads
        waiter1.interrupt();
        waiter2.interrupt();
        
        System.out.println("Both waiters interrupted...");
        
        holder1.join();
        holder2.join();
        waiter1.join();
        waiter2.join();
        
        System.out.println();
    }
    
    // Synchronized method
    private static void incrementWithSynchronized() {
        synchronized(syncLock) {
            sharedCounterSync++;
        }
    }
    
    // ReentrantLock method
    private static void incrementWithReentrantLock() {
        lock.lock();
        try {
            sharedCounterLock++;
        } finally {
            lock.unlock(); // Always unlock in finally block
        }
    }
}