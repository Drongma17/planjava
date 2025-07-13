package interviewed;

import java.util.concurrent.*;
import java.util.*;

public class FraudDetectionSystem {

    private static final ExecutorService executor = Executors.newFixedThreadPool(10);
    private static final Map<String, Double> transactionThresholds = new ConcurrentHashMap<>();

    static {
        transactionThresholds.put("US", 10000.0);
        transactionThresholds.put("UK", 8000.0);
        transactionThresholds.put("IN", 5000.0);
    }

    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
            new Transaction("123", "US", 12000),
            new Transaction("456", "IN", 3000),
            new Transaction("789", "UK", 9000)
        );

        for (Transaction txn : transactions) {
            CompletableFuture.runAsync(() -> processTransaction(txn), executor);
        }

        executor.shutdown();
    }

    public static void processTransaction(Transaction txn) {
        double threshold = transactionThresholds.getOrDefault(txn.getCountry(), 5000.0);
        if (txn.getAmount() > threshold) {
            alertFraud(txn);
        }
    }

    public static void alertFraud(Transaction txn) {
        System.out.println("🚨 FRAUD ALERT: " + txn.getId() + " in " + txn.getCountry() +
                " Amount: $" + txn.getAmount());
    }

    static class Transaction {
        private final String id;
        private final String country;
        private final double amount;

        public Transaction(String id, String country, double amount) {
            this.id = id;
            this.country = country;
            this.amount = amount;
        }

        public String getId() { return id; }
        public String getCountry() { return country; }
        public double getAmount() { return amount; }
    }
}