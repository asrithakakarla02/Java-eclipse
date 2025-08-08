public class Employee {
    private String name;      // Employee name
    private double salary;    // Employee salary (hidden)

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to get the employee's name
    public String getName() {
        return name;
    }

    // Method to access the salary (with a simple check)
    public double getSalary(String password) {
        if (password.equals("secret")) { // Simple password check
            return salary;
        } else {
            System.out.println("Access denied: Invalid password.");
            return -1; // Indicate access denied
        }
    }

    // Main method
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 50000);
        
        System.out.println("Employee Name: " + emp.getName());
        
        // Attempt to access salary
        double salary = emp.getSalary("wrongPassword"); // Invalid password
        if (salary != -1) {
            System.out.println("Employee Salary: " + salary);
        }

        salary = emp.getSalary("secret"); // Valid password
        if (salary != -1) {
            System.out.println("Employee Salary: " + salary);
        }
    }
}
