
package model;

//importamos el paquete oara usar oracle y su conector
import java.sql.*;


public class ModeloConexion {
     public static Connection conectarse(String login, 
           String password)throws Exception{
       
       String url="jdbc:orcle:thin@localhost:1521:orcl";
       Class.forName("oracle.jdbc.OracleDriver");
      Connection con= DriverManager.getConnection(url,login, password);
       return con;
   }
}
