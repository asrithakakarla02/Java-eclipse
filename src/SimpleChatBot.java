import java.util.Scanner;

public class SimpleChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Chatbot: Hi! I'm a simple chatbot. Type 'bye' to exit.");
        
        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase().trim();
            
            if (input.contains("bye") || input.contains("exit")) {
                System.out.println("Chatbot: Goodbye! Have a nice day!");
                break;
            }
            else if (input.contains("hi") || input.contains("hello")) {
                System.out.println("Chatbot: Hello there!");
            }
            else if (input.contains("how are you")) {
                System.out.println("Chatbot: I'm good, thanks! How about you?");
            }
            else if (input.contains("name")) {
                System.out.println("Chatbot: I'm just a simple Java program!");
            }
            else if (input.contains("thank")) {
                System.out.println("Chatbot: You're welcome!");
            }
            else {
                System.out.println("Chatbot: I didn't understand that. Try saying hello!");
            }
        }
        scanner.close();
    }
}
