import java.util.Scanner;
//import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDemo2 {
    public static void main(String[] args) {
        try {
            // 0. Load and register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 1. Get a connection to the database
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "");
            System.out.println("Connection Established.");

            // Create a Scanner object to read user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter username
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            // Prompt the user to enter password
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            // 2. Create a statement
            Statement myStmt = myConn.createStatement();

            // 3. Execute SQL query to check if the entered username and password exist in the database
            ResultSet myRs = myStmt.executeQuery("select * from login where uname='" + username + "' and pasw='" + password + "'");

            // 4. Process the result set
            if (myRs.next()) {
                System.out.println("Login Successful.");
            } else {
                System.out.println("Login Unsuccessful. Incorrect username or password.");
            }

            // Close the scanner
            scanner.close();

        } catch (Exception exc) {
            System.out.println("Connection Failed: " + exc.getMessage());
        }
    }
}
