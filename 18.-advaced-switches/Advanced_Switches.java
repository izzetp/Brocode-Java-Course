import java.util.Scanner;

public class Advanced_Switches {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day of the week: ");
        String day = scanner.nextLine();

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> 
                System.out.println("It is a weekday");
            case "Saturday", "Sunday" -> 
                System.out.println("It is the weekend");
            default -> System.out.println("It is not a day");
        }

        scanner.close();
    }
}