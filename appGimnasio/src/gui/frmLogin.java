package gui;

import connect.PassConnect;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logic.EncriptarPassword;
import logic.GestionUsuarios;
import logic.Usuarios;

public class frmLogin extends javax.swing.JFrame {

    GestionUsuarios gestionUsuarios = new GestionUsuarios();
    EncriptarPassword desencrip;
    PassConnect pc;
    public static String usuario = " ";
    public static String usuarioNo = " ";

    public frmLogin() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/LogoGym.png"));
        this.setIconImage(icon.getImage());
        desencrip = new EncriptarPassword();
        pc = new PassConnect("bdgimnasio", "root", "Jp100702");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/img/login.jpg"));
        Image image = icon.getImage();
        login = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);}
        };
        btnLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        chkPassword = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLogin.setBackground(new java.awt.Color(255, 102, 51));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barbell.png"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setDoubleBuffered(false);
        jPanel1.setEnabled(false);
        jPanel1.setFocusable(false);
        jPanel1.setOpaque(false);

        txtUser.setBackground(new java.awt.Color(204, 204, 204));
        txtUser.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });

        txtPass.setBackground(new java.awt.Color(204, 204, 204));
        txtPass.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });

        chkPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkPassword.setDoubleBuffered(true);
        chkPassword.setFocusPainted(false);
        chkPassword.setFocusable(false);
        chkPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkPassword.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        chkPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ver.png"))); // NOI18N
        chkPassword.setIconTextGap(1);
        chkPassword.setRequestFocusEnabled(false);
        chkPassword.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nover.png"))); // NOI18N
        chkPassword.setVerifyInputWhenFocusTarget(false);
        chkPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPasswordActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/candado.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkPassword))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnSalir.setBackground(new java.awt.Color(255, 102, 51));
        btnSalir.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salida.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        login.setLayer(btnLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        login.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        login.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        login.setLayer(btnSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(147, 147, 147))
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(100, Short.MAX_VALUE))))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Usuarios user = new Usuarios();
        usuario = txtUser.getText().trim();
//        Color colorError = new Color(211, 47, 47);
        Color colorError = new Color(240, 128, 128);
        Color colorDone = new Color(100, 204, 100);
        String Password = "";
//        Password = desencrip.deecnode(txtPass.getText().trim());

        String busqueda_usuario = gestionUsuarios.buscarUsuarioRegistrado(txtUser.getText());

//        if (busqueda_usuario.equals("Encontrado")) {
//            if (txtUser.getText().equals("admin")) {
//                txtUser.setBackground(colorDone);
//                txtPass.setBackground(colorDone);
//
//                JOptionPane.showMessageDialog(this, "Bienvenido, " + txtUser.getText());
//
//                frmPrincipal menu = new frmPrincipal();
//                menu.setVisible(true);
//                this.dispose();
//
//            }
//            if (!txtUser.getText().equals("admin")) {
//                if (Password.equals(user.getPass())) {
//                    JOptionPane.showMessageDialog(this, "Bienvenido, " + txtUser.getText());
//                    new frmPrincipal().setVisible(true);
//                    frmPrincipal.mnuSocios.setEnabled(false);
//                    frmPrincipal.mnuRegistroMembre.setEnabled(false);
//                    frmPrincipal.mnuMembresiaSocio.setEnabled(false);
//                }
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(this, "Usuario no encontrado");
//            JOptionPane.showMessageDialog(this, "User y/o contraseña incorrecto(s)\nIntente de nuevo", "Login", JOptionPane.ERROR_MESSAGE);
//            txtUser.setBackground(colorError);
//            txtPass.setBackground(colorError);
//
//        }
        if (!txtUser.getText().trim().equals("") && !txtPass.getText().trim().equals("")) {

            if (pc.Conectar()) {
                user = pc.GetUsuario(txtUser.getText().trim());
                Password = desencrip.ecnode(txtPass.getText().trim());
                if (busqueda_usuario.equals("No encontrado")) {

                    JOptionPane.showMessageDialog(null, "Este usuario no se encuentra registrado" + "\nIngrese nuevamente el usuarios y la contraseña");
                    txtUser.setText("");
                    txtPass.setText("");
                    txtUser.requestFocus();

                } else {
                    if (txtUser.getText().equals("admin")) {
                        if (Password.equals(user.getPass())) {
                            JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
                            txtUser.setBackground(colorDone);
                            txtPass.setBackground(colorDone);
                            frmPrincipal menu = new frmPrincipal();
                            menu.setVisible(true);
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "La contraseña es incorrecta");
                        }
                    } else {
                        if (Password.equals(user.getPass())) {
                            JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
                            txtUser.setBackground(colorDone);
                            txtPass.setBackground(colorDone);
                            frmPrincipal menu = new frmPrincipal();
                            frmPrincipal.mnuSocios.setVisible(false);
                            frmPrincipal.mnuRegistroMembre.setVisible(false);
                            frmPrincipal.mnuMembresiaSocio.setVisible(false);
                            frmPrincipal.mnuSeguridad.setVisible(false);
                            menu.setVisible(true);
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "La contraseña es incorrecta");
                        }
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Error al conectar");

            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese el usuario y contraseña");

        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void chkPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPasswordActionPerformed
        if (chkPassword.isSelected()) {
            txtPass.setEchoChar((char) 0);
        } else {
            txtPass.setEchoChar('*');

        }
    }//GEN-LAST:event_chkPasswordActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Desea salir del login para el sistema de control del Gym APJM?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resp == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtUser.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un user");
                txtUser.requestFocus();

            } else {
                btnLogin.doClick();
            }
        }
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtPass.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese una contraseña");
                txtPass.requestFocus();

            } else {
                btnLogin.doClick();
            }
        }
    }//GEN-LAST:event_txtPassKeyPressed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmLogin().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox chkPassword;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane login;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

}
