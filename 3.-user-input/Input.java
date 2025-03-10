import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a strudent: ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age);
        System.out.println("Your gpa is " + gpa);
        
        if (isStudent) {
            System.out.println("You are a student");
        }
        else {
            System.out.println("You are not a student");
        }

        scanner.close();

    }
}
