package DML.CrudOperations;

import java.sql.*;

public class Problem_1_Read {

    public static void main(String[] args) throws SQLException {
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        try {
            // 1. GET A CONNECTION TO DATABASE
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/automation_practice?useSSL=false",
                                                "nmelnic",
                                            "nmelnic_root");

            System.out.println("Database connection successful!\n");

            // 2. CREATE A STATEMENT
            myStmt = myConn.createStatement();

            // 3. EXECUTE READ OPERATION
            myRs = myStmt.executeQuery("select * from Sales where OrderQty >= 2");

            // 4. PROCESS THE RESULT SET
            while (myRs.next()) {
                System.out.println(myRs.getString("ProductID") + ", " + myRs.getString("OrderQty"));
            }
        } catch (
                Exception exc)

        {
            exc.printStackTrace();
        } finally

        {
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
}
