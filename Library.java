//Task 3: Create a Library Class

//Create a class called Library that:
//Has a private ArrayList<Book> to store all the books in the library.
//Implements a method addBook(Book book) to add books to the library.
//Implements a method searchByTitle(String title) that:
//Searches for books whose title contains the given string using the contains() method of the String class.
//Prints matching book titles.
//Part 3: Loops and Conditional Constructs

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void searchByTitle (String title){
        for (Book book : books) {
            
    }
    public static void main(String[] args) {  
    

    }

}
