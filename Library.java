import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void searchByTitle(String title) {
        boolean found = false; 
        for (Book book : books) {
            if (book.getTittle().toLowerCase().contains(title.toLowerCase())) {
                book.printBookInfo();
                found = true;
            }
            if (!found) {
                System.out.println("No books found with the title containing: " + title);
            }
        }
    }

}


