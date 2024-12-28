import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class User {
    private String name;
    private int age;
    private ArrayList<String> borrowedBooks;
    private Map<String, LocalDate> borrowedBooksDueDates;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.borrowedBooks = new ArrayList<>();
        this.borrowedBooksDueDates = new HashMap<>();
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
        borrowedBooks.add(bookTitle);
        borrowedBooksDueDates.put(bookTitle, LocalDate.now().plusDays(14)); // Set due date 14 days from now
    }

    public void returnBook(String bookTitle) {
        if (borrowedBooks.remove(bookTitle)) {
            borrowedBooksDueDates.remove(bookTitle);
            System.out.println(name + " has returned " + bookTitle);
        } else {
            System.out.println(name + " did not borrow " + bookTitle);
        }
    }

    public void checkDueDates() {
        for (String book : borrowedBooks) {
            LocalDate dueDate = borrowedBooksDueDates.get(book);
            System.out.println("Book: " + book + ", Due Date: " + dueDate);
        }
    }

    public void checkOverdueBooks() {
        for (String book : borrowedBooks) {
            LocalDate dueDate = borrowedBooksDueDates.get(book);
            long daysOverdue = LocalDate.now().until(dueDate).getDays();
            if (daysOverdue < 0) {
                System.out.println(book + " is overdue by " + Math.abs(daysOverdue) + " days.");
            }
        }
    }

    public ArrayList<String> getBorrowedBooks() {
        return borrowedBooks;
    }
}