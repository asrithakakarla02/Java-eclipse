public class StringManipulationExample {
    public static void main(String[] args) {
        String str = "   Hello, World!   ";

        // 1. Using trim()
        String trimmedString = str.trim(); // Removes leading and trailing whitespace
        System.out.println("Trimmed String: '" + trimmedString + "'");

        // 2. Using replace(char oldChar, char newChar)
        String replacedCharString = str.replace('o', '0'); // Replaces 'o' with '0'
        System.out.println("Replaced 'o' with '0': " + replacedCharString);

        // 3. Using replace(CharSequence target, CharSequence replacement)
        String replacedSubstringString = str.replace("World", "Java"); // Replaces "World" with "Java"
        System.out.println("Replaced 'World' with 'Java': " + replacedSubstringString);

        // 4. Using replaceAll(String regex, String replacement)
        String replacedAllString = str.replaceAll("\\s+", "_"); // Replaces all whitespace with '_'
        System.out.println("Replaced all whitespace with '_': " + replacedAllString);

        // 5. Using replaceFirst(String regex, String replacement)
        String replacedFirstString = str.replaceFirst("o", "0"); // Replaces the first 'o' with '0'
        System.out.println("Replaced first 'o' with '0': " + replacedFirstString);
    }
}

