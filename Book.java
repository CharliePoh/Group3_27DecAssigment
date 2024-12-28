public class Book {
    private String tittle;
    private String author;
    private String isbn;
    private boolean isAvailabale;
    public String getTittle() {
        return tittle;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
    public boolean getIsAvailabale() {
        return isAvailabale;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setIsAvailabale(boolean isAvailable) {
        this.isAvailabale = true;
    }
    public void setTittle(String tittle){
        this.tittle = tittle;
    }
    public String getTittle() {
        return tittle;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
    public boolean getIsAvailabale() {
        return isAvailabale;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setIsAvailabale(boolean isAvailable) {
        this.isAvailabale = true;
    }
    public void setTittle(String tittle){
        this.tittle = tittle;
    }
    public void printBookInfo() {
        System.out.println("Title: " + tittle + " Author: " + author + " ISBN: " + isbn + "Available: " + isAvailabale);
    }
}