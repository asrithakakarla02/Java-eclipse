public class Student {
    
    String name;
    int marks;

    
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    
    static void welcomeMessage() {
        System.out.println("Welcome to Student Portal!");
    }

    public static void main(String[] args) {
       
        Student.welcomeMessage();

       
        Student s1 = new Student();
        s1.name = "Asritha";
        s1.marks = 90;

      
        s1.displayDetails();
    }
}
