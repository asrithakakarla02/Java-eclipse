public class StringSplit {
    public static void main(String[] args) {
        String str = "apple,banana,cherry,date";

        // 1. Using split(String regex)
        String[] fruitsArray = str.split(","); // Splits the string by comma
        System.out.println("Fruits Array (split by comma):");
        for (String fruit : fruitsArray) {
            System.out.println(fruit);
        }

        // 2. Using split(String regex, int limit)
        String[] limitedFruitsArray = str.split(",", 2); // Splits the string by comma with a limit of 2
        System.out.println("\nLimited Fruits Array (split by comma with limit 2):");
        for (String fruit : limitedFruitsArray) {
            System.out.println(fruit);
        }

        // 3. Using String.join(CharSequence delimiter, CharSequence... elements)
        String joinedFruits = String.join(" | ", fruitsArray); // Joins the array elements with " | "
        System.out.println("\nJoined Fruits String:");
        System.out.println(joinedFruits);
    }
}
