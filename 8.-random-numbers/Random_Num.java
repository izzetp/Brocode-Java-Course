import java.util.Random;

public class Random_Num {
    public static void main(String[] args) {

        Random random = new Random();

        int number1;

        double number2;
        int number3;
        boolean isHeads;

        number1 = random.nextInt(1, 7);
        number2 = random.nextDouble(1, 7);
        isHeads = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);

        if (isHeads){
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }
    
    }
}