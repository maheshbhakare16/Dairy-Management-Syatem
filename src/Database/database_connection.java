
package Database;
import java.sql.*;

public class database_connection 
{
    
// --------------------------- DATABASE CONNECTION CREATION ------------------------
    
    public static Connection connector()
    {  
try
{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection conn;  
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/milkmanagement","root","mahesh12@");
return conn;
}
catch(ClassNotFoundException | SQLException e)
{
    return null;
}  
}
}
