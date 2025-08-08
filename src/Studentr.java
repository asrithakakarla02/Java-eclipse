public class Studentr {
    String name;
    int age;

    Studentr() {
        name = "Unknown";
        age = 0;
    }

    Studentr(String n) {
        name = n;
        age = 0;
    }

    Studentr(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Studentr s1 = new Studentr();
        Studentr s2 = new Studentr("Asritha");
        Studentr s3 = new Studentr("Lakshmi", 22);

        s1.display();
        s2.display();
        s3.display();
    }
}
