import java.sql.*;

public class QuerySecond {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Driver yukle
        Class.forName("com.mysql.jdbc.Driver");
        //Baglanti olusturacaz
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/okul?serverTimezone=UTC","root","1234");
        //Statement= SQL kodlarımızı yazmak icin bir nesne olustur
        Statement st=con.createStatement();
        //ogrenciler tablosundan erkek ogrencilerin bilgilerini getirin
        ResultSet data=st.executeQuery("select * from ogrenciler where cinsiyet='E'");
        while(data.next()){
            System.out.println(data.getInt(1)+data.getString(2)
                    +data.getString(3)+data.getString(4));
        }
        //ogrenciler tablosundaki 9. sınıf kız pgfenciler bilgisini getirin
         ResultSet data2=st.executeQuery("select * from ogrenciler where sinif=9 and cinsiyet='K'");
        while(data2.next()){
            System.out.println(data2.getInt(1)+data2.getString(2)
                    +data2.getString(3)+data2.getString(4));
        }
    }

}
