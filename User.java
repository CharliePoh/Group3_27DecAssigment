import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class User {
    private String name;
    private int age;
    private ArrayList<String> borrowedBooks = new ArrayList<>();
    private Map<String, LocalDate> borrowedBooksDueDates = new HashMap<>();

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void borrowBook(String bookTitle) {
        if (borrowedBooks.contains(bookTitle)) {
            System.out.println("You have already borrowed this book.");
            return;
        }
        borrowedBooks.add(bookTitle);
        LocalDate dueDate = LocalDate.now().plusDays(14); 
        borrowedBooksDueDates.put(bookTitle, dueDate);
        System.out.println("Book borrowed: " + bookTitle + ". Due date: " + dueDate);
    }

    public void returnBook(String bookTitle) {
        if (borrowedBooks.remove(bookTitle)) {
            borrowedBooksDueDates.remove(bookTitle);
            System.out.println("Book returned successfully: " + bookTitle);
        } else {
            System.out.println("You have not borrowed this book: " + bookTitle);
        }
    }

    public void printBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            System.out.println("Borrowed books: ");
            for (String book : borrowedBooks) {
                System.out.println("- " + book);
            }
        }
    }

    public void checkDueDates() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books to check due dates for.");
        } else {
            for (Map.Entry<String, LocalDate> entry : borrowedBooksDueDates.entrySet()) {
                System.out.println("Book: " + entry.getKey() + ", Due Date: " + entry.getValue().toString());
            }
        }
    }

    
    public void checkOverdueBooks() {
        LocalDate today = LocalDate.now();
        boolean hasOverdue = false;
        for (Map.Entry<String, LocalDate> entry : borrowedBooksDueDates.entrySet()) {
            LocalDate dueDate = entry.getValue();
            if (dueDate.isBefore(today)) {
                hasOverdue = true;
                long overdueDays = today.toEpochDay() - dueDate.toEpochDay();
                System.out.println("Overdue Book: " + entry.getKey() + ", Overdue by: " + overdueDays + " days.");
            }
        }
        if (!hasOverdue) {
            System.out.println("No overdue books.");
        }
    }
}
