import java.util.Scanner;

public class Banking_Program {
    public static void main(String[] args) {
        
        // java banking program for beginners

        // declare vairables

        Scanner scanner = new Scanner(System.in);
        double balance = 0;
        boolean isRunning = true;
        int choice;

       while (isRunning) {
            // display menu
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");
    
            // get and process user input
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
    
            switch(choice) {
                case 1 -> System.out.println("SHOW BALANCE");
                case 2 -> System.out.println("DEPOSIT");
                case 3 -> System.out.println("WITHDRAW");
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
    
            }
       }

        // showbalance()

        // deposit()

        // withdraw()

        // exit()

        scanner.close();

    }

    static void showBalance(double balance) {
        System.out.println("***************");
        System.out.printf("$%.2f\n", balance);
        System.out.println("***************");

    }
}
