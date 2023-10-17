/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import DAO.Crud_Usuario;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author Jean
 */
public class Login extends javax.swing.JFrame {

    // para abir la venta crear usuario
//    CrearUsuario op1;

    public Login() {
        initComponents();
        //creamos objetos del contenido
//        op1 = new CrearUsuario();
        // me sale error con la siguiente linea, lo añadi como comentario
        //add(op1);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Login Hotel Colonial");

    }
    //ICONO DEL SISTEMA

//    public Image getIconImage() {
//        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/logo panchis 50 x50 px.png"));
//        return retValue;
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jtxtusuario = new javax.swing.JTextField();
        jbtnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(204, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hotel_Colonial/src/Imagenes/Hotel_Login 500x500.jpg"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 420));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setText("INICIO DE SESION");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 210, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("USUARIO");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("CONTRASEÑA");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 300, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 300, 20));

        jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField1.setText("**************");
        jPasswordField1.setBorder(null);
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordField1MousePressed(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        background.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 300, 30));

        jtxtusuario.setForeground(new java.awt.Color(204, 204, 204));
        jtxtusuario.setText("Ingresa el nombre de usuario");
        jtxtusuario.setBorder(null);
        jtxtusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtxtusuarioMousePressed(evt);
            }
        });
        jtxtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtusuarioActionPerformed(evt);
            }
        });
        jtxtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtusuarioKeyPressed(evt);
            }
        });
        background.add(jtxtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 300, 30));

        jbtnIngresar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login.png"))); // NOI18N
        jbtnIngresar.setText("INGRESAR");
        jbtnIngresar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbtnIngresar.setContentAreaFilled(false);
        jbtnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnIngresarMouseClicked(evt);
            }
        });
        jbtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIngresarActionPerformed(evt);
            }
        });
        background.add(jbtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 130, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
        jPasswordField1.setText("");
        jPasswordField1.setForeground(Color.black);

    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jtxtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtusuarioActionPerformed

    private void jtxtusuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtusuarioMousePressed
        // codigo para que se borre texto del formulario y se pueda ingredar datos
        //el uso del if servira par que no se borren los datos luego de cambiar de campo
        if (jtxtusuario.getText().equals("Ingresa el nombre de usuario")) {
            jtxtusuario.setText("");
            jtxtusuario.setForeground(Color.black);
        }
        if (String.valueOf(jPasswordField1.getPassword()).isEmpty()) {
            jPasswordField1.setText("**************");
            jPasswordField1.setForeground(Color.gray);
        }

    }//GEN-LAST:event_jtxtusuarioMousePressed

    private void jPasswordField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MousePressed
        // TODO add your handling code here:
        if (String.valueOf(jPasswordField1.getPassword()).equals("**************")) {
            jPasswordField1.setText("");
            jPasswordField1.setForeground(Color.black);
        }
        if (jtxtusuario.getText().isEmpty()) {
            jtxtusuario.setText("Ingresa el nombre de usuario");
            jtxtusuario.setForeground(Color.gray);
        }


    }//GEN-LAST:event_jPasswordField1MousePressed

    private void jbtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIngresarActionPerformed
        // TODO add your handling code here:
        this.Login();

        //  javax.swing.JOptionPane.showMessageDialog(this,"Intendo de login con los datos:\nusuario: "+jtxtusuario.getText()+"\ncontraseña: "+ String.valueOf(jPasswordField1.getPassword()));
    }//GEN-LAST:event_jbtnIngresarActionPerformed

    private void jbtnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnIngresarMouseClicked
        // TODO add your handling code here:
        //this.Login();
    }//GEN-LAST:event_jbtnIngresarMouseClicked

    private void jtxtusuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtusuarioKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            jPasswordField1.requestFocus();
            jPasswordField1.setText(""); // Vaciar el campo jPasswordField1
        }
    }//GEN-LAST:event_jtxtusuarioKeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            this.Login();
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    /**
     * @param args the command line arguments
     */
    //inicio del static void main
    /**/
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    //fin del static void 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbtnIngresar;
    private javax.swing.JTextField jtxtusuario;
    // End of variables declaration//GEN-END:variables

    private void Login() {
        if (!jtxtusuario.getText().isEmpty() && !jPasswordField1.getText().isEmpty()) {
            Crud_Usuario controlUsuario = new Crud_Usuario();
            Usuario usuario = new Usuario();
            usuario.setUsuario(jtxtusuario.getText().trim());
            usuario.setPassword(jPasswordField1.getText().trim());
            if (controlUsuario.loginUser(usuario)) {
                //JOptionPane.showMessageDialog(null, "ingreso correcto");
                Dashboard menu = new Dashboard();
                menu.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "ingrese las credenciales correctas");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ingrese las credenciales correctas");
        }
    }
}