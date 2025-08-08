public class BankAccount {
    
    static double calculateInterest(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        double interest = BankAccount.calculateInterest(10000, 5.5, 2);

        System.out.println("Interest Amount: ₹" + interest);
    }
}
