package diet.eat.ventanas;

import diet.eat.*;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.ocultar.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        usuarioT = new javax.swing.JTextField();
        passwordT = new javax.swing.JPasswordField();
        registrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        iniciar = new javax.swing.JButton();
        olvidar = new javax.swing.JLabel();
        facebook = new javax.swing.JButton();
        google = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        ocultar = new javax.swing.JLabel();
        visible = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1);
        jPanel1.setBounds(1377, 606, 0, 0);

        jPanel2.setBackground(new java.awt.Color(240, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("PASSWORD:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        usuarioT.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usuarioT.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usuarioT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTActionPerformed(evt);
            }
        });
        jPanel2.add(usuarioT, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 180, -1));
        usuarioT.getAccessibleContext().setAccessibleName("");

        passwordT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTActionPerformed(evt);
            }
        });
        jPanel2.add(passwordT, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 150, -1));

        registrar.setForeground(new java.awt.Color(51, 102, 255));
        registrar.setText("Registrar");
        registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarMouseClicked(evt);
            }
        });
        jPanel2.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

        jLabel1.setText("USUARIO:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        iniciar.setText("INICIAR SESIÓN");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });
        jPanel2.add(iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, -1, 30));

        olvidar.setForeground(new java.awt.Color(51, 102, 255));
        olvidar.setText("¿Olvidó su contraseña?");
        olvidar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                olvidarMouseClicked(evt);
            }
        });
        jPanel2.add(olvidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diet/eat/ventanas/imaLogin/facebook.png"))); // NOI18N
        facebook.setText("Seguir usando Facebook");
        facebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facebookActionPerformed(evt);
            }
        });
        jPanel2.add(facebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 210, -1));

        google.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diet/eat/ventanas/imaLogin/google.png"))); // NOI18N
        google.setText("Seguir usando Google");
        google.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                googleActionPerformed(evt);
            }
        });
        jPanel2.add(google, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 210, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diet/eat/ventanas/imaLogin/logo png (1).png"))); // NOI18N
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });
        jPanel2.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diet/eat/ventanas/imaLogin/ocultar.png"))); // NOI18N
        ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarMouseClicked(evt);
            }
        });
        jPanel2.add(ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        visible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diet/eat/ventanas/imaLogin/visible.png"))); // NOI18N
        visible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visibleMouseClicked(evt);
            }
        });
        jPanel2.add(visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diet/eat/ventanas/imaLogin/panel2.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 10, 450, 520));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(280, 0, 400, 520);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diet/eat/ventanas/imaLogin/fondoInteractivo.gif"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-20, 0, 960, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTActionPerformed

    }//GEN-LAST:event_usuarioTActionPerformed

    private void passwordTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTActionPerformed

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed

        if (usuarioT.getText().isEmpty() || passwordT.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "hay un campo vacio");
        } else if (UserLogic.autentificar(usuarioT.getText(), passwordT.getText())) {

            Inicio2 Fr = new Inicio2();
            Fr.setVisible(true);
            Fr.setLocationRelativeTo(null);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "El usuario o contraseña son incorrectos");
        }


    }//GEN-LAST:event_iniciarActionPerformed

    private void ocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarMouseClicked
        visible.setVisible(true);
        ocultar.setVisible(false);
        passwordT.setEchoChar('●');

        // TODO add your handling code here:
    }//GEN-LAST:event_ocultarMouseClicked

    private void visibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visibleMouseClicked
        visible.setVisible(false);
        ocultar.setVisible(true);
        passwordT.setEchoChar((char) 0);

        // TODO add your handling code here:
    }//GEN-LAST:event_visibleMouseClicked

    private void olvidarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olvidarMouseClicked
        olvidar ve = new olvidar();
        ve.setVisible(true);
        ve.setLocationRelativeTo(null);
        ve.setResizable(false);
        ve.setSize(400, 580);
        ve.setTitle("Olvido su contraseña");


    }//GEN-LAST:event_olvidarMouseClicked

    private void registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseClicked
        Registrar re = new Registrar();
        re.setVisible(true);
        re.setLocationRelativeTo(null);
        re.setResizable(false);
     
        this.dispose();


    }//GEN-LAST:event_registrarMouseClicked

    private void googleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_googleActionPerformed
        Insecion google = new Insecion();
        google.setVisible(true);
        google.setResizable(false);
        google.setLocationRelativeTo(null);
        google.setSize(400, 580);
        google.setTitle("Sing In - Google Accounts");


    }//GEN-LAST:event_googleActionPerformed

    private void facebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facebookActionPerformed
        Facebook facebook = new Facebook();
        facebook.setVisible(true);
        facebook.setLocationRelativeTo(null);
        facebook.setResizable(false);
        facebook.setSize(443, 643);
        facebook.setTitle("Sing In - Facebook Acounts");

        // TODO add your handling code here:
    }//GEN-LAST:event_facebookActionPerformed

    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked

    }//GEN-LAST:event_logoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton facebook;
    private javax.swing.JButton google;
    private javax.swing.JButton iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel ocultar;
    private javax.swing.JLabel olvidar;
    private javax.swing.JPasswordField passwordT;
    private javax.swing.JLabel registrar;
    private javax.swing.JTextField usuarioT;
    private javax.swing.JLabel visible;
    // End of variables declaration//GEN-END:variables
}
