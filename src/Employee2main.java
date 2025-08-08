class Employee2 {
    String name;
    Employee2(String n) { name = n; }
    void work() { System.out.println(name + " is working"); }
}

class Manager extends Employee2 {
    Manager(String n) { super(n); }
    void manage() { System.out.println(name + " is managing"); }
}

class Developer extends Employee2 {
    Developer(String n) { super(n); }
    void code() { System.out.println(name + " is coding"); }
}

public class Employee2main {
    public static void main(String[] args) {
        Employee2 emp = new Employee2("John");
        Manager mgr = new Manager("Sarah");
        Developer dev = new Developer("Mike");
        
        emp.work();
        mgr.work();  // Inherited from Employee2
        mgr.manage();
        dev.work();  // Inherited from Employee2
        dev.code();
    }
}
