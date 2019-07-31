package Database_Con;
import java.sql.*;
public class DatabaseConnection {
    private Connection con;
    private static DatabaseConnection dbc;
    private DatabaseConnection() throws SQLException
        {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("Driver Loaded");
                con= DriverManager.getConnection("jdbc:mysql://localhost:3306/simplecrud","root","");
                System.out.println("Connectivity is successful");
            }
            catch(ClassNotFoundException ex)
            {
                System.out.print(ex);
            }
            
        }
    public static DatabaseConnection getDatabaseConnection() throws SQLException
    {
        if(dbc==null)
        {
          dbc=new DatabaseConnection();
        }
        return dbc;
    }
  public Connection getConnection()
  {
      return con;
  }
    
  
}
