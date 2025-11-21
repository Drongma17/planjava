package eazybyte.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterDemo {


    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2025,3,18);
        LocalTime localTime = LocalTime.of(12,9,17);
        LocalDateTime localDateTime = LocalDateTime.of(2025,9,17,12,30,20);
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);


        DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formattedDate = dataFormatter.format(localDate);
        System.out.println(formattedDate);

        System.out.println();

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        String formaterTime = timeFormatter.format(localTime);
        System.out.println(formaterTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("hh:mm:ss /MM/dd/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String format = dateTimeFormatter.format(now);
        System.out.println(format);
        String format1 = dateTimeFormatter1.format(now);
        System.out.println(format1);


        String formattedDate1 = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(formattedDate1);


        DateTimeFormatter germanFormate = DateTimeFormatter.ofPattern("d/MM/yyyy", Locale.GERMAN);
        String format2 = germanFormate.format(LocalDateTime.now());
        System.out.println(format2);

    }
}
