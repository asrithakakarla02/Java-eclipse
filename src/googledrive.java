import java.util.HashMap;
import java.util.Scanner;

public class googledrive {
    public static void main(String[] args) {
        HashMap<String, String> files = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Upload\n2. Download\n3. Exit");
        while(true) {
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            if(choice == 1) {
                System.out.print("Filename: ");
                String name = sc.nextLine();
                System.out.print("Content: ");
                files.put(name, sc.nextLine());
            }
            else if(choice == 2) {
                System.out.print("Filename: ");
                String content = files.get(sc.nextLine());
                System.out.println(content != null ? content : "File not found!");
            }
            else {
                break;
            }
        }
    }
}
