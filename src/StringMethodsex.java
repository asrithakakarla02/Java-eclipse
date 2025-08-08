public class StringMethodsex {
    public static void main(String[] args) {
        String str = "Hello, World! Welcome to Java programming.";

        
        int indexOfChar = str.indexOf('W'); 
        System.out.println("Index of 'W': " + indexOfChar);

        
        int indexOfSubstring = str.indexOf("World"); 
        System.out.println("Index of 'World': " + indexOfSubstring);

        
        int lastIndexOfSubstring = str.lastIndexOf("o"); 
        System.out.println("Last index of 'o': " + lastIndexOfSubstring);

        
        boolean containsSubstring = str.contains("Welcome"); 
        System.out.println("Contains 'Welcome': " + containsSubstring);

        
        boolean startsWithHello = str.startsWith("Hello"); 
        System.out.println("Starts with 'Hello': " + startsWithHello);

       
        boolean endsWithProgramming = str.endsWith("programming."); 
        System.out.println("Ends with 'programming.': " + endsWithProgramming);
    }
}
