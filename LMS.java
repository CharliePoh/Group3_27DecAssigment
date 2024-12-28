
public class LMS {
    public static void main(String[] args) {
        
        Library library = new Library();

        Book book1 = new Book("Book1", "F. Scott Fitzgerald", "9780743273565", true);
        Book book2 = new Book("Book2", "George Orwell", "9780451524935", true);
        Book book3 = new Book("Book3", "Harper Lee", "9780061120084", true);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        User user1 = new User("Alice", 25);
        User user2 = new User("Bob", 30);

        library.borrowBook(user1, "Book1");
        library.borrowBook(user2, "Book2");

        user1.checkDueDates();
        user2.checkDueDates();

        user1.checkOverdueBooks();
        user2.checkOverdueBooks();

        System.out.println("Available books:");
        library.listAvailableBooks();

        library.returnBook(user1, "Book1");

        System.out.println("Available books after return:");
        library.listAvailableBooks();
    }
}