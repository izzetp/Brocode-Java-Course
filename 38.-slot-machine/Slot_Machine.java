import java.util.Random;
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
        String[] row = SpinRow();

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
            }

            System.out.println("Spinning...");
            row = SpinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance += payout;
            } else {
                System.out.println("Sorry you lost this round");
            }
        }

        System.out.print("Do you want to play again (Y/N): ");
        playAgain = scanner.nextLine().toUpperCase();

        scanner.close();
    }

    static String[] SpinRow() {

        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return new String[0];
    }

    static void printRow(String[] row) {
        System.out.println("************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("************");

    }

    static int getPayout(String[] row, int bet) {

        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }

        return 0;
    }
}
