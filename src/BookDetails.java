import java.util.Scanner;

class Book {
    
    private String title;
    private String author;
    private String publisher;
    private int publicationYear;
    private String isbn;
    private double price;

   
    public void addBookDetails(String title, String author, String publisher, 
                             int publicationYear, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.isbn = isbn;
        this.price = price;
    }

    
    public void displayBookDetails() {
        System.out.println("\n===== Book Details =====");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("ISBN: " + isbn);
        System.out.println("Price: $" + price);
        System.out.println("=======================");
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        Book book1 = new Book();

       
        System.out.println("Enter Book Details:");
        System.out.print("Title: ");
        String title = scanner.nextLine();
        
        System.out.print("Author: ");
        String author = scanner.nextLine();
        
        System.out.print("Publisher: ");
        String publisher = scanner.nextLine();
        
        System.out.print("Publication Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        
        System.out.print("Price: $");
        double price = scanner.nextDouble();

        
        book1.addBookDetails(title, author, publisher, year, isbn, price);

        
        book1.displayBookDetails();

        scanner.close();
    }
}
