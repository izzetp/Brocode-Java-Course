import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Dates_Times {
    public static void main(String[] args) {
        
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
    }
}