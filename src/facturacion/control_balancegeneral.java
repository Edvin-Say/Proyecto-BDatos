/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class control_balancegeneral extends BalanceG{
     private Sentencias_sql sql; 


    public control_balancegeneral(String bg, String activos) {
        super(bg,activos);
        sql = new Sentencias_sql();
    }    
        
     public boolean ingresar_balance()
    {               
        
            String datos[] = {bg,activos};           
            return sql.insertar(datos, "insert into balance(Balance_general,Activos) values(?,?)");
                           
    }
     
    public Object[][] consulta_balanceG(){
        String[] columnas={"Balance_general","Activos"};
        Object[][] datosbg = sql.GetTabla(columnas, "balance", "select Balance_general,Activos from balance;");
        return datosbg;
    } 
        
    
}
