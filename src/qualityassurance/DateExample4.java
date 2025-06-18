package qualityassurance;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateExample4 {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2025, 1, 1);
        LocalDate end = LocalDate.of(2025, 6, 16);

        LocalTime startTime = LocalTime.of(4, 45);
        LocalTime endTime = LocalTime.of(12, 45);




        long daysBetween = ChronoUnit.DAYS.between(start, end);
        long hours = ChronoUnit.HOURS.between(startTime, endTime);
        long Minutes = ChronoUnit.MINUTES.between(startTime, endTime);
        System.out.println("Days Between: " + daysBetween); // Output: 166
        System.out.println("Hours Between: " + hours); // Output: 8
        System.out.println("Minutes Between: " + Minutes); // Output: 8
    }
}