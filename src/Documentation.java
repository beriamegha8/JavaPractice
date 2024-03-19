interface Document {
    String getTitle();
    String getAuthor();
    String getContent();
}

class BasicDocument implements Document {
    private String title;
    private String author;
    private String content;

    public BasicDocument(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

class Invoice extends BasicDocument {
    private int invoiceNumber;
    private double amount;

    public Invoice(String title, String author, String content, int invoiceNumber, double amount) {
        super(title, author, content);
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
    }

    // Other methods specific to Invoice

    @Override
    public String toString() {
        return "Invoice{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", content='" + getContent() + '\'' +
                ", invoiceNumber=" + invoiceNumber +
                ", amount=" + amount +
                '}';
    }
}

class Contract extends BasicDocument {
    private String party1;
    private String party2;

    public Contract(String title, String author, String content, String party1, String party2) {
        super(title, author, content);
        this.party1 = party1;
        this.party2 = party2;
    }

    // Other methods specific to Contract

    @Override
    public String toString() {
        return "Contract{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", content='" + getContent() + '\'' +
                ", party1='" + party1 + '\'' +
                ", party2='" + party2 + '\'' +
                '}';
    }
}

class Resume extends BasicDocument {
    private String skills;
    private String experience;

    public Resume(String title, String author, String content, String skills, String experience) {
        super(title, author, content);
        this.skills = skills;
        this.experience = experience;
    }

    // Other methods specific to Resume

    @Override
    public String toString() {
        return "Resume{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", content='" + getContent() + '\'' +
                ", skills='" + skills + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}

public class Documentation {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Invoice", "John Doe", "Invoice for services rendered", 1001, 500.0);
        Contract contract = new Contract("Contract", "Alice Smith", "Legal contract for project", "Company A", "Company B");
        Resume resume = new Resume("Resume", "Bob Johnson", "Professional resume", "Java, Python", "5 years experience");

        System.out.println(invoice);
        System.out.println(contract);
        System.out.println(resume);
    }
}
