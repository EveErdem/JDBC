import java.sql.*;

public class QueryFirst {

        public static void main(String[] args) throws ClassNotFoundException, SQLException {
            //Driver yukle
            Class.forName("com.mysql.jdbc.Driver");
            //Baglanti olusturacaz
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/okul?serverTimezone=UTC","root","1234");
            //Statement= SQL kodlarımızı yazmak icin bir nesne olustur
            Statement st=con.createStatement();
            //ResultSEt
            ResultSet data=st.executeQuery("select * from ogrenciler");
            //take result (sonuclari al)
            while(data.next()){
                //index kullanarak
                System.out.println(data.getInt(1)+data.getString(2)
                        +data.getString(3)+data.getString(4));
                //sutun kullanarak
                System.out.println(data.getInt("okul_no")+data.getString("ogrenci_ismi")
                        +data.getString("sinif")+data.getString("cinsiyet"));
            }
            //kapatma
            //con.close();
            //st.close();
            //data.close();
        }
    }


