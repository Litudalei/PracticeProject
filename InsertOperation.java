import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertOperation {
    public static void main(String[] args)thows SQLException
    {
    Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("driver is loaded");
        DriverManager.getConnection("mysql:jdbc://localhost/3306/")
    }
}
