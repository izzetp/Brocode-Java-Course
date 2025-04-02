public class Methods {
    public static void main(String[] args) {
        
        String name = "Bro";
        String first = "Dave";
        String last = "Smith";

        int age = 25;

        happyBirthday(name, age);
        happyBirthday(name, age);
    
        double result = square(3);
        System.out.println(result);
        System.out.println(cube(3));

        System.out.println(getFullName(first, last));

        if (ageCheck(age)) {
            System.out.println("You may sign up!");
        } else {
            System.out.println("You may not sign up");

        }
    }

    static void happyBirthday(String name, int age) {
        System.out.println("Happy Brithday to you!");
        System.out.printf("Happy birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
    }

    static double square(double number) {
        return number * number;

    }
    static double cube(double number) {
        return number * number * number;
    }

    static String getFullName(String first, String last) {
        return first + " " + last;
    }

    static boolean ageCheck(int age) {
        if (age >= 18)  {
            return true;
        } else {
            return false;
        }
    }
}
