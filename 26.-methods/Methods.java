public class Methods {
    public static void main(String[] args) {
        
        String name = "Bro";
        int age = 25;

        happyBirthday(name, age);
        happyBirthday(name, age);
    }

    static void happyBirthday(String name, int age) {
        System.out.println("Happy Brithday to you!");
        System.out.printf("Happy birthday dear %s!\n", name);
        System.out.printf("You ar %d years old!\n", age);
    }
}
