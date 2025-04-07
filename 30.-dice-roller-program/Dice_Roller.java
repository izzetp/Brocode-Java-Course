import java.util.Scanner;
import java.util.Random;

public class Dice_Roller {
    public static void main(String[] args) {
        
        // dice roller program

        // declare variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;

        // get # of dice
        System.out.print("Enter the # of dice to roll: ");
        numOfDice = scanner.nextInt();

        // check if # dice is less 0
        // roll dices
        if (numOfDice > 0) {

            for (int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);
        } else {
            System.out.println("# of dice must be greater than 0");
        }

        scanner.close();
    }
    // display
    static void printDie(int roll) {
        String dice1 = """
         -------
        |       |
        |   0   |
        |       |
         -------
        """;
        String dice2 = """
         -------
        | 0     |
        |       |
        |     0 |
         -------
        """;
        String dice3 = """
         -------
        | 0     |
        |   0   |
        |     0 |
         -------
        """;
        String dice4 = """
         -------
        | 0   0 |
        |       |
        | 0   0 |
         -------
        """;
        String dice5 = """
         -------
        | 0   0 |
        |   0   |
        | 0   0 |
         -------
        """;
        String dice6 = """
         -------
        | 0   0 |
        | 0   0 |
        | 0   0 |
         -------
        """;

        switch(roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll");

        }
    }
}