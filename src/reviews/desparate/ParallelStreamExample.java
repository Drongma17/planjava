package reviews.desparate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    static class Order {
        int id;
        double amount;

        Order(int id, double amount) {
            this.id = id;
            this.amount = amount;
        }

        double calculateTax() {
            // Simulate a heavy computation
            try { Thread.sleep(100); } catch (InterruptedException e) { }
            return amount * 0.1; // 10% tax
        }
    }

    public static void main(String[] args) {
        List<Order> orders = IntStream.range(1, 21)
                                      .mapToObj(i -> new Order(i, i * 100))
                                      .collect(Collectors.toList());

        long start = System.currentTimeMillis();

        // Process using parallelStream
        double totalTax = orders.parallelStream()
                                .mapToDouble(Order::calculateTax)
                                .sum();

        long end = System.currentTimeMillis();
        System.out.println("Total Tax: $" + totalTax);
        System.out.println("Time taken with parallelStream: " + (end - start) + " ms");
    }
}
