import java.nio.charset.StandardCharsets;

public class StringConvertionEx {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // 1. Using toCharArray()
        char[] charArray = str.toCharArray(); // Converts the string to a character array
        System.out.print("Character Array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 2. Using String.valueOf(int value)
        int number = 123;
        String numberString = String.valueOf(number); // Converts the integer to a string
        System.out.println("String representation of the number: " + numberString);

        // 3. Using getBytes()
        byte[] byteArray = str.getBytes(StandardCharsets.UTF_8); // Converts the string to a byte array
        System.out.print("Byte Array: ");
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}
