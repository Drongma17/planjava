package eazybyte.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class GetPlusMinusMethodsDemo {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2025, 9 , 17);
        int year = localDate.getYear(); // 2025
        Month month = localDate.getMonth(); // SEPTEMBER
        int day  = localDate.getDayOfMonth();
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        LocalDateTime localDateTime = LocalDateTime.now();
        int hour = localDateTime.getHour();

        LocalDate ld1 = localDate.plusDays(6); // 2025-09-23
        LocalDate ld2 = localDate.plusMonths(6); // 2026-03-17
        LocalDate ld3 = localDate.plusWeeks(2); //2025-10-01

        LocalDate ld4 = localDate.minusMonths(9); // 2024-12-17
        LocalDate ld5 = localDate.minusYears(7); // 2018-09-17

        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld3);
        System.out.println(ld4);
        System.out.println(ld5);

    }

}