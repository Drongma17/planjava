package eazybyte.datetime;

import java.time.*;

public class FromAndWithMethodsDemo {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2025, Month.SEPTEMBER, 17, 12, 30);
        System.out.println(dateTime);


        LocalDate localDate = LocalDate.from(dateTime);
        LocalTime localTime = LocalTime.from(dateTime);
        System.out.println(localDate);
        System.out.println(localTime);


        LocalDateTime dateTime1 = dateTime.withYear(2030);
        LocalDateTime dateTime2 = dateTime.withYear(2030).withMonth(8);
        System.out.println(dateTime1);
        System.out.println(dateTime2);
    }
}
