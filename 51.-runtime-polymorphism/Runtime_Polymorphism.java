import java.util.Scanner;

public class Runtime_Polymorphism {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Animal51 animal;

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog51();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat51();
            animal.speak();
        }
    }
}
