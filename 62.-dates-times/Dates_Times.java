import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates_Times {
    public static void main(String[] args) {
        
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now();
        LocalDate dateOf = LocalDate.of(2024, 12, 25);
        LocalDateTime dateTimeOf = LocalDateTime.of(2024, 12, 25, 12, 0, 0);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM:ss");
        String newDateTime = dateTime.format(formatter);

        LocalDateTime date1 = LocalDateTime.of(2024, 12, 25, 12, 0, 0);
        LocalDateTime date2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);


        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(instant);
        System.out.println(newDateTime);
        System.out.println(dateTimeOf);

        System.out.println(date1);
        System.out.println(date2);

        if(date1.isBefore(date2)) {
            System.out.println(date1 + "is earlier than " + date2);
        } else if(date1.isAfter(date2)) {
            System.out.println(date1 + " is later than " + date2);
        } else if(date1.equals(date2)) {
            System.out.println(date1 + " is the same as " + date2);
        }

    }
}