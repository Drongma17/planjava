package codingcrack.interviewquetions;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateAndTime {


    public static void main(String[] args) {

        LocalDate date = LocalDate.now(); // Current date
        LocalDate dob = LocalDate.of(1995, 5, 20); // Specific date
        int year = date.getYear();
        int day = date.getDayOfMonth();
        System.out.println("Year "+year + "  "+  day);


        LocalTime time = LocalTime.now(); // Current time
        LocalTime lunch = LocalTime.of(12, 30); // 12:30 PM
        System.out.println("lunch time " + lunch);



        LocalDateTime now = LocalDateTime.now();
        LocalDateTime meeting = LocalDateTime.of(2025, 6, 10, 14, 0);
        System.out.println("Meeting time at "+ meeting);

        // Period between two dates
        LocalDate start = LocalDate.of(2023, 1, 1);
        LocalDate end = LocalDate.of(2025, 1, 1);
        Period period = Period.between(start, end); // 2 years
        System.out.println("Period between start and end is " + period);


// Duration between two times
        LocalTime t1 = LocalTime.of(10, 0);
        LocalTime t2 = LocalTime.of(12, 30);
        Duration duration = Duration.between(t1, t2); // 2.5 hours
        System.out.println("Duration of time "+ duration);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formatted = LocalDateTime.now().format(formatter);
        LocalDateTime parsed = LocalDateTime.parse("30-05-2025 14:00", formatter);
        System.out.println("Full date time year and time is "+ parsed);
    }
}
