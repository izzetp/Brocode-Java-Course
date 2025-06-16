import java.util.Scanner;

public class Threading {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("You have 5 seconds to enter your name");

        for (int i; i <= 5; i++) {

            try {
                thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }

            if (i == 5) {
                System.out.println("Time's up!");
            }
        }

        System.out.print("Enter your name: ");
        String name = scanner.nexrtline();
        System.out.println("Hello " + name);

        scanner.close();
    }
}
