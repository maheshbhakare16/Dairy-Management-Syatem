
package Database;
import java.sql.*;

public class dbmodel 
{
    
// --------------------- CONNECTION OBJECT CREATED ------------------------
    
    Connection connection;
    public dbmodel()
    {
        
//  -------------------------- CHECK  CONNECTION ESTABLISHED OR NOT  --------------------------
        
        connection = database_connection.connector();
        
    }
    
    
//  -------------------------------- CHECK CONNECTION IS CLOSED OR NOT ----------------
    
    public boolean check_connection()
    {
       try
       {
           return !connection.isClosed();
       }
       catch(SQLException e)
       {
           return false;
       }
    }
}
