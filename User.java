import java.util.ArrayList;
public class User {
    private String name;
    private int age;
    private ArrayList<String> borrowedBooks =new ArrayList<String>();
    public User(String name, int age) {

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
    public void borrowBook(String bookTittle) {
        borrowedBooks.add(bookTittle);
        System.out.println(bookTittle + " borrow successful");
    }
    public void returnBook(String bookTittle) {
        borrowedBooks.remove(bookTittle);
        System.out.println(bookTittle + " has been returned");
    }
    public void printBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            System.out.println("Borrowed Books:");
            for (String book : borrowedBooks) {
                System.out.println("- " + book);
            }
        }
    }

}
