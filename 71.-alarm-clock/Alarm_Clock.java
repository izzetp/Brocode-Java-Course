import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Alarm_Clock {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime;

        System.out.println("Enter an alarm time (HH:MM:SS): ");
        String inputTime = scanner.nextLine();

        alarmTime = localTime.parse(inputTime, formatter);
        System.out.println("Alarm set for " + alarmTime);

        scanner.close();
    }
}