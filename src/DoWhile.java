import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int number;

	        do {
	            System.out.print("Enter a number greater than 0: ");
	            number = scanner.nextInt();
	        } while (number <= 0);

	        System.out.println("You entered: " + number);
	        scanner.close();
	    }
	}
