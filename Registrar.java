package diet.eat.ventanas;

import diet.eat.User;
import diet.eat.UserLogic;
import javax.swing.JOptionPane;

public class Registrar extends javax.swing.JFrame {

    public Registrar() {
        initComponents();
        TElefono.setVisible(true);
USUario.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NOmbre = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        APellido = new javax.swing.JLabel();
        Apellido = new javax.swing.JTextField();
        DOcumento = new javax.swing.JLabel();
        Documento = new javax.swing.JTextField();
        Volver = new javax.swing.JButton();
        COrreo = new javax.swing.JLabel();
        Correo = new javax.swing.JTextField();
        COntrasena2 = new javax.swing.JLabel();
        COntrasena = new javax.swing.JLabel();
        situación = new javax.swing.JComboBox<>();
        JBGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        Contrasena = new javax.swing.JPasswordField();
        Contrasena2 = new javax.swing.JPasswordField();
        Limpiar = new javax.swing.JButton();
        USuario = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        USUario = new javax.swing.JLabel();
        TElefono = new javax.swing.JLabel();
        Telefono = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diet/eat/ventanas/imaRegistrar/ilustracion.png"))); // NOI18N
        jPanel1.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("REGISTRATE!!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        NOmbre.setForeground(new java.awt.Color(153, 153, 153));
        NOmbre.setText("  Nombre");
        jPanel1.add(NOmbre, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 60, 20));

        Nombre.setForeground(new java.awt.Color(51, 51, 51));
        Nombre.setOpaque(false);
        Nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NombreMouseClicked(evt);
            }
        });
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 190, -1));

        APellido.setForeground(new java.awt.Color(153, 153, 153));
        APellido.setText(" Apellido");
        jPanel1.add(APellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 60, 20));

        Apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApellidoMouseClicked(evt);
            }
        });
        jPanel1.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 190, -1));

        DOcumento.setForeground(new java.awt.Color(153, 153, 153));
        DOcumento.setText("  Documento");
        jPanel1.add(DOcumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 80, 20));

        Documento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DocumentoMouseClicked(evt);
            }
        });
        jPanel1.add(Documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 180, -1));

        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diet/eat/ventanas/imaIconos/VOLVER.png"))); // NOI18N
        Volver.setText("VOLVER");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 120, 30));

        COrreo.setForeground(new java.awt.Color(153, 153, 153));
        COrreo.setText("  Correo Electronico");
        jPanel1.add(COrreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 120, 20));

        Correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CorreoMouseClicked(evt);
            }
        });
        jPanel1.add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 410, -1));

        COntrasena2.setForeground(new java.awt.Color(153, 153, 153));
        COntrasena2.setText("  Repetir contraseña");
        jPanel1.add(COntrasena2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 140, 20));

        COntrasena.setForeground(new java.awt.Color(153, 153, 153));
        COntrasena.setText("  Contraseña");
        jPanel1.add(COntrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 100, 20));

        situación.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿cual es tu situación?", "Para mejorar su salud medica", "Por alguna enfermedad", "Para ser un atleta" }));
        jPanel1.add(situación, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 420, -1));

        JBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diet/eat/ventanas/imaIconos/guardar.png"))); // NOI18N
        JBGuardar.setText("GUARDAR");
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(JBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 120, 30));

        observacion.setColumns(20);
        observacion.setRows(5);
        jScrollPane1.setViewportView(observacion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 420, 70));

        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("¿Alguna observacion segun su caso?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, -1, -1));

        Contrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContrasenaMouseClicked(evt);
            }
        });
        Contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 200, -1));

        Contrasena2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Contrasena2MouseClicked(evt);
            }
        });
        Contrasena2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contrasena2ActionPerformed(evt);
            }
        });
        jPanel1.add(Contrasena2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 190, -1));

        Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diet/eat/ventanas/imaIconos/BORRAR.png"))); // NOI18N
        Limpiar.setText("LIMPIAR");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 120, 30));

        USuario.setForeground(new java.awt.Color(153, 153, 153));
        USuario.setText("Usuario");
        jPanel1.add(USuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 70, 20));

        Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsuarioMouseClicked(evt);
            }
        });
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 230, -1));

        USUario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diet/eat/ventanas/imaIconos/USUARIO.png"))); // NOI18N
        jPanel1.add(USUario, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));

        TElefono.setForeground(new java.awt.Color(153, 153, 153));
        TElefono.setText("Telefono");
        jPanel1.add(TElefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 70, 30));

        try {
            Telefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###) ### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 190, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreMouseClicked
        NOmbre.setVisible(false);
    }//GEN-LAST:event_NombreMouseClicked

    private void ApellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApellidoMouseClicked
        APellido.setVisible(false);
        NOmbre.setVisible(false);
              
    }//GEN-LAST:event_ApellidoMouseClicked

    private void DocumentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocumentoMouseClicked
        DOcumento.setVisible(false);
    }//GEN-LAST:event_DocumentoMouseClicked

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Login ventana = new Login();
        ventana.setVisible(true);
        ventana.setLocation(150, 100);
        ventana.setSize(950, 550);
        ventana.setResizable(false);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_VolverActionPerformed

    private void CorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CorreoMouseClicked
        COrreo.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoMouseClicked

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        if (!Nombre.getText().isEmpty() && !Apellido.getText().isEmpty()&&!Usuario.getText().isEmpty() && !Documento.getText().isEmpty() && !Correo.getText().isEmpty() && !Contrasena.getText().isEmpty() && !Contrasena2.getText().isEmpty()&& !Telefono.getText().isEmpty()) {
            if (Contrasena.getText().equals(Contrasena2.getText())) {
                User user = new User(Usuario.getText(), Contrasena2.getText());
                if (UserLogic.insert(user)) {
                    JOptionPane.showMessageDialog(this, "Usuario Registrado con exito");
                    Login ventana = new Login();
                    ventana.setVisible(true);
                    ventana.setLocation(100, 150);
                    ventana.setSize(960,540);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Usuario ya existente");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden");
            }

        } else {
            JOptionPane.showMessageDialog(this, "  Debes completar las casillas \n faltantes o hay valores invalidos");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void ContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContrasenaActionPerformed

    }//GEN-LAST:event_ContrasenaActionPerformed

    private void ContrasenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContrasenaMouseClicked
        COntrasena.setVisible(false);
        USUario.setVisible(true);
    }//GEN-LAST:event_ContrasenaMouseClicked

    private void Contrasena2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Contrasena2MouseClicked
        COntrasena2.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_Contrasena2MouseClicked

    private void Contrasena2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contrasena2ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_Contrasena2ActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
Nombre.setText("");
NOmbre.setVisible(true);
Apellido.setText("");
APellido.setVisible(true);
Documento.setText("");
DOcumento.setVisible(true);
Correo.setText("");
COrreo.setVisible(true);
Usuario.setText("");
USuario.setVisible(true);
Contrasena.setText("");
COntrasena.setVisible(true);
Contrasena2.setText("");
COntrasena2.setVisible(true);
USUario.setVisible(false);
Telefono.setText("");

    }//GEN-LAST:event_LimpiarActionPerformed

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
    
    }//GEN-LAST:event_UsuarioActionPerformed

    private void UsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioMouseClicked
         USuario.setVisible(false); 
      
    }//GEN-LAST:event_UsuarioMouseClicked

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoActionPerformed
TElefono.setVisible(false);    
    }//GEN-LAST:event_TelefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel APellido;
    private javax.swing.JTextField Apellido;
    private javax.swing.JLabel COntrasena;
    private javax.swing.JLabel COntrasena2;
    private javax.swing.JLabel COrreo;
    private javax.swing.JPasswordField Contrasena;
    private javax.swing.JPasswordField Contrasena2;
    private javax.swing.JTextField Correo;
    private javax.swing.JLabel DOcumento;
    private javax.swing.JTextField Documento;
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JLabel NOmbre;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel TElefono;
    private javax.swing.JFormattedTextField Telefono;
    private javax.swing.JLabel USUario;
    private javax.swing.JLabel USuario;
    private javax.swing.JTextField Usuario;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea observacion;
    private javax.swing.JComboBox<String> situación;
    // End of variables declaration//GEN-END:variables
}
