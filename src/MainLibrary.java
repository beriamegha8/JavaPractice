import java.util.Scanner;

class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Book {
    private String title;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }
}

class Library {
    private Book[] books;
    private int bookCount;

    public Library(int maxBooks) {
        this.books = new Book[maxBooks];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
            System.out.println("Book added to the library.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void displayBooks() {
        if (bookCount == 0) {
            System.out.println("Library is empty. No books to display.");
        } else {
            System.out.println("Books in the Library:");
            for (int i = 0; i < bookCount; i++) {
                System.out.println("Title: " + books[i].getTitle());
                System.out.println("Author: " + books[i].getAuthor().getName());
                System.out.println();
            }
        }
    }
}

public class MainLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library library = new Library(5);

        Author author1 = new Author("John Doe");
        Author author2 = new Author("Jane Smith");

        Book book1 = new Book("Java Programming", author1);
        Book book2 = new Book("Introduction to Algorithms", author2);

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Existing books in the library:");
        library.displayBooks();

        String userInput;
        do {
            System.out.print("Enter author name: ");
            String authorName = scanner.nextLine();
            Author author = new Author(authorName);

            System.out.print("Enter book title: ");
            String bookTitle = scanner.nextLine();
            Book book = new Book(bookTitle, author);

            library.addBook(book);

            System.out.print("Do you want to add more books? (yes/no): ");
            userInput = scanner.nextLine().toLowerCase();

        } while (userInput.equals("yes"));

        System.out.println("Updated books in the library:");
        library.displayBooks();

        scanner.close();
    }
}
