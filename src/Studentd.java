public class Studentd {
    // Default constructor (no parameters)
    Studentd() {
        System.out.println("Default constructor called");
    }

    // Method to display message
    void display() {
        System.out.println("Welcome to Java!");
    }

    public static void main(String[] args) {
        // Creating object — this calls the default constructor
        Studentd s1 = new Studentd();
        s1.display();
    }
}
