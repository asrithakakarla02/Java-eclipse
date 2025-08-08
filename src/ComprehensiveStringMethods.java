public class ComprehensiveStringMethods {
    public static void main(String[] args) {
        String str = "  Hello, Java!  ";
        int number = 123;

        //  Basic Methods
        System.out.println("Basic Methods");
        System.out.println("Length: " + str.length());
        System.out.println("Char at index 3: " + str.charAt(3));
        System.out.println("Substring from index 7: " + str.substring(7));
        System.out.println("Substring from index 7 to 11: " + str.substring(7, 11));
        System.out.println("Concatenated with ' Programming': " + str.concat(" Programming"));

        // Comparison Methods
        System.out.println("\n  Comparison Methods");
        System.out.println("Equals '  Hello, Java!  '? " + str.equals("  Hello, Java!  "));
        System.out.println("Equals ignore case '  hello, java!  '? " + str.equalsIgnoreCase("  hello, java!  "));
        System.out.println("Compare to 'Hello, Java!': " + str.compareTo("Hello, Java!"));
        System.out.println("Compare to ignore case 'hello, java!': " + str.compareToIgnoreCase("hello, java!"));

        //  Searching Methods
        System.out.println("\n Searching Methods");
        System.out.println("Index of 'J': " + str.indexOf('J'));
        System.out.println("Index of 'Java': " + str.indexOf("Java"));
        System.out.println("Last index of 'a': " + str.lastIndexOf('a'));
        System.out.println("Contains 'Java'? " + str.contains("Java"));
        System.out.println("Starts with '  He'? " + str.startsWith("  He"));
        System.out.println("Ends with '!'? " + str.endsWith("!"));

        //  Case Conversion
        System.out.println("\n  Case Conversion");
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());

        // Trimming and Replacing
        System.out.println("\n Trimming and Replacing");
        System.out.println("Trimmed: '" + str.trim() + "'");
        System.out.println("Replace 'a' with 'X': " + str.replace('a', 'X'));
        System.out.println("Replace 'Java' with 'World': " + str.replace("Java", "World"));
        System.out.println("Replace all 'a' with 'X': " + str.replaceAll("a", "X"));
        System.out.println("Replace first 'a' with 'X': " + str.replaceFirst("a", "X"));

        // Conversion
        System.out.println("\n Conversion");
        char[] charArray = str.toCharArray();
        System.out.print("Char array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println("\nString value of number: " + String.valueOf(number));
        byte[] bytes = str.getBytes();
        System.out.println("Byte array length: " + bytes.length);

        // Split and Join
        System.out.println("\n  Split and Join");
        String[] words = str.trim().split(" ");
        System.out.println("Split into words:");
        for (String word : words) {
            System.out.println("- " + word);
        }
        System.out.println("Joined with '-': " + String.join("-", words));

        //  Pattern Matching
        System.out.println("\n  Pattern Matching");
        System.out.println("Matches '.*Java.*'? " + str.matches(".*Java.*"));

        //  Interning and Emptiness
        System.out.println("\n  Interning and Emptiness");
        String internedStr = str.intern();
        System.out.println("Is empty? " + str.trim().isEmpty());
        System.out.println("Is blank? " + "   ".isBlank());
    }
}
