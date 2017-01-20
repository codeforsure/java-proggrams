import java.sql.Connection;
import java.sql.DriverManager;
 
class JDBCTest {
 
    private static final String url = "jdbc:mysql://localhost:3306/root";
 
    private static final String user = "root";
 
    private static final String password = "varun@1010";
 
    public static void main(String args[]) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Success");
	    con.close();
	    System.out.println("Sucessfully closed");
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
