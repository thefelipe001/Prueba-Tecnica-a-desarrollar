
package Config;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    Connection con;
    String url = "jdbc:sqlserver://localhost:1433;databaseName=EmpresaX";
    String user = "sa";
    String pass = "1234";
    
     public  Conexion() {
        try {
          // Establecer la Conexion.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            System.err.println("Error" + e);

        }
     }
     public Connection getConnection()
     {
     return con;
     }
    }

