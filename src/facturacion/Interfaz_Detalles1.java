package facturacion;

import javax.swing.JOptionPane;

public class Interfaz_Detalles1 extends javax.swing.JInternalFrame {
    //control_empleados ctrl = new control_empleados();
    private Object [][] datostabla;
    public Interfaz_Detalles1() {
        initComponents();
        limpiar();
        bloquear_cajas();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        apellidosjTextField1 = new javax.swing.JTextField();
        nombresjTextField2 = new javax.swing.JTextField();
        dirjTextField3 = new javax.swing.JTextField();
        teljTextField4 = new javax.swing.JTextField();
        fechanacijTextField5 = new javax.swing.JTextField();
        estadocijTextField6 = new javax.swing.JTextField();
        emailjTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        estjTextField9 = new javax.swing.JTextField();
        fechaconjTextField10 = new javax.swing.JTextField();
        cargojTextField11 = new javax.swing.JTextField();
        horajTextField12 = new javax.swing.JTextField();
        saljTextField13 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cuijTextField15 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        idjTextField16 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        genjComboBox1 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setTitle("Detalles de empleado");

        jLabel1.setText("Apellidos");

        jLabel2.setText("Nombre");

        jLabel3.setText("Direccion");

        jLabel4.setText("Telefono");

        jLabel5.setText("Fecha de nacimiento");

        jLabel6.setText("Estado civil");

        jLabel7.setText("Genero");

        jLabel8.setText("E-mail");

        apellidosjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidosjTextField1ActionPerformed(evt);
            }
        });

        nombresjTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombresjTextField2ActionPerformed(evt);
            }
        });

        dirjTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirjTextField3ActionPerformed(evt);
            }
        });

        teljTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teljTextField4ActionPerformed(evt);
            }
        });

        fechanacijTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechanacijTextField5ActionPerformed(evt);
            }
        });

        estadocijTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadocijTextField6ActionPerformed(evt);
            }
        });

        emailjTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailjTextField8ActionPerformed(evt);
            }
        });

        jLabel9.setText("Estado");

        jLabel10.setText("Fecha de contratacion");

        jLabel11.setText("Cargo");

        jLabel12.setText("Horario laboral");

        jLabel13.setText("Salario");

        estjTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estjTextField9ActionPerformed(evt);
            }
        });

        fechaconjTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaconjTextField10ActionPerformed(evt);
            }
        });

        cargojTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargojTextField11ActionPerformed(evt);
            }
        });

        horajTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horajTextField12ActionPerformed(evt);
            }
        });

        saljTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saljTextField13ActionPerformed(evt);
            }
        });

        jLabel15.setText("CUI");

        cuijTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuijTextField15ActionPerformed(evt);
            }
        });

        jButton1.setText("salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar empleado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel16.setText("Id_Empleado");

        idjTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idjTextField16ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        genjComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selccione la opcion", "Masculino", "Femenino", "OTRO"}));
        genjComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                genjComboBox1ItemStateChanged(evt);
            }
        });
        genjComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genjComboBox1ActionPerformed(evt);
            }
        });

        jButton4.setText("Nuevo empleado");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(estadocijTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(emailjTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(genjComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel15)
                                .addComponent(jLabel1)))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fechanacijTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(teljTextField4)
                            .addComponent(nombresjTextField2)
                            .addComponent(apellidosjTextField1)
                            .addComponent(dirjTextField3)
                            .addComponent(cuijTextField15))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16)
                            .addComponent(jLabel12)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(horajTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(saljTextField13)
                            .addComponent(estjTextField9)
                            .addComponent(fechaconjTextField10)
                            .addComponent(cargojTextField11)
                            .addComponent(idjTextField16))
                        .addGap(209, 209, 209))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cuijTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(idjTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(apellidosjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(estjTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombresjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(fechaconjTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dirjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11)
                    .addComponent(cargojTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teljTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(horajTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechanacijTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13)
                    .addComponent(saljTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(estadocijTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(genjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(emailjTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void limpiar()
    {
       cuijTextField15.setText("");
       nombresjTextField2.setText("");
       apellidosjTextField1.setText("");
       dirjTextField3.setText("");
       teljTextField4.setText("");
       fechanacijTextField5.setText("");
       estadocijTextField6.setText("");
       genjComboBox1.setName("");
       emailjTextField8.setText("");
       idjTextField16.setText("");
       estjTextField9.setText("");
       fechaconjTextField10.setText("");
       cargojTextField11.setText("");
       horajTextField12.setText("");
       saljTextField13.setText("");
        
    }
    
    public void  bloquear_cajas()
    {
       cuijTextField15.setEnabled(false);
       nombresjTextField2.setEnabled(false);
       apellidosjTextField1.setEnabled(false);
       dirjTextField3.setEnabled(false);
       teljTextField4.setEnabled(false);
       fechanacijTextField5.setEnabled(false);
       estadocijTextField6.setEnabled(false);
       genjComboBox1.setEnabled(false);
       emailjTextField8.setEnabled(false);
       idjTextField16.setEnabled(false);
       estjTextField9.setEnabled(false);
       fechaconjTextField10.setEnabled(false);
       cargojTextField11.setEnabled(false);
       horajTextField12.setEnabled(false);
       saljTextField13.setEnabled(false);
       
       
    }
    
     public void  desbloquear()
    {
       cuijTextField15.setText("");
       nombresjTextField2.setText("");
       apellidosjTextField1.setText("");
       dirjTextField3.setText("");
       teljTextField4.setText("");
       fechanacijTextField5.setText("");
       estadocijTextField6.setText("");
       genjComboBox1.setName("");
       emailjTextField8.setText("");
       idjTextField16.setText("");
       estjTextField9.setText("");
       fechaconjTextField10.setText("");
       cargojTextField11.setText("");
       horajTextField12.setText("");
       saljTextField13.setText("");
        
    }
    
    public void  desbloquear_cajas()
    {
       cuijTextField15.setEnabled(true);
       nombresjTextField2.setEnabled(true);
       apellidosjTextField1.setEnabled(true);
       dirjTextField3.setEnabled(true);
       teljTextField4.setEnabled(true);
       fechanacijTextField5.setEnabled(true);
       estadocijTextField6.setEnabled(true);
       genjComboBox1.setEnabled(true);
       emailjTextField8.setEnabled(true);
       idjTextField16.setEnabled(true);
       estjTextField9.setEnabled(true);
       fechaconjTextField10.setEnabled(true);
       cargojTextField11.setEnabled(true);
       horajTextField12.setEnabled(true);
       saljTextField13.setEnabled(true);
       
    }
    
    
    private void apellidosjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidosjTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidosjTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        String id,cui, ape, nom, dir, fechanaci, tel, fechacon, gen, estadoci, email, cargo, hora, sal, est; 
       
        
        id = idjTextField16.getText();
        cui = cuijTextField15.getText();
//      tipo= combo_tipo.getSelectedItem().toString();
        ape = apellidosjTextField1.getText();
        nom = nombresjTextField2.getText();
        dir = dirjTextField3.getText();
        fechanaci = fechanacijTextField5.getText();
        tel = teljTextField4.getText();
        gen = genjComboBox1.getSelectedItem().toString();
        estadoci = estadocijTextField6.getText();
        email = emailjTextField8.getText();
        cargo = cargojTextField11.getText();
        hora = horajTextField12.getText();
        est = estjTextField9.getText();
        fechacon = fechaconjTextField10.getText();
        sal = saljTextField13.getText();
           
        
        
        
//        dir = dirclientejTextField4.getText();        
//        ciu = ciudad_combo.getSelectedItem().toString();
//        tel = telefonoclientjTextField1.getText();
        control_empleados contemp = new control_empleados(id,cui, ape, nom, dir, fechanaci, tel, fechacon, gen, estadoci, email, cargo, hora, sal, est);
        if(!id.equals("") && !cui.equals("") && !ape.equals("") && !nom.equals("") && !dir.equals("") && !fechanaci.equals("") && !tel.equals("") && !fechacon.equals("") && !gen.equals("") && !estadoci.equals("") && !email.equals("") && !cargo.equals("") && !hora.equals("") && !sal.equals("") && !est.equals("")) 
        {
        if(contemp.ingresar_empleados())
        {
        JOptionPane.showMessageDialog(null,"El empleado se registro con exito ","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        //bloquear_cajas();
        }
        else
        {
        JOptionPane.showMessageDialog(this, "Error al registrar el cliente");
        }
        }
        else
        {
          JOptionPane.showMessageDialog(this, "Hay campos obligatorios");  
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cuijTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuijTextField15ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cuijTextField15ActionPerformed

    private void nombresjTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombresjTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombresjTextField2ActionPerformed

    private void dirjTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirjTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dirjTextField3ActionPerformed

    private void teljTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teljTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teljTextField4ActionPerformed

    private void fechanacijTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechanacijTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechanacijTextField5ActionPerformed

    private void estadocijTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadocijTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadocijTextField6ActionPerformed

    private void emailjTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailjTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailjTextField8ActionPerformed

    private void idjTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idjTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idjTextField16ActionPerformed

    private void estjTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estjTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estjTextField9ActionPerformed

    private void fechaconjTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaconjTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaconjTextField10ActionPerformed

    private void cargojTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargojTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargojTextField11ActionPerformed

    private void horajTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horajTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horajTextField12ActionPerformed

    private void saljTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saljTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saljTextField13ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        bloquear_cajas();
        limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void genjComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genjComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genjComboBox1ActionPerformed

    private void genjComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_genjComboBox1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_genjComboBox1ItemStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        desbloquear_cajas();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidosjTextField1;
    private javax.swing.JTextField cargojTextField11;
    private javax.swing.JTextField cuijTextField15;
    private javax.swing.JTextField dirjTextField3;
    private javax.swing.JTextField emailjTextField8;
    private javax.swing.JTextField estadocijTextField6;
    private javax.swing.JTextField estjTextField9;
    private javax.swing.JTextField fechaconjTextField10;
    private javax.swing.JTextField fechanacijTextField5;
    private javax.swing.JComboBox<String> genjComboBox1;
    private javax.swing.JTextField horajTextField12;
    private javax.swing.JTextField idjTextField16;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombresjTextField2;
    private javax.swing.JTextField saljTextField13;
    private javax.swing.JTextField teljTextField4;
    // End of variables declaration//GEN-END:variables
}