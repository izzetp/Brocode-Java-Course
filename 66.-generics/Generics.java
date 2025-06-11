import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {

        Product<String, Double> product1 = new Product<>("Apple", 0.50);
        Product<String, Integer> product2 = new Product<>("Ticket", 15);


        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());




    }
}