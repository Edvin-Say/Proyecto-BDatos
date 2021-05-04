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
public class control_empleados extends Persona2{  
   private Sentencias_sql sql; 


    public control_empleados(String id, String cui, String apellidos, String nombre, String direccion, String fechanaci, String telefono, String fechacontrato, String genero, String estadocivil, String email, String cargo, String horario, String salario, String estado) {
        super(id,cui,apellidos,nombre,direccion,fechanaci,telefono,fechacontrato,genero,estadocivil,email,cargo,horario,salario,estado);
        sql = new Sentencias_sql();
    }    
        
     public boolean ingresar_empleados()
    {               
        
            String datos[] = {id,cui,apellidos,nombre,direccion,fechanaci,telefono,fechacontrato,genero,estadocivil,email,cargo,horario,salario,estado};           
            return sql.insertar(datos, "insert into rrhh(Id_empleado,CUI,Apellidos,Nombre,Direccion,Fecha_nacimiento,Telefono,Fecha_contrato,Genero,Estado_civil,Email,Cargo,Horario,Salario,Estado) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                           
    }
     
    public Object[][] consulta_empleados(){
        String[] columnas={"Id_empleado","CUI","Apellidos","Nombre","Direccion","Fecha_nacimiento","Telefono","Fecha_contrato","Genero","Estado_civil","Email","Cargo","Horario","Salario","Estado"};
        Object[][] datos = sql.GetTabla(columnas, "rrhh", "select Id_empleado,CUI,Apellidos,Nombre,Direccion,Fecha_nacimiento,Telefono,Fecha_contrato,Genero,Estado_civil,Email,Cargo,Horario,Salario,Estado from rrhh;");
        return datos;
    } 
        
     
     
     
     
//    public Object[][] consulta_empleados(){
//        String[] columnas={"Id_empleado","CUI","Apellidos","Nombre","Direccion","Fecha_nacimiento","Telefono","Fecha_contrato","Genero","Estado_civil","Email","Cargo","Horario","Salario","Estado"};
//        Object[][] datos = sensql.GetTabla(columnas, "rrhh", "select Id_empleado,CUI,Apellidos,Nombre,Direccion,Fecha_nacimiento,Telefono,Fecha_contrato,Genero,Estado_civil,Email,Cargo,Horario,rrhh.Salario,Estado from rrhh;");
//        //articulo.precio_venta,precio_costo,stock,descripcion_articulo,Nombre_comercial,fecha_ingreso
//        //where id_tipoarticulo=cod_tipo_articulo and No_documento=cod_proveedor;
//        return datos;
//    }
         
    
}
    


