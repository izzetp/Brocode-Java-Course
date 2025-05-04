public class Superr {
    public static void main(String[] args) {
        
        Personn person = new Personn("Tom", "Riddle");
        Studentt student = new Studentt("Harry", "Potter", 3.25);
        Employee employee = new Employee("Rubeus", "Hagrid", 50000);

        person.showName();
        System.out.println(student.gpa);
        student.showGPA();
        employee.showSalary();

    }
}
