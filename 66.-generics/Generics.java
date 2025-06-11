import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        
        Box<String> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();

        box1.setItem("banana");
        box2.setItem(1);

        System.out.println(box1.getItem());
        System.out.println(box2.getItem());

        Product<String, Double> product = new Product<>("Apple", 0.50);



    }
}