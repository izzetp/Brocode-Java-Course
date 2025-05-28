import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        
        String word = "watermelon";

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for(int i = 0; i < wordstate.length(); i++) {
            wordState.add('_');
        }

        System.out.println(wordState);

        scanner.close();
    }
}
