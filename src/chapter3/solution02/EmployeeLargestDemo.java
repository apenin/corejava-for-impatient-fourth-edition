package chapter3.solution02;

import chapter3.solution01.Measurable;

public class EmployeeLargestDemo {
    public static void main(String[] args) {
        Employee sam = new Employee("Sam", 40000);
        Employee bob = new Employee("Bob", 50000);
        Employee peter = new Employee("Peter", 75000);

        Measurable[] employees = { sam, bob, peter };
        System.out.printf("Average salary: %.2f%n", Employee.average(employees));

        Employee employee = (Employee) Employee.largest(employees);
        String name = employee != null ? employee.name() : "";
        System.out.println("The name of the employee with the largest salary: " + name);
    }
}
