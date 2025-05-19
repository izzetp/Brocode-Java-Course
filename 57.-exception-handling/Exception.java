public class Exception {
    public static void main(String[] args) {
        
        try {
            System.out.println("Enter a number: ");
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        }


    }
}
