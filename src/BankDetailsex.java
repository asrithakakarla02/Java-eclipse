public class BankDetailsex {
    private double balance;  

   
    public BankDetailsex(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Error: Initial balance cannot be negative. Set to 0.");
            this.balance = 0;
        }
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount. Must be positive.");
        }
    }

    
    public double getBalance() {
        return balance;
    }

    
    public static void main(String[] args) {
        BankDetailsex account = new BankDetailsex(100.0);
        
        System.out.println("Initial balance: $" + account.getBalance());
        
       
        account.deposit(50.0);  
        account.deposit(-10.0); 
        
        System.out.println("Final balance: $" + account.getBalance());
    }
}
