import java.util.HashMap;

public class Hashmaps {
    public static void main(String[] args) {
        
        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("banana", 0.75);
        map.put("banana", 0.25);

        System.out.println(map);
    }
}
