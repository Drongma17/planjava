package com.thonglam.codersdata;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class MinutesBetweenExample {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2025, 6, 16, 9, 30);
        LocalDateTime end = LocalDateTime.of(2025, 6, 16, 11, 45);

        long minutesBetween = ChronoUnit.MINUTES.between(start, end);

        System.out.println("Minutes between: " + minutesBetween);
    }
}