public class Variable_Scope {

    static int x = 3;
    public static void main(String[] args) {
        
        int x = 1;

        System.out.println(x);
    }

    static void doSomething() {
        int x = 2;

        System.out.println(x);
    }
}
