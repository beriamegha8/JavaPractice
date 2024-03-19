import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Booook {
    private String title;
    private int pageCount;

    public Booook(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "Booook{title='" + title + "', pageCount=" + pageCount + '}';
    }
}

class PageCountComparator implements Comparator<Booook> {
    @Override
    public int compare(Booook book1, Booook book2) {
        return Integer.compare(book1.getPageCount(), book2.getPageCount());
    }
}

class TitleLengthComparator implements Comparator<Booook> {
    @Override
    public int compare(Booook book1, Booook book2) {
        return Integer.compare(book1.getTitle().length(), book2.getTitle().length());
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        // Creating a list of Booook objects
        List<Booook> books = new ArrayList<>();
        books.add(new Booook("Java Programming", 400));
        books.add(new Booook("Data Structures", 300));
        books.add(new Booook("Design Patterns", 500));

        // Displaying the list before sorting
        System.out.println("List before sorting:");
        for (Booook book : books) {
            System.out.println(book);
        }

        // Sorting the list using a custom comparator based on pageCount
        Collections.sort(books, new PageCountComparator());

        // Displaying the list after sorting by pageCount
        System.out.println("\nList after sorting by pageCount:");
        for (Booook book : books) {
            System.out.println(book);
        }

        // Sorting the list using a custom comparator based on title length
        Collections.sort(books, new TitleLengthComparator());

        // Displaying the list after sorting by title length
        System.out.println("\nList after sorting by title length:");
        for (Booook book : books) {
            System.out.println(book);
        }
    }
}