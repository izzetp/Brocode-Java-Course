public class Ternary_Operator {
    public static void main(String[] args) {

        // ternary operatyor ? = return 1 of 2 values if a condition true

        // variable = (condition) ? ifTrue : ifFlalse

        int score = 55;

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";

        System.out.println(passOrFail);

        int number = 3;

        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

        System.out.println(evenOrOdd);

        int hours = 13;

        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";

        System.out.println(timeOfDay);

        int income = 60000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(taxRate);




    }
}
