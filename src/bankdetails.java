public class bankdetails {
    double balance;
    
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    
    void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Cannot withdraw. Insufficient balance.");
        }
    }
    
    void showBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        bankdetails myAccount = new bankdetails();
        
        myAccount.deposit(1000);  
        myAccount.withdraw(500);   
        myAccount.withdraw(700);   
        myAccount.showBalance();  
    }
}
