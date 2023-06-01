//package stud.conn;
import java.sql.Connection;
import java.sql.DriverManager; 
public class CP {
    static Connection c;
    public static Connection createC()
    {
        try{
            //load
       Class.forName("com.mysql.cj.jdbc.Driver");

       //create
       String user="freedb_User_123";
       String pass="r8EN3E&T4wtU%Tj";
       String url="jdbc:mysql://sql.freedb.tech:3306/freedb_Project_123";
         c=DriverManager.getConnection(url, user, pass);
         
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return c;
    }
    
}
