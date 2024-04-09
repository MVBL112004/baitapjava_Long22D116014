package library;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("B001", "Java Programming", "John Doe", "978-3-16-148410-0");
        Book book2 = new Book("B002", "Python Programming", "Jane Smith", "978-3-16-148411-0");

        Member member1 = new Member("M001", "Alice", "alice@example.com");
        Member member2 = new Member("M002", "Bob", "bob@example.com");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.registerMember(member1);
        library.registerMember(member2);

        library.borrowBook("B001", "M001");
        library.borrowBook("B002", "M002");

        library.returnBook("B001", "M001");
    }
}



