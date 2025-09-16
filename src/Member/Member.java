package Member;

import LibraryItem.Borrowable;

import java.util.UUID;

public class Member implements Borrowable {
    public enum MemberRoles {
        STUDENT, TEACHER, LIBRARIAN
    }

    UUID uuid = UUID.randomUUID();
    protected String name;
    protected String memberId = uuid.toString();
    protected MemberRoles memberRole;

    public Member(MemberRoles memberRole, String name) {
        this.memberRole = memberRole;
        this.name = name;
    }

    @Override
    public void borrowBook() {
        System.out.println("book borrowed");
    }

    @Override
    public void returnBook() {
        System.out.println("book returned");
    }

    public void getMemberDetails() {
        String returnString = "Member name is " + name + " and member id is " + memberId;
        System.out.println(returnString);
    }
}
