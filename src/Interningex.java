public class Interningex {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = new String("Hello, World!").intern(); // Interning a new String object
        String str3 = "   "; // A string with spaces

        // 1. Using intern()
        // Interning str2 to point to the same string literal as str1
        boolean isInternedEqual = str1 == str2; // Check if both references point to the same object
        System.out.println("Are str1 and str2 the same after interning? " + isInternedEqual);

        // 2. Using isEmpty()
        boolean isStr1Empty = str1.isEmpty(); // Checks if str1 is empty
        System.out.println("Is str1 empty? " + isStr1Empty);

        // 3. Using isBlank()
        boolean isStr3Blank = str3.isBlank(); // Checks if str3 is blank (only whitespace)
        System.out.println("Is str3 blank? " + isStr3Blank);
    }
}
