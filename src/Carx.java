public class Carx {
    // No constructor written here
    void display() {
        System.out.println("Car is running");
    }

    public static void main(String[] args) {
        Carx c = new Carx();  // implicit default constructor is called
        c.display();
    }
}
