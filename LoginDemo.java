//import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class LoginDemo {
    public static void main(String[] args) {
        try {
            // 0. Load and register the driver
            Class.forName("com.mysql.cj.jdbc.Driver"); //here, Class is a static class in java.lang package
            //Class.forName() is used to load the any class dynamically
            // 1. Get a connection to database
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "");
            System.out.println("Connection Established.");
            // 2. Create a statement
            Statement myStmt = myConn.createStatement();
//
//            // 3. Execute SQL query
            ResultSet myRs = myStmt.executeQuery("select * from login");
            System.out .println("Username\tPassword");
//
//            // 4. Process the result set
           while (myRs.next()) {
//                System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
               System.out.println(myRs.getString(1) + "\t\t"+ myRs.getString(2));

           }
        } catch (Exception exc) {
//            exc.printStackTrace();
            System.out.println("Connection Failed." + exc.getMessage());
        }
    }
}
