package Book;

import java.util.Scanner;

public class Book {
    String title;
    String author;
    String ISBN;
    int publicationYear;
    
    public void enterBookDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book details");
        System.out.println("Enter book title");
        this.title = scanner.nextLine();
        System.out.println("Enter author of book");
        this.author = scanner.nextLine();
        System.out.println("Enter book ISBN");
        this.ISBN = scanner.nextLine();
        System.out.println("Enter publication year of book");
        this.publicationYear = scanner.nextInt();
        scanner.close();
        System.out.println("Book details saved");
    }

    public void getBookDetails() {
        System.out.println("title:" + this.title);
        System.out.println("author:" + this.author);
        System.out.println("ISBN:" + this.ISBN);
        System.out.println("publication:" + this.publicationYear);
    }

}
