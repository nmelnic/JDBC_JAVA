package DML.CrudOperations;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Problem_5_Bulk_Insert {

    public static void main(String[] args) throws SQLException {
        Connection myConn = null;
        Statement myStmt = null;

        String dbUrl = "jdbc:mysql://localhost:3306/automation_practice?useSSL=false";
        String user = "nmelnic";
        String pass = "nmelnic_root";


        try {

            Scanner readCSV = new Scanner(new FileReader("sales.csv"));

            // 1. GET A CONNECTION TO DATABASE
            myConn = DriverManager.getConnection(dbUrl, user, pass);

            System.out.println("Database connection successful!\n");

            // 2. CREATE A STATEMENT
            myStmt = myConn.createStatement();

            //TODO: IMPLEMENT A METHOD THAT WILL DISPLAY THE RECORDS BEFORE AND AFTER INSERT OPERATION

            // 3. EXECUTE UPDATE OPERATION
            myStmt.executeUpdate("//TODO");

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
