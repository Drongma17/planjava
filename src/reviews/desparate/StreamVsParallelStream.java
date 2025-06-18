package reviews.desparate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamVsParallelStream {

    static class Order {
        int id;
        double amount;

        Order(int id, double amount) {
            this.id = id;
            this.amount = amount;
        }

        double calculateTax() {
            // Simulate a heavy computation (100ms per order)
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            return amount * 0.1;
        }
    }

    public static void main(String[] args) {
        // Create 20 sample orders
        List<Order> orders = IntStream.rangeClosed(1, 20)
                                      .mapToObj(i -> new Order(i, i * 100))
                                      .collect(Collectors.toList());

        // Sequential stream
        long startSequential = System.currentTimeMillis();
        double totalTaxSequential = orders.stream()
                                          .mapToDouble(Order::calculateTax)
                                          .sum();
        long endSequential = System.currentTimeMillis();

        System.out.println("Sequential Total Tax: $" + totalTaxSequential);
        System.out.println("Time taken (stream): " + (endSequential - startSequential) + " ms");

        // Parallel stream
        long startParallel = System.currentTimeMillis();
        double totalTaxParallel = orders.parallelStream()
                                        .mapToDouble(Order::calculateTax)
                                        .sum();
        long endParallel = System.currentTimeMillis();

        System.out.println("Parallel Total Tax: $" + totalTaxParallel);
        System.out.println("Time taken (parallelStream): " + (endParallel - startParallel) + " ms");
    }
}
