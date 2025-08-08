abstract class Payment {
    double amount;
    Payment(double amt) { this.amount = amt; }
    abstract void pay();
}

class CreditCard extends Payment {
    CreditCard(double amt) { super(amt); }
    void pay() { System.out.println("Paid $" + amount + " via Credit Card"); }
}

class UPI extends Payment {
    UPI(double amt) { super(amt); }
    void pay() { System.out.println("Paid $" + amount + " via UPI"); }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment card = new CreditCard(100.50);
        Payment upi = new UPI(55.75);
        
        card.pay();
        upi.pay();
    }
}
