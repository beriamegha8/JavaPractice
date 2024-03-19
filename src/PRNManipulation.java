import java.util.Scanner;

public class PRNManipulation {
    private String firstName;
    private String lastName;
    private String middleName;
    private String prn;

    public void enterNames() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name:");
        firstName = scanner.nextLine();

        System.out.println("Enter your last name:");
        lastName = scanner.nextLine();

        System.out.println("Enter your middle name:");
        middleName = scanner.nextLine();
    }

    public void appendMiddleName() {
        // Append middle name to the first name
        firstName += " " + middleName;
    }

    public void enterPRN() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your 11 digit PRN:");
        prn = scanner.nextLine();
    }

    public void manipulatePRN() {
        // Delete first 8 characters of PRN and add 'CS' instead
        if (prn.length() >= 8) {
            prn = "CS" + prn.substring(8);
        }
    }

    public void displayResults() {
        System.out.println("Modified name: " + firstName + " " + lastName);
        System.out.println("Modified PRN: " + prn);
    }

    public static void main(String[] args) {
        PRNManipulation prnManipulation = new PRNManipulation();

        // Task 1: Enter names
        prnManipulation.enterNames();

        // Task 2: Append middle name
        prnManipulation.appendMiddleName();

        // Task 3: Enter PRN
        prnManipulation.enterPRN();

        // Task 4: Manipulate PRN
        prnManipulation.manipulatePRN();

        // Display results
        prnManipulation.displayResults();
    }
}
