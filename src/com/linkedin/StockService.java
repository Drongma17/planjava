package com.linkedin;

import com.linkedin.model.Stock;

import java.util.List;

public class StockService {

    public static final double VALUE_LIMIT = 100.0;

    public static void main(String[] args) {
        List<Stock> stocks = List.of(
                new Stock("apple", 110.0),
                new Stock("microsoft", 130.0),
                new Stock("meta", 90.0),
                new Stock("google", 120.0),
                new Stock("vanguard", 99.0)
                );
        printTopStock(stocks);
    }

    private static void printTopStock(List<Stock> stocks) {
        stocks.stream()
                .filter(s -> s.getValue() > VALUE_LIMIT)
                .forEach(System.out::println);
    }
}
