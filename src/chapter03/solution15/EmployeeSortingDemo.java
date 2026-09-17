package chapter03.solution15;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeSortingDemo {
    public static void main(String[] args) {
        Employee bob = new Employee("Bob", 75000);
        Employee tom = new Employee("Tom", 75000);
        Employee mary = new Employee("Mary", 50000);
        Employee susan = new Employee("Susan", 50000);

        Employee[] employees = { bob, tom, mary, susan };
        System.out.println("Before sorting: " + Arrays.toString(employees));

        Arrays.sort(employees, Comparator
                                 .comparingDouble(Employee::salary)
                                 .thenComparing(Employee::name));
        System.out.println("After direct sorting: " + Arrays.toString(employees));

        Arrays.sort(employees, Comparator
                                 .comparingDouble(Employee::salary)
                                 .thenComparing(Employee::name)
                                 .reversed());
        System.out.println("After reverse sorting: " + Arrays.toString(employees));
    }
}
