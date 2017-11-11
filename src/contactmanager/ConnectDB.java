/*
 *  Contact Manager Program is a phone-book kind of desktop application used for Adding a new record(All fields required),
 *  Deleting an unwanted record (SSN is required for Deletion), Updating few fields of record(SSN is required for Updation,
 *  Searching a record from the database( Program searches on any fields, if none specific field is given then it gives data of all persons)
 *  
 *  Written by AMAN SACHAN for CS6390.004, Assignment 4, Starting Oct 20, 2017.
 *  NetID: axs174330
 */

package contactmanager;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 * @author AMAN
 */
/* ConnectDB is used to connect to SQLServer database*/
public class ConnectDB {
  static Connection conn = null;
	public static Connection ConnectSql()
        {
           try
            {
                // Load the driver. This is specific to Microsoft SQL Server.
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                // Use a static method of DriverManager to get a connectio to the database.
                conn = java.sql.DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Manager","aman", "aman");
      

                if (conn != null)
                {
                    System.out.println("Connection Successful!");
                }
            } catch (Exception e)
                {
                    e.printStackTrace();
                    System.out.println("Error Trace in getConnection() : " + e.getMessage());
                }
            return conn;
	}   
}
