public class Variable_Scope {

    static int x = 3; //class
    public static void main(String[] args) {
        
        int x = 1; //local

        System.out.println(x);

        doSomething();
    }

    static void doSomething() {
        int x = 2; // local

        System.out.println(x);
    }
}
