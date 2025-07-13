package com.thonglam.codersdata;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysBetweenExample {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 6, 1);
        LocalDate endDate = LocalDate.of(2025, 6, 16);

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("Days between: " + daysBetween);
    }
}