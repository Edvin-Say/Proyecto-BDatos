/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;
import java.sql.*;



public class conexion {
   
   public static String url = "jdbc:mysql://localhost:3306/bd";
   public static String user = "root";
   public static String pass = "bases2021";
    PreparedStatement psPrepararSentencia;
    Connection con = null;
   

    
    public conexion() {
     try{  
         
         Class.forName("com.mysql.cj.jdbc.Driver");
         
         con = DriverManager.getConnection(url, user, pass);
         if (con!=null){
            System.out.println("Conexión a base de datos facturacion. listo");
         }
      }
         catch(SQLException e)
         {
         System.out.println(e);
         }
         catch(ClassNotFoundException e)
         {
          System.out.println(e);
         }
    }
     /**
     *
     * @return
     */
    public Connection conectado(){
      return con;
}

    public void desconectar(){
      con = null;
      System.out.println("conexion terminada");

    } 

    
}
