import java.util.Scanner;

public class Quiz_Game {
    public static void main(String[] args) {
        
        // questions array[]
        String[] questions = {"What is the main function of a router?",
                              "Which part of hte computer is considered the brain?",
                              "What year was Facebook launced?",
                              "Who is known as the father of computers?",
                              "What was the first programming langage?"};

        // options array[][]
        String[][] options = {{"Storing files", "2. Encrpyting data", "3. directing internet raffic", "4. Managing passwords"},
                              {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                              {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                              {"1. Steve Jobs", "2. Bill GAtes", "3. Alan Turing", "4. Charles Babbage"},
                              {"1. COBOL", "2. C", "3. Fortan", "4. Assembly"}};

        // declar variables
        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        // welcome message
        // question (loop)
        //options
        // get guess
        // check guess

        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                score++;
            } else {
                System.out.println("********");
                System.out.println(" WRONG! ");
                System.out.println("********");
            }
        }

        // display score
        System.out.println("Your final score is: " + score + " out of " + questions.length);

        scanner.close();
    }
}
