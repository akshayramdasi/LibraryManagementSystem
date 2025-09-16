import LibraryItem.Author;
import LibraryItem.Book;
import Member.Member;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author author = new Author("james", "fiction writer");
        System.out.println("Welcome to library");
        Book book = new Book("new", author, "IND12345", 1986);
        book.getBookDetails();
        Member member = new Member(Member.MemberRoles.STUDENT, "akshay");
        member.getMemberDetails();
    }
}