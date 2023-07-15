
package userfrom;
import java.sql.*;
/**
 *
 * @author Abdul Karim
 */
public class Connect {
    Connection conn =null;
    
    public static Connection ConnectDB(){
        String url="jdbc:mysql://localhost/UserDatabase";
        String user="root";
        String pass="";
        
      try{
          Class.forName("org.sqlite.JDBC");
          //Connection conn = DriverManager.getConnection("jdbc:sqlite:UserDatabase.sqlite");//sqlite connection
          Connection conn = DriverManager.getConnection(url,user,pass);//mysql connection
          //JOptionPane.showMessageDialog(null,"Connected");
          System.out.println("Connected");
          return conn;
      }catch(Exception e){
          System.out.println("DataBase not Connected");
      }
      return null;
    }
}
