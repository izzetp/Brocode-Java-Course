import java.util.Scanner;

public class Slot_Machine {
    public static void main(String[] args) {
        
        // declare
        // welcome
        // play if balance greater zero
        // enter bet amount
        // verify if bet > balance
        // verify if bet > 0
        // subtract bet
        // spin row
        //print row
        // get pay out
        // ask play again
        //display message

        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;

        System.out.println("***************************");
        System.out.println("   Welcome to Java Slots   ");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐  ");
        System.out.println("***************************");

        while (balance > 0) {
            System.out.println("Current balanmce: $" + balance);
            System.out.print("Plance your bet amount: ");
            bet = scanner.nextInt();

            if (bet > balance) {
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
                continue;
            } else {
                balance -= bet;
                System.out.println("$ " + balance);

            }
        }

    }
}
