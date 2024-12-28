public class Book {
    private String tittle;
    private String author;
    private String isbn;
    private boolean isAvailabale;
    public Book(String tittle, String author, String isbn, boolean isAvailabale) {
        this.tittle = tittle;
        this.author = author;
        this.isbn = isbn;
        this.isAvailabale = isAvailabale;
    }
    public void printBookInfo() {
        System.out.println("Title: " + tittle + " Author: " + author + " ISBN: " + isbn + "Available: " + isAvailabale);
    }
}
