import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class OnlineShopping {
    private List<String> cart;
    private List<Double> prices;

    public OnlineShopping() {
        cart = new ArrayList<>();
        prices = new ArrayList<>();
    }

    public void addItem(String item, double price) {
        cart.add(item);
        prices.add(price);
        System.out.println(item + " has been added to your cart.");
    }

    public void displayCart() {
        System.out.println("Items in your cart:");
        for (int i = 0; i < cart.size(); i++) {
            System.out.println(cart.get(i) + " - $" + prices.get(i));
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    public static void main(String[] args) {
        OnlineShopping shopping = new OnlineShopping();
        Scanner scanner = new Scanner(System.in);
        String item;
        double price;

        while (true) {
            System.out.print("Enter item name (or 'exit' to finish): ");
            item = scanner.nextLine();
            if (item.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Enter item price: ");
            price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            shopping.addItem(item, price);
        }

        shopping.displayCart();
        System.out.println("Total price: $" + shopping.calculateTotal());
        scanner.close();
    }
}
