public class Overloaded_Methods {
    public static void main(String[] args) {
        
        System.out.println(add(1,2,3));

        String pizza = bakePizza("flat bread", "mozzarella");
    }
    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }

    static String bakePizzaString(String bread) {
        return bread + " pizza";
    }
    static String bakePizzaString(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
}