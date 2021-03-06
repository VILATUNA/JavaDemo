package vistas;

import vistas.PRINCIPAL;
import java.awt.Color;
import controlador.CONTROL_USUARIOS;
import java.util.Date;
import javax.swing.JOptionPane;

public class FORMULARIO_CONDUCTOR extends javax.swing.JFrame {
    
    public FORMULARIO_CONDUCTOR() {
        initComponents();
        nombre.setText("");
        apellido.setText("");
        correo.setText("");
        usuario.setText("");
        contraseña.setText("");
        usuario.setEnabled(false);
        contraseña.setEnabled(false);
        registrarse.setEnabled(false);
    }    
    public FORMULARIO_CONDUCTOR(String nombre1,String apellido1, String cedula1,String sexo1, String correo1,Date fechanac,String Usuario1,String contraseña1,String tipo1,Date fechali  ){
        initComponents();
        nombre.setText(nombre1);
        apellido.setText(apellido1);
        cedula.setText(cedula1);
        sexo.setSelectedItem(sexo1);
        correo.setText(correo1);
        jDateChooser1.setDate(fechanac);
        usuario.setText(Usuario1);
        contraseña.setText(contraseña1);
        tipo.setSelectedItem(tipo1);
        jDateChooser2.setDate(fechali);
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textocedula = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        validar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        sexo = new javax.swing.JComboBox<>();
        cedula = new javax.swing.JFormattedTextField();
        contraseña = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        tipo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        registrarse = new javax.swing.JButton();
        regresar = new javax.swing.JButton();

        setUndecorated(true);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("POLIDRIVER"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perfil (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 80, 80));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Personales"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel3.setText("Apellido:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        textocedula.setText("Cédula:");
        jPanel2.add(textocedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel5.setText("Sexo:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel6.setText("Correo electrónico:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        validar.setText("Validar los Datos");
        validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarActionPerformed(evt);
            }
        });
        jPanel2.add(validar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));

        jLabel7.setText("Fecha de Nacimiento:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel8.setText("Credenciales");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jDateChooser1.setMaxSelectableDate(new java.util.Date(1009864863000L));
        jDateChooser1.setMinSelectableDate(new java.util.Date(-946749537000L));
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 150, -1));

        jLabel9.setText("Usuario:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));
        jPanel2.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 150, -1));

        jLabel10.setText("Contraseña:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));
        jPanel2.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 150, -1));
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 150, -1));
        jPanel2.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 150, -1));

        sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        jPanel2.add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 150, -1));

        try {
            cedula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 150, -1));
        jPanel2.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 150, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la Licencia"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "F", "A1", "C", "C1", "D", "D1", "E", "E1", "G" }));
        jPanel4.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 120, -1));

        jLabel11.setText("Tipo de licencia");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel12.setText("Fecha de expiración:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));
        jPanel4.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 120, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 360, 130));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 420, 600));

        registrarse.setText("Siguiente");
        registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarseActionPerformed(evt);
            }
        });
        jPanel1.add(registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 110, -1));

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, 110, -1));

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        new PRINCIPAL().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void validarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validarActionPerformed
        CONTROL_USUARIOS c = new CONTROL_USUARIOS();
        if(c.validar_cedula(cedula.getText())==false){
        if(c.validar_campos_pasajero(nombre, apellido, cedula, correo)==true)
        {
            textocedula.setText("Cédula(Ya utilizada)");
            textocedula.setBackground(Color.red);
            usuario.setText(cedula.getText());
            contraseña.setEnabled(true);
            registrarse.setEnabled(true);
            c.pintar_campos_pasajero(nombre, apellido, cedula, correo,textocedula);
        }else {
        JOptionPane.showConfirmDialog(null, "CORREGIR CAMPOS EN ROJO", "Campos erroneos", JOptionPane.DEFAULT_OPTION);
        } 
        
        }
       
        
    }//GEN-LAST:event_validarActionPerformed

    private void registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseActionPerformed
        if(contraseña.getText().isEmpty()==false){
            FORMULARIO_VEHICULO ve = new FORMULARIO_VEHICULO(nombre.getText(), apellido.getText(), cedula.getText(), sexo.getSelectedItem().toString(),correo.getText(), jDateChooser1.getDate(), usuario.getText(),contraseña.getText(),tipo.getSelectedItem().toString(), jDateChooser2.getDate());
            ve.setLocationRelativeTo(null);
            ve.setVisible(true);
            this.dispose();
        }else{ 
            JOptionPane.showConfirmDialog(null, "Debe ingresar una contraseña", "Campos erroneos", JOptionPane.DEFAULT_OPTION);
            contraseña.setBackground(Color.red);
        }
    }//GEN-LAST:event_registrarseActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JFormattedTextField cedula;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JTextField correo;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton registrarse;
    private javax.swing.JButton regresar;
    private javax.swing.JComboBox<String> sexo;
    private javax.swing.JLabel textocedula;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JTextField usuario;
    private javax.swing.JButton validar;
    // End of variables declaration//GEN-END:variables
}
