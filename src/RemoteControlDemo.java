abstract class Remote {
    public abstract void turnOn();
    public abstract void turnOff();
    
    public void showPowerStatus(boolean isOn) {
        System.out.println("Device is " + (isOn ? "ON" : "OFF"));
    }
}

class TVRemote extends Remote {
    
    public void turnOn() {
        System.out.println("Turning on TV...");
        showPowerStatus(true);
    }
    
    
    public void turnOff() {
        System.out.println("Turning off TV...");
        showPowerStatus(false);
    }
}


class ACRemote extends Remote {
    public void turnOn() {
        System.out.println("Turning on AC...");
        showPowerStatus(true);
    }
    
    public void turnOff() {
        System.out.println("Turning off AC...");
        showPowerStatus(false);
    }
}

public class RemoteControlDemo {
    public static void main(String[] args) {
        Remote tv = new TVRemote();
        Remote ac = new ACRemote();
        
        tv.turnOn();    
        ac.turnOn();    
        
        tv.turnOff();   
        ac.turnOff();   
    }
}
