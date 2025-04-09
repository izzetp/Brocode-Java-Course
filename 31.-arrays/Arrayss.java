import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args) {
        
        String[] fruits = {"apple", "orange", "banana", "coconut"};

        fruits[0] = "pimeapple"; 
        int numOfFruits = fruits.length;
        Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");

        System.out.println(fruits[0]);
        System.out.println(numOfFruits);

        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
