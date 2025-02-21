import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public Book searchBookById(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    public User searchUserById(int userId) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }

    public void issueBook(int bookId, int userId) {
        Book book = searchBookById(bookId);
        User user = searchUserById(userId);
        
        if (book != null && user != null) {
            if (!book.isIssued()) {
                book.issueBook();
                System.out.println("Book issued to " + user.getName());
            } else {
                System.out.println("Book is already issued.");
            }
        } else {
            System.out.println("Invalid Book or User ID.");
        }
    }

    public void returnBook(int bookId) {
        Book book = searchBookById(bookId);
        
        if (book != null && book.isIssued()) {
            book.returnBook();
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Invalid Book ID or Book not issued.");
        }
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void listUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }
}
