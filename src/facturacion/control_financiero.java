/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class control_financiero {
    Sentencias_sql sensql;
   
    public control_financiero() {
        
        sensql = new Sentencias_sql(); 
    }
    
    public boolean ingresar_finanzas(String estadoresultado, int tipo)
    {               
        
            String datos[] = {estadoresultado,Integer.toString(tipo)};           
            return sensql.insertar(datos, "insert into financiero(Estado_resultado,Tipo) values(?,?)");
                                  
        
    }
         
    public Object[][] consulta_finanzas(){
        String[] columnas={"Estado_resultado","Tipo"};
        Object[][] datos = sensql.GetTabla(columnas, "financiero", "select Estado_resultado,Tipo from financiero;");
        //articulo.precio_venta,precio_costo,stock,descripcion_articulo,Nombre_comercial,fecha_ingreso
        //where id_tipoarticulo=cod_tipo_articulo and No_documento=cod_proveedor;
        return datos;
    }
         
  
}
