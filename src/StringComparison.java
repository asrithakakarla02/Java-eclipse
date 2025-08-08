public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "hello, world!";
        String str3 = "Hello, World!";
        String str4 = "Hello, Java!";

        // 1. Using equals(Object another)
        boolean isEqual = str1.equals(str3); // Checks if str1 is equal to str3
        System.out.println("str1 equals str3: " + isEqual);

        // 2. Using equalsIgnoreCase(String another)
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); // Checks equality ignoring case
        System.out.println("str1 equals str2 (ignore case): " + isEqualIgnoreCase);

        // 3. Using compareTo(String another)
        int comparisonResult = str1.compareTo(str4); // Compares str1 with str4
        System.out.println("Comparison of str1 and str4: " + comparisonResult);

        // 4. Using compareToIgnoreCase(String str)
        int comparisonIgnoreCaseResult = str1.compareToIgnoreCase(str2); // Compares ignoring case
        System.out.println("Comparison of str1 and str2 (ignore case): " + comparisonIgnoreCaseResult);
    }
}

