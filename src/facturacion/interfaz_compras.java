
package facturacion;

import static facturacion.Interfaz_articulo.convertTostring;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class interfaz_compras extends javax.swing.JInternalFrame {
control_existencias con = new control_existencias();

    public interfaz_compras() {
        initComponents();
        limpiar();
        bloquear_cajas();
        this.calendario.setEnabled(false);
        
        Object[] tipo = con.combox("tipo_articulo","id_tipoarticulo");
        combotipo.removeAllItems();
        for(int i=0;i<tipo.length;i++){
        combotipo.addItem(tipo[i].toString()); 
    }
        Object[] prov = con.combox("proveedor","No_documento");
        comboproveedor.removeAllItems();
        for(int i=0;i<prov.length;i++){
        comboproveedor.addItem(prov[i].toString());
        
    }
    }
        
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboproveedor = new javax.swing.JComboBox<>();
        pre_costo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        descripcion_prod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cant_prod = new javax.swing.JTextField();
        calendario = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        combotipo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        pre_venta = new javax.swing.JTextField();
        nuevoreg = new javax.swing.JToggleButton();
        registrar = new javax.swing.JToggleButton();
        cancelar = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JToggleButton();

        setClosable(true);
        setTitle("Compras");

        jLabel1.setText("Proveedores");

        comboproveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboproveedorActionPerformed(evt);
            }
        });

        pre_costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pre_costoActionPerformed(evt);
            }
        });

        jLabel2.setText("Precio costo");

        jLabel3.setText("Descripcion");

        descripcion_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcion_prodActionPerformed(evt);
            }
        });

        jLabel4.setText("Cantidad");

        cant_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cant_prodActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha");

        jLabel6.setText("Tipo");

        combotipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Precio Venta");

        pre_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pre_ventaActionPerformed(evt);
            }
        });

        nuevoreg.setText("Nuevo registro");
        nuevoreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoregActionPerformed(evt);
            }
        });

        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pre_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(descripcion_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cant_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(combotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(nuevoreg, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pre_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nuevoreg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descripcion_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cant_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pre_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pre_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void limpiar()
    {
       
       descripcion_prod.setText("");
       pre_venta.setText("");
       pre_costo.setText("");
       cant_prod.setText("");
       combotipo.setName(""); 
       comboproveedor.setName("");
       calendario.setName("");
    }
    
    public void  bloquear_cajas()
    {
       
       descripcion_prod.setEnabled(false);
       pre_venta.setEnabled(false);
       pre_costo.setEnabled(false);
       cant_prod.setEnabled(false);       
       combotipo.setEnabled(false); 
       comboproveedor.setEnabled(false);
       nuevoreg.setEnabled(true);
       registrar.setEnabled(false);
       cancelar.setEnabled(false);
       this.calendario.getCalendarButton().setEnabled(false);
       
       
    }
    public void  desbloquear()
    {
       
       descripcion_prod.setEnabled(true);
       pre_venta.setEnabled(true);
       pre_costo.setEnabled(true);
       cant_prod.setEnabled(true);       
       combotipo.setEnabled(true); 
       comboproveedor.setEnabled(true);
       nuevoreg.setEnabled(false);
       registrar.setEnabled(true);
       cancelar.setEnabled(true);
       this.calendario.getCalendarButton().setEnabled(true);
       
    }
      
    private void comboproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboproveedorActionPerformed

    private void pre_costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pre_costoActionPerformed
        // TODO add your handling code here:
        pre_costo.transferFocus();
    }//GEN-LAST:event_pre_costoActionPerformed

    private void descripcion_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcion_prodActionPerformed
        // TODO add your handling code here:
        descripcion_prod.transferFocus();
    }//GEN-LAST:event_descripcion_prodActionPerformed

    private void cant_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cant_prodActionPerformed
        // TODO add your handling code here:
        cant_prod.transferFocus();
    }//GEN-LAST:event_cant_prodActionPerformed

    private void pre_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pre_ventaActionPerformed
        // TODO add your handling code here:
        pre_venta.transferFocus();
    }//GEN-LAST:event_pre_ventaActionPerformed

    private void nuevoregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoregActionPerformed
        // TODO add your handling code here:
        desbloquear();
        descripcion_prod.requestFocus();
    }//GEN-LAST:event_nuevoregActionPerformed
    public static String convertTostring(Date Date)
        {
            DateFormat df;
            String fech = null;
            df = new SimpleDateFormat("yyyy-MM-d");
            fech = df.format(Date);
            return fech;
        }
    
    
            int merc = 0;

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
        String des, tipo,prov,fecha;       
        int preve, precos,sto;
        des = descripcion_prod.getText();
        tipo = combotipo.getSelectedItem().toString();
        fecha = convertTostring(calendario.getDate());
        preve = Integer.parseInt(pre_venta.getText());
        precos = Integer.parseInt(pre_costo.getText());
        sto = Integer.parseInt(cant_prod.getText());
        prov = comboproveedor.getSelectedItem().toString();

        
        control_articulos ctrl = new control_articulos();
        if(!des.equals(""))
         {          
        if(ctrl.ingresar_articulo(null,des,preve,precos,sto,tipo,prov,fecha))
         {            
        JOptionPane.showMessageDialog(null,"El articulo se registro con exito");
        merc = merc++;
        limpiar();
        bloquear_cajas();
         }
        else
         {
            JOptionPane.showMessageDialog(null,"Error al registrar el articulo","Mensaje",JOptionPane.INFORMATION_MESSAGE);
         }
         }
         else
         {
             JOptionPane.showMessageDialog(this, "Hay campos obligatorios");  
         }
    }//GEN-LAST:event_registrarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
         bloquear_cajas();
         limpiar();
    }//GEN-LAST:event_cancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JToggleButton cancelar;
    private javax.swing.JTextField cant_prod;
    private javax.swing.JComboBox<String> comboproveedor;
    private javax.swing.JComboBox<String> combotipo;
    private javax.swing.JTextField descripcion_prod;
    private javax.swing.JToggleButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JToggleButton nuevoreg;
    private javax.swing.JTextField pre_costo;
    private javax.swing.JTextField pre_venta;
    private javax.swing.JToggleButton registrar;
    // End of variables declaration//GEN-END:variables
}
