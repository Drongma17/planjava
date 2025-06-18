package codingcrack.miscellanius;

import java.time.*;
import java.time.format.DateTimeFormatter;


public class DateTimeExample {

    public static void main(String[] args) {
        // 🕒 1. Current Date and Time
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Current DateTime: " + currentDateTime);

        // 🗓️ 2. Formatting Date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatted = currentDateTime.format(formatter);
        System.out.println("Formatted DateTime: " + formatted);

        // 📅 3. Parsing Date
        String dateStr = "10-05-2025 14:30:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateStr, formatter);
        System.out.println("Parsed DateTime: " + parsedDateTime);

        // ➕ 4. Add/Subtract Time
        LocalDate tomorrow = currentDate.plusDays(1);
        LocalDate lastWeek = currentDate.minusWeeks(1);
        System.out.println("Tomorrow: " + tomorrow);
        System.out.println("Last Week: " + lastWeek);

        // 🔁 5. Compare Dates
        if (currentDate.isBefore(tomorrow)) {
            System.out.println("Today is before tomorrow.");
        }

        // ⏱️ 6. Duration (Time Difference)
        LocalTime start = LocalTime.of(9, 30);
        LocalTime end = LocalTime.of(17, 45);
        Duration duration = Duration.between(start, end);
        System.out.println("Working hours duration: " + duration.toHours() + " hours");

        // 📆 7. Period (Date Difference)
        LocalDate birthDate = LocalDate.of(1990, Month.JUNE, 15);
        Period age = Period.between(birthDate, currentDate);
        System.out.println("Age: " + age.getYears() + " years, " + age.getMonths() + " months");
    }
}
