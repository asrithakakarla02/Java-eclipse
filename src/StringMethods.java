public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // 1. Using length()
        int length = str.length();
        System.out.println("Length of the String: " + length);

        // 2. Using charAt(int index)
        char characterAtIndex = str.charAt(7); // Gets the character at index 7
        System.out.println("Character at index 7: " + characterAtIndex);

        // 3. Using substring(int beginIndex)
        String substringFromIndex = str.substring(7); // Gets substring from index 7 to end
        System.out.println("Substring from index 7: " + substringFromIndex);

        // 4. Using substring(int beginIndex, int endIndex)
        String substringBetweenIndices = str.substring(0, 5); // Gets substring from index 0 to 4
        System.out.println("Substring from index 0 to 5: " + substringBetweenIndices);

        // 5. Using concat(String str)
        String concatenatedString = str.concat(" How are you?"); // Concatenates another string
        System.out.println("Concatenated String: " + concatenatedString);
    }
}
