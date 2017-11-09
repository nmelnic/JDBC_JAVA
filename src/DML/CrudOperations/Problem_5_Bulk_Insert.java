package DML.CrudOperations;

import java.sql.*;

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

            //TODO: IMPLEMENT A METHOD THAT WILL DISPLAY THE RECORDS BEFORE AND AFTER INSERT OPERATION

            // 3. EXECUTE UPDATE OPERATION
            myStmt.executeUpdate("update sales " + "set OrderQty = OrderQty + 5");

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
