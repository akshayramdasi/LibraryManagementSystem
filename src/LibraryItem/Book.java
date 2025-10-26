package LibraryItem;

public class Book implements Borrowable {
    private String title;
    private Author author;
    private String isbn;
    private int publicationYear;

    public Book(String title, Author author, String isbn, int publicationYear) {
        super();
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public void borrowBook() {
        System.out.println("book borrowed");
    }

    @Override
    public void returnBook() {
        System.out.println("book returned");
    }

    public void getBookDetails() {
        String returnString = " " + title + " by " + author.getAuthorName() + " published in " + publicationYear;
        System.out.println(returnString);
    }
}
