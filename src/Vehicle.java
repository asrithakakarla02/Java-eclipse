// Base Vehicle class
class Vehicle {
    void startEngine() {
        System.out.println("Engine starting...");
    }
}

// Car subclass
class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine starting with key");
    }
}

// Bike subclass
class Bike extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Bike engine starting with kick");
    }
}

// Main class (now named Vehicle)
public class Vehicle {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        
        car.startEngine();
        bike.startEngine();
    }
}
