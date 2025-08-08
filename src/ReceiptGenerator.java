import java.text.SimpleDateFormat;
import java.util.Date;

public class ReceiptGenerator {
    public static void main(String[] args) {
       
        StringBuffer receipt = new StringBuffer();
        
        
        receipt.append("══════════════════════════════\n");
        receipt.append("        SUPER STORE\n");
        receipt.append("  123 Main St, City, Country\n");
        receipt.append("  Phone: (123) 456-7890\n");
        receipt.append("══════════════════════════════\n\n");
        
       
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        receipt.append("Date: ").append(formatter.format(new Date())).append("\n");
        receipt.append("Transaction #: ").append(String.format("%06d", 12345)).append("\n");
        receipt.append("Cashier: Asritha\n");
        receipt.append("--------------------------------\n");
        
        
        receipt.append(String.format("%-20s %8s %8s %8s\n", 
                   "ITEM", "QTY", "PRICE", "TOTAL"));
        receipt.append("--------------------------------\n");
        
        
        addItem(receipt, "Kinderjoy", 2, 3.50);
        addItem(receipt, "Milkybar", 1, 2.75);
        addItem(receipt, "Dairy Milk", 1, 4.25);
        addItem(receipt, "Kit kat", 1.5, 2.99);
        
        receipt.append("--------------------------------\n");
        
        
        double subtotal = 13.74;
        double tax = subtotal * 0.1;
        double total = subtotal + tax;
        
        receipt.append(String.format("%-20s %8s %8.2f\n", "SUBTOTAL", "", subtotal));
        receipt.append(String.format("%-20s %8s %8.2f\n", "TAX (10%)", "", tax));
        receipt.append(String.format("%-20s %8s %8.2f\n", "TOTAL", "", total));
        
        receipt.append("\n══════════════════════════════\n");
        receipt.append("    THANK YOU FOR SHOPPING!\n");
        receipt.append("══════════════════════════════\n");
        
        
        System.out.println(receipt.toString());
    }
    
    
    private static void addItem(StringBuffer receipt, String name, 
                              double quantity, double price) {
        double itemTotal = quantity * price;
        receipt.append(String.format("%-20s %8.2f %8.2f %8.2f\n", 
                   name, quantity, price, itemTotal));
    }
}

