import java.util.InputMismatchException;

public class Exception {
    public static void main(String[] args) {
        
        try {
            System.out.println("Enter a number: ");
        } catch (InputMismatchException e) {
            System.out.println("That was not a number!");            
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        }


    }
}
