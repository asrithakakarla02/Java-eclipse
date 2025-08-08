public class RecieptGeneratorex {
    public static void main(String[] args) {
        StringBuilder receipt = new StringBuilder();

       
        receipt.append("********** Receipt **********\n");
        receipt.append("Item\t\tPrice\n");
        receipt.append("-----------------------------\n");

        
        receipt.append("milkybar\t\t$1.00\n");
        receipt.append("dairymilk\t\t$0.50\n");
        receipt.append("kitkat\t\t$0.75\n");

        
        receipt.append("-----------------------------\n");
        receipt.append("Total:\t\t$2.25\n");
        receipt.append("Thank you for your purchase!\n");
        receipt.append("*****************************\n");

       
        System.out.println(receipt.toString());
    }
}
