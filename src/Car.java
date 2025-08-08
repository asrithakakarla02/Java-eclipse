public class Car {
    private boolean engineStatus; 
    private int speed;            
    private int fuelLevel;         

    public Car() {
        this.engineStatus = false; 
        this.speed = 0;            
        this.fuelLevel = 100;      
    }

    public void startEngine() {
        engineStatus = true;
        System.out.println("Engine started.");
    }

    public void stopEngine() {
        engineStatus = false;
        speed = 0; 
        System.out.println("Engine stopped.");
    }

    public void accelerate(int increment) {
        if (engineStatus && fuelLevel > 0) {
            speed += increment;
            fuelLevel -= increment / 10; 
            if (fuelLevel < 0) fuelLevel = 0; 
            System.out.println("Accelerated to " + speed + " km/h. Fuel level: " + fuelLevel + "%");
        } else {
            System.out.println("Cannot accelerate. Start the engine or check fuel level.");
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine(); 
        myCar.accelerate(50); 
        myCar.stopEngine(); 
    }
}
