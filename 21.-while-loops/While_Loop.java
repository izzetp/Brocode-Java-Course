import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String name = "";

        while (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scanner.next();
        }

        System.out.println("Hello " + name);


        String response = "";

        while (!response.equals("Q")) {
            System.out.println("You are playing a game");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        System.out.println("You have quit the game");


        int age = 0;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while (age < 0) {
            System.out.println("Your age cannot be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("You are " + age + " years old");

        do {
            System.out.println("Your age cannot be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        } while (age < 0);

        System.out.println("You are " + age + " years old");

        int number = 0;

        while (number < 1 || number > 10) {
            System.out.print("Enter a number between 1-10: ");
            number = scanner.nextInt();
        }

        System.out.println("You picked " + number);

        scanner.close();
    }
}
