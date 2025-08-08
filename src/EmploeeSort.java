import java.util.*;

public class EmploeeSort {
    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 50000));
        employees.add(new Employee("Bob", 40000));
        employees.add(new Employee("Charlie", 60000));

        
        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));

        
        for (Employee emp : employees) {
            System.out.println(emp.name + " - " + emp.salary);
        }
    }

    
    static class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
    }
}
