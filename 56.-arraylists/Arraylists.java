import java.util.ArrayList;
import java.util.Collections;

public class Arraylists {
    public static void main(String[] args) {
        
        ArrayList<Integer> list1 = new ArrayList();

        list1.add(3);
        list1.add(1);
        list1.add(2);

        System.out.println(list1);

        ArrayList<Double> list2 = new ArrayList();

        list2.add(3.1);
        list2.add(1.1);
        list2.add(2.1);

        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList();

        list3.add("Apple");
        list3.add("Orange");
        list3.add("Banana");
        list3.add("Coconut");

        list3.set(1, "Pear");

        list3.remove(0);

        System.out.println(list3.get(2));
        System.out.println(list3.size());
        Collections.sort(list3);

        System.out.println(list3);

        for(String fruit : list3) {
            System.out.println(fruit);
        }

    }
}
