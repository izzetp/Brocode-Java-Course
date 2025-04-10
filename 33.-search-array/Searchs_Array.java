

public class Searchs_Array {
    public static void main(String[] args) {
        

        int numbers[] = {1, 9, 2, 8, 3, 5, 4};
        int target = 2;

        for (int i = 0 ; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.println("Element found at index: " + i);
            }
        }


    }
}