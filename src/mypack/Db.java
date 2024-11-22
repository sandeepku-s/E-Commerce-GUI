package mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db
{
    static Connection con = null;
    
    public static String url = "jdbc:mysql://localhost:3306/gui_ecomm";
    public static String user = "root";
    public static String password = "";
    
    public static Connection connect()
    {
        try
        {
            con = DriverManager.getConnection(url, user, password);
        }
        catch (SQLException e)
        {
            MyUtility.neg_msg("Not able to connect the database");
        }   
        return con;
    }
}