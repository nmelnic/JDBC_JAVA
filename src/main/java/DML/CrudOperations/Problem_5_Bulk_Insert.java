package DML.CrudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Problem_5_Bulk_Insert {

    public static void main(String[] args) throws SQLException {
        Connection myConn = null;
        Statement myStmt = null;

        String dbUrl = "jdbc:mysql://localhost:3306/automation_practice?useSSL=false";
        String user = "nmelnic";
        String pass = "nmelnic_root";

        try {

            // 1. GET A CONNECTION TO DATABASE
            myConn = DriverManager.getConnection(dbUrl, user, pass);

            System.out.println("Database connection successful!\n");

            // 2. CREATE A STATEMENT
            myStmt = myConn.createStatement();

            System.out.println("Inserting data into db....");
            System.out.println("..........................");
            System.out.println("..........................");

            // 3. EXECUTE UPDATE OPERATION
            myStmt.executeUpdate(
                    "LOAD DATA LOCAL INFILE 'C:/sales.csv'\n" +
                            "INTO TABLE sales\n" +
                            "FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '\"'\n" +
                            "LINES TERMINATED BY '\n'");

            System.out.println("Data have been successfully inserted!");

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (myStmt != null) {
                myStmt.close();
            }
            if (myConn != null) {
                myConn.close();
            }
        }
    }
}
