public class Book {
    private String title;
    private String author;
    private int bookId;
    private boolean isIssued;

    public Book(String title, String author, int bookId) {
        this.title = title;
        this.author = author;
        this.bookId = bookId;
        this.isIssued = false;
    }

    public int getBookId() {
        return bookId;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issueBook() {
        this.isIssued = true;
    }

    public void returnBook() {
        this.isIssued = false;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Issued: " + (isIssued ? "Yes" : "No");
    }
}
