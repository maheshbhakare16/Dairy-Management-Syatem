
package milk.management;

import Database.database_connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MilkManagement 
{

    
// ---------------------------  MAIN METHOD ------------------------------
    
    public static void main(String[] args) 
    {
      PreparedStatement statement;
      int result = 1;
            Connection connect;
            connect = database_connection.connector();
            {
            String query = "CREATE TABLE milkmanagement.vendor ("
                    + "id VARCHAR(45) BINARY NOT NULL,"
                    + "fname VARCHAR(45) NOT NULL,"
                    + "lname VARCHAR(45) NOT NULL,"
                    + "password VARCHAR(45) BINARY NOT NULL,"
                    + "PRIMARY KEY (id));";
            

            try 
            {
                statement = connect.prepareStatement(query);
                result = statement.executeUpdate();
            } 
            catch (SQLException e) 
            {
                if ("Table 'vendor' already exists".equals(e.getMessage())) 
                {

                } 
                else
                {
                    
                }
            }
            
        }
        if(result == 0)
            {
        try 
        {
        String query = "INSERT INTO milkmanagement.vendor (id, fname, lname, password) VALUES ('MM13','ADMIN', 'ADMIN', 'Pass@123');";
        statement = connect.prepareStatement(query);
        statement.executeUpdate();
        } 
        catch (SQLException e) 
        {
            
        }
            }
     
// -------------------------- LOGIN WINDOW OBJECT CREATED INITILIZED ---------------------
       
        Login login = new Login();
        login.show();
    }
    
}
