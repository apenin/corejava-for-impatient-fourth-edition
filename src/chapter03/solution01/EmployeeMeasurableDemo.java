package chapter03.solution01;

public class EmployeeMeasurableDemo {
    public static void main(String[] args) {
        Employee sam = new Employee("Sam", 40000);
        Employee bob = new Employee("Bob", 50000);
        Employee peter = new Employee("Peter", 75000);

        Measurable[] employees = { sam, bob, peter };
        System.out.printf("Average salary: %.2f%n", Employee.average(employees));
    }
}
