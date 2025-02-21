import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        
        // Add some initial books and users
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", 1));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 2));
        library.addUser(new User("John Doe", 101));
        library.addUser(new User("Jane Smith", 102));
        
        while (true) {
            try {
                System.out.println("\nLibrary Management System");
                System.out.println("1. List Books");
                System.out.println("2. List Users");
                System.out.println("3. Issue Book");
                System.out.println("4. Return Book");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                
                int choice = scanner.nextInt();
                
                switch (choice) {
                    case 1:
                        library.listBooks();
                        break;
                    case 2:
                        library.listUsers();
                        break;
                    case 3:
                        System.out.print("Enter Book ID to issue: ");
                        int bookIdToIssue = scanner.nextInt();
                        System.out.print("Enter User ID to issue to: ");
                        int userIdToIssue = scanner.nextInt();
                        library.issueBook(bookIdToIssue, userIdToIssue);
                        break;
                    case 4:
                        System.out.print("Enter Book ID to return: ");
                        int bookIdToReturn = scanner.nextInt();
                        library.returnBook(bookIdToReturn);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }
    }
}
