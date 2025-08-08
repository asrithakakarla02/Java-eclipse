import java.util.Scanner;

interface MathOperation {
    int operate(int a, int b);
}

public class LambdaOperationsWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        
        System.out.print("Enter first number: ");
        int x = scanner.nextInt();

        System.out.print("Enter second number: ");
        int y = scanner.nextInt();

        
        MathOperation addition = (a, b) -> a + b;

        
        MathOperation subtraction = (a, b) -> a - b;

        
        MathOperation multiplication = (a, b) -> a * b;

        
        System.out.println("Addition: " + addition.operate(x, y));
        System.out.println("Subtraction: " + subtraction.operate(x, y));
        System.out.println("Multiplication: " + multiplication.operate(x, y));

        scanner.close(); 
    }
}
