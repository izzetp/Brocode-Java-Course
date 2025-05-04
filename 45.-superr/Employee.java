public class Employee extends Personn {

    int salary;

    Employee(String first, String last, int salary) {
        super(first, last);
        this.salary = salary;
    }

    void showSalary() {
        System.out.println(this.first + "'s salasry is $" + this.salary);
    }
}