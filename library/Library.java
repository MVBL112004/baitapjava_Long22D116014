package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public void borrowBook(String bookId, String memberId) {
        Book bookToBorrow = findBookById(bookId);
        Member borrowingMember = findMemberById(memberId);

        if (bookToBorrow != null && borrowingMember != null && bookToBorrow.isAvailable()) {
            borrowingMember.borrowBook(bookToBorrow);
            bookToBorrow.setAvailable(false);
            System.out.println("Book successfully borrowed.");
        } else {
            System.out.println("Unable to borrow the book.");
        }
    }

    public void returnBook(String bookId, String memberId) {
        Book bookToReturn = findBookById(bookId);
        Member returningMember = findMemberById(memberId);

        if (bookToReturn != null && returningMember != null && !bookToReturn.isAvailable()) {
            returningMember.returnBook(bookToReturn);
            bookToReturn.setAvailable(true);
            System.out.println("Book successfully returned.");
        } else {
            System.out.println("Unable to return the book.");
        }
    }

    private Book findBookById(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }

    private Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }
}

