import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        
        Box<String> box = new Box<>();

        box.setItem("banana");

        System.out.println(box.getItem());

    }
}