package DML.CrudOperations;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class Problem_3_Delete {

    public static void main(String[] args) throws SQLException {

        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        try {
            // 1. DB CONNECTION
            // 1.1. Load the properties file
            Properties props = new Properties();
            props.load(new FileInputStream("dbData.properties"));

            // 1.2. Read the props FROM the dbData.properties file
            String theDbUrl = props.getProperty("dbUrl");
            String theUser = props.getProperty("user");
            String thePassword = props.getProperty("password");

            System.out.println("The user: " + "'" + theUser + "'" + " connects to: " + theDbUrl);
            System.out.println("..............................................................");

            // 1.3. Get a connection to database
            myConn = DriverManager.getConnection(theDbUrl + "?useSSL=false", theUser, thePassword);

            System.out.println("\nUser is being connected successfully!\n");

            // 2. CREATE A STATEMENT
            myStmt = myConn.createStatement();

            // 3. EXECUTE A SQL QUERY THAT DELETES A SPECIFIC RECORD FROM THE SALES TABLE
            System.out.println("\nDeleting...................................\n");

            myStmt.executeUpdate("delete from Sales " + "where UnitPrice <= 218.45"); //TODO: 160.00 issue

            // 4. VERIFY THIS BY GETTING THE EMPLOYEES LIST FROM THE SALES TABLE
            System.out.println("\nEmployees records after delete operation:\n");

            myRs = myStmt.executeQuery("select * from Sales");

            while (myRs.next()) {
                System.out.println(myRs.getString("SalesOrderID") + ", " + myRs.getString("UnitPrice"));
            }

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            close(myConn, myStmt, myRs);
        }
    }
            // 5. CLOSE ALL CONNECTIONS & BRIDGES
    private static void close(Connection myConn, Statement myStmt,
                              ResultSet myRs) throws SQLException {
        if (myRs != null) {
            myRs.close();
        }

        if (myStmt != null) {
            myStmt.close();
        }

        if (myConn != null) {
            myConn.close();
        }
    }
}
