abstract class Notification {
    abstract void send();
}

class Email extends Notification {
    void send() { System.out.println("Sending email"); }
}

class SMS extends Notification {
    void send() { System.out.println("Sending SMS"); }
}

public class Notify {
    public static void main(String[] args) {
        Notification email = new Email();
        Notification sms = new SMS();
        
        email.send();  
        sms.send();    
    }
}
