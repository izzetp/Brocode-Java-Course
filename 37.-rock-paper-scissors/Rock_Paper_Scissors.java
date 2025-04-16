import java.util.Scanner;
import java.util.Random;


public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        
        //declare

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        System.out.println("Enter your move (rock, paper, scissors): )");
        playerChoice = scanner.nextLine().toLowerCase();

        if (!playerChoice.equals("rock") &&
                !playerChoice.equals("paper") && 
                !playerChoice. equals("scissors")) {
            System.out.println("Invalid choice");
        }

        // choice

        // rand choice

        // win condition

        // play again

        // goodbye
    }
}