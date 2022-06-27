import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Query03 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Driver yukle
        Class.forName("com.mysql.jdbc.Driver");
        //Baglanti olusturacaz
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch59?serverTimezone=UTC","root","1234");
        //Statement= SQL kodlarımızı yazmak icin bir nesne olustur
        Statement st=con.createStatement();
    }
}
