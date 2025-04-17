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

        //choice

        System.out.print("Enter your move (rock, paper, scissors): ");
        playerChoice = scanner.nextLine().toLowerCase();

        if (!playerChoice.equals("rock") &&
                !playerChoice.equals("paper") && 
                !playerChoice. equals("scissors")) {
            System.out.println("Invalid choice");
            continue;
        }

        computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer choice: " + computerChoice);

        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie");
        } else if ((playerChoice.equals("rock") && playerChoice.equals("scissors")) 
                || (playerChoice.equals("scissors") && playerChoice.equals("paper")) 
                || (playerChoice.equals("paper") && playerChoice.equals("rock"))) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");

        }



        // rand choice

        // win condition

        // play again
        System.out.print("Play again? (yes/no): ");
        playAgain = scanner.nextLine().toLowerCase();

        // goodbye
    }
}