import java.util.Date;

// Base class for all library items
class LibraryItem {
    private final String title;
    private final String libraryId;
    private boolean isCheckedOut;
    private Date dueDate;

    public LibraryItem(String title, String libraryId) {
        this.title = title;
        this.libraryId = libraryId;
        this.isCheckedOut = false;
        this.dueDate = null;
    }

    public String getTitle() {
        return title;
    }

    public String getLibraryId() {
        return libraryId;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void checkOut(Date dueDate) {
        this.isCheckedOut = true;
        this.dueDate = dueDate;
    }

    public void checkIn() {
        this.isCheckedOut = false;
        this.dueDate = null;
    }

    public Date getDueDate() {
        return dueDate;
    }
}

// Subclass for Books
class Boook extends LibraryItem {
    private final String author;
    private final int numPages;

    public Boook(String title, String libraryId, String author, int numPages) {
        super(title, libraryId);
        this.author = author;
        this.numPages = numPages;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumPages() {
        return numPages;
    }
}

// Subclass for DVDs
class Dvd extends LibraryItem {
    private final String director;
    private final int duration; // in minutes

    public Dvd(String title, String libraryId, String director, int duration) {
        super(title, libraryId);
        this.director = director;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }
}

// Subclass for Magazines
class Magazine extends LibraryItem {
    private final String publisher;
    private final Date issueDate;

    public Magazine(String title, String libraryId, String publisher, Date issueDate) {
        super(title, libraryId);
        this.publisher = publisher;
        this.issueDate = issueDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public Date getIssueDate() {
        return issueDate;
    }
}

// Library management system
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Example usage
        Boook book = new Boook("The Great Gatsby", "B001", "F. Scott Fitzgerald", 180);
        Dvd dvd = new Dvd("Inception", "D001", "Christopher Nolan", 148);
        Magazine magazine = new Magazine("National Geographic", "M001", "National Geographic Society", new Date());

        // Checking out a book
        book.checkOut(new Date());
        System.out.println(book.getTitle() + " is checked out. Due date: " + book.getDueDate());

        // Checking in the book
        book.checkIn();
        System.out.println(book.getTitle() + " is checked in.");

        // Displaying Dvd details
        System.out.println("Dvd: " + dvd.getTitle() + ", Director: " + dvd.getDirector() + ", Duration: " + dvd.getDuration() + " minutes");

        // Displaying Magazine details
        System.out.println("Magazine: " + magazine.getTitle() + ", Publisher: " + magazine.getPublisher() + ", Issue Date: " + magazine.getIssueDate());
    }
}
