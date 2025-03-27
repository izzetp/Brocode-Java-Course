import java.util.Scanner;

public class Logical_Operator {
     public static void main(String[] args) {

        double temp = -10;
        boolean isSunny = true;

        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is GOOD");
            System.out.println("It is SUNNY outside");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is GOOD");
            System.out.println("It is CLOUDY outside");
        } else if (temp > 30 || temp < 0) {
            System.out.println("The weather is BAD");
        }

        Scanner scanner = new Scanner(System.in);
     
        String username;
        
        System.out.print("Enter your new username: ");
        username = scanner.nextLine();
   
        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4-12 characters");
        } else if (username.contains(" ")) { 
            System.out.println("Username must not contsin spaces");
        } else {
            System.out.println("Welcome" + username);
        }

        scanner.close();
     }
}
