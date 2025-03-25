

public class Advanced_Switches {
    public static void main(String[] args) {
        
        Scannmer scanner = new Scanner(System.in);

        System.out.println("Enter the day of the week: ");
        string day = scanner.nextLine();

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> 
                System.out.println("It is a weekday");
            case "Saturday", "Sunday" -> 
                System.out.println("It is the weekend");
            default -> System.out.println("It is not a day");
        }
    }
}