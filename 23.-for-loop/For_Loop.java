import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for (int i = 0: i < max; i++) {
            System.out.println("");
        }

        scanner.close();
    }
}
