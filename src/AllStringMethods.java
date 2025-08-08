public class AllStringMethods {
    public static void main(String[] args) {
        // Setup strings
        String str = "   Hello, World!   ";
        String compareStr = "hello, world!";
        String numbers = "123";
        
        // Demonstration of all methods
        System.out.println("Original: '" + str + "'");
        System.out.println("length(): " + str.length());
        System.out.println("charAt(4): '" + str.charAt(4) + "'");
        System.out.println("substring(5): '" + str.substring(5) + "'");
        System.out.println("substring(3,8): '" + str.substring(3,8) + "'");
        System.out.println("concat(): '" + str.concat(" How are you?") + "'");
        System.out.println("equals(): " + str.equals(compareStr));
        System.out.println("equalsIgnoreCase(): " + str.equalsIgnoreCase(compareStr));
        System.out.println("compareTo(): " + str.compareTo(compareStr));
        System.out.println("compareToIgnoreCase(): " + str.compareToIgnoreCase(compareStr));
        System.out.println("indexOf('o'): " + str.indexOf('o'));
        System.out.println("indexOf(\"World\"): " + str.indexOf("World"));
        System.out.println("lastIndexOf('o'): " + str.lastIndexOf('o'));
        System.out.println("contains(\"World\"): " + str.contains("World"));
        System.out.println("startsWith(\"Hello\"): " + str.startsWith("Hello"));
        System.out.println("endsWith(\"!\"): " + str.endsWith("! "));
        System.out.println("toLowerCase(): '" + str.toLowerCase() + "'");
        System.out.println("toUpperCase(): '" + str.toUpperCase() + "'");
        System.out.println("trim(): '" + str.trim() + "'");
        System.out.println("replace('o', '0'): '" + str.replace('o', '0') + "'");
        System.out.println("replace(\"World\", \"Java\"): '" + str.replace("World", "Java") + "'");
        System.out.println("replaceAll(\"\\\\s+\", \"_\"): '" + str.replaceAll("\\s+", "_") + "'");
        System.out.println("replaceFirst(\"o\", \"0\"): '" + str.replaceFirst("o", "0") + "'");
        
        char[] chars = str.toCharArray();
        System.out.print("toCharArray(): ");
        for (char c : chars) System.out.print(c + " ");
        System.out.println();
        
        System.out.println("String.valueOf(123): " + String.valueOf(numbers));
        
        System.out.print("getBytes(): ");
        for (byte b : str.getBytes()) System.out.print(b + " ");
        System.out.println();
        
        String[] split = str.trim().split(",");
        System.out.println("split(\",\"): " + Arrays.toString(split));
        
        System.out.println("String.join(\"-\", split): " + String.join("-", split));
        System.out.println("matches(\".*World.*\"): " + str.matches(".*World.*"));
        
        String interned = str.intern();
        System.out.println("intern(): " + (str == interned));
        System.out.println("isEmpty(): " + str.isEmpty());
        System.out.println("isBlank(): " + str.isBlank());
    }
}
