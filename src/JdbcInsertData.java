import java.sql.*;

public class JdbcInsertData {

    public static void main(String[] args) throws SQLException {
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?useSSL=false", "student", "student");

            System.out.println("Database connection successful!\n");

            // 2. Create a statement
            myStmt = myConn.createStatement();

            // 3. Execute SQL query
            myRs = myStmt.executeQuery("TBD");

            // 4. Process the result set
            while (myRs.next()) {
                System.out.println(myRs.getString("TBD") + ", " + myRs.getString("TBD"));
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
