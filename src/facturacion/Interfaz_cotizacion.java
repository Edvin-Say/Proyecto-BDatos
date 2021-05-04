/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import javax.swing.JComboBox;
//import javax.swing.*;
//import java.awt.event.*;
//import java.awt.*;
//
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.SQLException;
// import java.sql.Statement;
// import java.util.logging.Level;
// import java.util.logging.Logger;
// import javax.swing.JOptionPane;


/**
 *
 * @author DELL
 */
public class Interfaz_cotizacion extends javax.swing.JInternalFrame {

    /**
     * Creates new form Interfaz_cotizacion
     */
    control_existencias con;
    private Object [][] datostabla;
    public Interfaz_cotizacion(control_existencias con) {
        initComponents();
       
        //setLocationRelativeTo(null);        // Centering on screen...
        //setSize(898, 605);                  // Setting dimensions...
        //setTitle("Ejemplo para mercedes");  // A simple greeting...
        fecha_fact.setEnabled(false);
        num_factura.setEnabled(false);
        cliente_factura.setEnabled(false);
        apell_cli.setEnabled(false);
        articulo_venta.setEnabled(false);
        stock_art.setEnabled(false);
        preciu_unid.setEnabled(false);
        cant_art.setEnabled(false);
        iva_art.setEnabled(false);
        desc_art.setEnabled(false);
        Total_art.setEnabled(false);
        combo_articulos.setEnabled(false);
        Reg_articulo.setEnabled(false);
        imprimir_bt.setEnabled(false);
        total_factura.setEnabled(false);
        
        this.con = con;
        
        cliente_factura.setText( con.ingresa_nombre_Cliente() );
        
        apell_cli.setText(con.ingresa_apellidos_Cliente());
        
        num_factura.setText(con.GenerarNumeroFactura());  
        
        Date hoy = new Date();
        fecha_fact.setText( hoy.getDate()+"/"+(hoy.getMonth()+1) +"/"+(hoy.getYear()+1900) );
        
        Object[] idarticulo = con.combox("articulo","id_articulo");
        combo_articulos.removeAllItems();
//        for(int i=0;i<idarticulo.length;i++)
//        {
//        combo_articulos.addItem(idarticulo[i]);
//        }
//        Object[] formapago = con.combox("forma_de_pago","id_formapago");
//        combo_formapago.removeAllItems();
//        for(int i=0;i<formapago.length;i++)
//        {
//        combo_formapago.addItem(formapago[i]);
//        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        num_factura = new javax.swing.JTextField();
        cliente_factura = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        apell_cli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fecha_fact = new javax.swing.JTextField();
        vend_fact = new javax.swing.JTextField();
        reg_factura = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cant_art = new javax.swing.JTextField();
        articulo_venta = new javax.swing.JTextField();
        desc_art = new javax.swing.JTextField();
        stock_art = new javax.swing.JTextField();
        Total_art = new javax.swing.JTextField();
        preciu_unid = new javax.swing.JTextField();
        Reg_articulo = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        iva_art = new javax.swing.JTextField();
        total_factura = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        imprimir_bt = new javax.swing.JButton();
        combo_articulos = new javax.swing.JComboBox();
        combo_formapago = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cotizacion de productos");
        setToolTipText("");
        setMinimumSize(new java.awt.Dimension(94, 22));
        setNormalBounds(new java.awt.Rectangle(0, 0, 94, 0));
        setPreferredSize(new java.awt.Dimension(898, 605));

        num_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_facturaActionPerformed(evt);
            }
        });

        cliente_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliente_facturaActionPerformed(evt);
            }
        });

        jLabel1.setText("No. Factura");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        apell_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apell_cliActionPerformed(evt);
            }
        });

        jLabel4.setText("Forma pago");

        jLabel5.setText("Fecha");

        jLabel6.setText("Vendedor");

        fecha_fact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_factActionPerformed(evt);
            }
        });

        vend_fact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vend_factActionPerformed(evt);
            }
        });

        reg_factura.setText("Registrar datos");
        reg_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_facturaActionPerformed(evt);
            }
        });

        jLabel7.setText("Id_articulo");

        jLabel8.setText("Cantidad");

        jLabel9.setText("Articulo");

        jLabel10.setText("Descuento");

        jLabel11.setText("Stock");

        jLabel12.setText("Total de articulos");

        jLabel13.setText("Precio Unidad");

        cant_art.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cant_artActionPerformed(evt);
            }
        });

        articulo_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                articulo_ventaActionPerformed(evt);
            }
        });

        desc_art.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desc_artActionPerformed(evt);
            }
        });

        stock_art.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_artActionPerformed(evt);
            }
        });

        Total_art.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Total_artActionPerformed(evt);
            }
        });

        preciu_unid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preciu_unidActionPerformed(evt);
            }
        });

        Reg_articulo.setText("Registrar detalle");
        Reg_articulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reg_articuloActionPerformed(evt);
            }
        });

        jLabel14.setText("IVA");

        jLabel15.setText("Total factura");

        iva_art.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iva_artActionPerformed(evt);
            }
        });

        total_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_facturaActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        imprimir_bt.setText("Registrar total");
        imprimir_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimir_btActionPerformed(evt);
            }
        });

        combo_articulos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_articulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_articulosActionPerformed(evt);
            }
        });

        combo_formapago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_formapago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_formapagoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(num_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cliente_factura, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(apell_cli))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cant_art, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_articulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(articulo_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desc_art, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stock_art, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Total_art, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(preciu_unid, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(167, 167, 167))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(vend_fact, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fecha_fact, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81)
                                .addComponent(reg_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(combo_formapago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(239, 239, 239)
                                .addComponent(Reg_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15)))
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(total_factura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addComponent(iva_art, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(imprimir_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(167, 167, 167))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(combo_formapago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha_fact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reg_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cliente_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(apell_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(vend_fact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(articulo_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preciu_unid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stock_art, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_articulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(cant_art, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc_art, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(Total_art, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(iva_art, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(Reg_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imprimir_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_facturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_facturaActionPerformed

    private void cliente_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliente_facturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cliente_facturaActionPerformed

    private void desc_artActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desc_artActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desc_artActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void reg_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_facturaActionPerformed
        con.registrar_factura(num_factura.getText(),vend_fact.getText(),fecha_fact.getText(),combo_formapago.getSelectedItem().toString());
        cant_art.setEnabled(true);
        iva_art.setEnabled(true);
        desc_art.setEnabled(true);
        Total_art.setEnabled(true);
        combo_articulos.setEnabled(true);
        Reg_articulo.setEnabled(true);
        total_factura.setEnabled(true);
        imprimir_bt.setEnabled(true);
        reg_factura.setEnabled(false);
        combo_formapago.setEnabled(false);
        vend_fact.setEnabled(false);
       
    }//GEN-LAST:event_reg_facturaActionPerformed

    private void Reg_articuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reg_articuloActionPerformed
        int c = Integer.parseInt(stock_art.getText());
        int b = Integer.parseInt(cant_art.getText());
                
        if(!cant_art.getText().equals("0") )
        {
            if (c > b)
            {            
            
            if( con.registrar_producto(num_factura.getText(),combo_articulos.getSelectedItem().toString(),cant_art.getText(),Total_art.getText()))
            {
                JOptionPane.showMessageDialog(this, "El articulo se registro con exito");
                cant_art.setText("0");
                Total_art.setText("0");                
                desc_art.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Error al registrar el articulo");
            }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "El stock del articulo no soporta la venta por favor actualize en stock");
            }
        }
            else
            {
            JOptionPane.showMessageDialog(this, "La cantidad no es valida");
            }
        
        String[] columnas = {"Numero_factura","Codigo articulo","Descripcion","Cantidad","Total"};
        datostabla = con.datos_detallefactura(num_factura.getText());
        DefaultTableModel datosta = new DefaultTableModel(datostabla,columnas);
        jTable1.setModel(datosta);
        
        Double a = con.total_factura(num_factura.getText());
        
        total_factura.setText(a.toString());
        IVA iva = new IVA(Double.parseDouble(total_factura.getText()));
        iva_art.setText(iva.calcular_iva().toString());
        
        
        
    }//GEN-LAST:event_Reg_articuloActionPerformed

    private void combo_articulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_articulosActionPerformed
      if(combo_articulos.getSelectedItem()!=null )
     {
            
            Object[][] datos = con.datos_articulo(combo_articulos.getSelectedItem().toString());
            articulo_venta.setText(datos[0][0].toString());
            preciu_unid.setText(datos[0][1].toString());
            stock_art.setText(datos[0][2].toString());
            cant_art.setText("0");
            Total_art.setText("0");
            desc_art.setText("0");
            
            
        }           
              
    }//GEN-LAST:event_combo_articulosActionPerformed

    private void combo_formapagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_formapagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_formapagoActionPerformed

    private void apell_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apell_cliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apell_cliActionPerformed

    private void vend_factActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vend_factActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vend_factActionPerformed

    private void cant_artActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cant_artActionPerformed
        
    }//GEN-LAST:event_cant_artActionPerformed

    private void cant_artKeyReleased(java.awt.event.KeyEvent evt) {                                     
        double suma;      
        double descuento = Double.parseDouble(desc_art.getText());
        double precio = Double.parseDouble(preciu_unid.getText());
        int cant = Integer.parseInt( cant_art.getText() );
        double desc = descuento/100;
        double porcent;
        if (descuento == 0)
        {
        suma = precio*cant ;
        }
        else
        {
        porcent = precio*desc;
        suma = (precio-porcent)*cant ;
        }
        Total_art.setText(Double.toString(suma));
        
    }   
    
    
    private void imprimir_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimir_btActionPerformed
        if(!total_factura.getText().equals("0") )
        {
            
            
            if( con.update_factura(num_factura.getText(),total_factura.getText(),iva_art.getText()))
            {
                JOptionPane.showMessageDialog(this, "Venta realizada");
                total_factura.setText("0");
                iva_art.setText("0");  
                cant_art.setEnabled(false);
                iva_art.setEnabled(false);
                desc_art.setEnabled(false);
                Total_art.setEnabled(false);
                combo_articulos.setEnabled(false);
                Reg_articulo.setEnabled(false);
                imprimir_bt.setEnabled(false);
                total_factura.setEnabled(false);
                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Error al registrar la venta");
            }
            }
            
            else
            {
            JOptionPane.showMessageDialog(this, "El total no es valido");
            }
        
        
    }//GEN-LAST:event_imprimir_btActionPerformed

    private void iva_artActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iva_artActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iva_artActionPerformed

    private void stock_artActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_artActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stock_artActionPerformed

    private void total_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_facturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_facturaActionPerformed

    private void preciu_unidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preciu_unidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preciu_unidActionPerformed

    private void Total_artActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Total_artActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Total_artActionPerformed

    private void fecha_factActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_factActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_factActionPerformed

    private void articulo_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_articulo_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_articulo_ventaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reg_articulo;
    private javax.swing.JTextField Total_art;
    private javax.swing.JTextField apell_cli;
    private javax.swing.JTextField articulo_venta;
    private javax.swing.JTextField cant_art;
    private javax.swing.JTextField cliente_factura;
    private javax.swing.JComboBox<String> combo_articulos;
    private javax.swing.JComboBox<String> combo_formapago;
    private javax.swing.JTextField desc_art;
    private javax.swing.JTextField fecha_fact;
    private javax.swing.JButton imprimir_bt;
    private javax.swing.JTextField iva_art;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField num_factura;
    private javax.swing.JTextField preciu_unid;
    private javax.swing.JButton reg_factura;
    private javax.swing.JTextField stock_art;
    private javax.swing.JTextField total_factura;
    private javax.swing.JTextField vend_fact;
    // End of variables declaration//GEN-END:variables
}
