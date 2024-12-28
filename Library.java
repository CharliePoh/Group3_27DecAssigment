import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
 
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Book not found
    }

    public void borrowBook(User user, String title) {
        Book book = searchByTitle(title);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            user.borrowBook(title);
            System.out.println(user.getName() + " has borrowed " + title);
        } else {
            System.out.println("Book not available or does not exist.");
        }
    }

    public void returnBook(User user, String title) {
        Book book = searchByTitle(title);
        if (book != null) {
            if (user.getBorrowedBooks().contains(title)) {
                book.setAvailable(true);
                user.returnBook(title);
            } else {
                System.out.println(user.getName() + " did not borrow " + title);
            }
        } else {
            System.out.println("Book does not exist.");
        }
    }

    public void listAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle());
            }
        }
    }
}