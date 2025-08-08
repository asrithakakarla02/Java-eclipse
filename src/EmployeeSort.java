import java.util.*;

public class EmployeeSort {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 50000));
        employees.add(new Employee("Bob", 40000));
        employees.add(new Employee("Charlie", 60000));

        // Sort employees by salary in ascending order using lambda
        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));

        // Print sorted employees
        for (Employee emp : employees) {
            System.out.println(emp.name + " - " + emp.salary);
        }
    }

    // Employee class as an inner class
    static class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
    }
}
