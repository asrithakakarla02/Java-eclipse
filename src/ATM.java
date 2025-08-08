import java.util.Scanner;

class InvalidPinException extends Exception {
    public InvalidPinException(String message) {
        super(message);
    }
}

public class ATM {
    private final int correctPin = 1234; 
    
    
    public void start() {
        System.out.println(" Welcome to Simple ATM");
        Scanner scanner = new Scanner(System.in);
        
        try {
            insertCard();
            verifyPin(scanner);
            performTransaction();
        } catch (InvalidPinException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            logTransaction();
            scanner.close();
            System.out.println(" Session ended");
        }
    }
    
    private void insertCard() {
        System.out.println(" Card inserted successfully");
    }
    
    private void verifyPin(Scanner sc) throws InvalidPinException {
        System.out.print(" Enter your 4-digit PIN: ");
        int enteredPin = sc.nextInt();
        
        if (enteredPin != correctPin) {
            throw new InvalidPinException("Invalid PIN entered!");
        }
        System.out.println(" PIN verified");
    }
    
    private void performTransaction() {
        System.out.println(" Transaction in progress...");
    }
    
    private void logTransaction() {
        System.out.println(" Transaction logged in system");
    }

    public static void main(String[] args) {
        new ATM().start();
    }
}
