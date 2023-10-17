/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;

/**
 *
 * @author Jean
 */

//<a href="https://www.flaticon.es/iconos-gratis/pizza" title="pizza iconos">Pizza iconos creados por Freepik - Flaticon</a>

public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        // mostrara el jform de bienvenida al iniciar
        initComponents();
        //Bienvenida p0 = new Bienvenida(); **remplazado por el form de menú
        // p0.setSize(1010,492);// forzamos a darle el tamaño para evitar errores
        //p0.setLocation(0, 0); //centra

        FrmMenu p0 = new FrmMenu();
        ShowPanel(p0);

        Contenido.removeAll();
        Contenido.add(p0, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
        this.setTitle("Registro Hotel Colonial");
        /*
         */

    }
    
    
    //ICONO DEL SISTEMA

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/logo panchis 50 x50 px.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        Titulo_header = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        jbtnUsuario = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        Separator2 = new javax.swing.JSeparator();
        Separator1 = new javax.swing.JSeparator();
        jbtnProducto = new javax.swing.JButton();
        Separator3 = new javax.swing.JSeparator();
        Separator4 = new javax.swing.JSeparator();
        Separator5 = new javax.swing.JSeparator();
        jbtnFacturar = new javax.swing.JButton();
        Separator6 = new javax.swing.JSeparator();
        jbtnReportes = new javax.swing.JButton();
        Separator7 = new javax.swing.JSeparator();
        Separator8 = new javax.swing.JSeparator();
        jbtnHistorial = new javax.swing.JButton();
        jbtnMenu = new javax.swing.JButton();
        Separator9 = new javax.swing.JSeparator();
        jbtnCliente = new javax.swing.JButton();
        jbtnCheck = new javax.swing.JButton();
        Contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(255, 255, 204));
        Header.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Titulo_header.setBackground(new java.awt.Color(0, 0, 0));
        Titulo_header.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        Titulo_header.setText("SISTEMA DE REGISTO  ");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoColonialMono 100X100.png"))); // NOI18N

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(419, Short.MAX_VALUE)
                .addComponent(Titulo_header)
                .addGap(196, 196, 196)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Titulo_header)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );

        Background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 1210, 110));

        Menu.setBackground(new java.awt.Color(255, 255, 204));
        Menu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Menu.setForeground(new java.awt.Color(51, 255, 255));
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jbtnUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jbtnUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/profile-user.png"))); // NOI18N
        jbtnUsuario.setText("USUARIO");
        jbtnUsuario.setBorder(null);
        jbtnUsuario.setBorderPainted(false);
        jbtnUsuario.setContentAreaFilled(false);
        jbtnUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUsuarioActionPerformed(evt);
            }
        });

        jbtnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/power.png"))); // NOI18N
        jbtnSalir.setText("CERRAR SESION");
        jbtnSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbtnSalir.setContentAreaFilled(false);
        jbtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        Separator2.setBackground(new java.awt.Color(255, 255, 204));
        Separator2.setForeground(new java.awt.Color(0, 0, 0));

        Separator1.setBackground(new java.awt.Color(255, 255, 204));
        Separator1.setForeground(new java.awt.Color(0, 0, 0));

        jbtnProducto.setBackground(new java.awt.Color(0, 0, 0));
        jbtnProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/box.png"))); // NOI18N
        jbtnProducto.setText("SERVICIOS");
        jbtnProducto.setToolTipText("");
        jbtnProducto.setBorder(null);
        jbtnProducto.setBorderPainted(false);
        jbtnProducto.setContentAreaFilled(false);
        jbtnProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnProductoActionPerformed(evt);
            }
        });

        Separator3.setBackground(new java.awt.Color(255, 255, 204));
        Separator3.setForeground(new java.awt.Color(0, 0, 0));

        Separator4.setBackground(new java.awt.Color(255, 255, 204));
        Separator4.setForeground(new java.awt.Color(0, 0, 0));

        Separator5.setBackground(new java.awt.Color(255, 255, 204));
        Separator5.setForeground(new java.awt.Color(0, 0, 0));

        jbtnFacturar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnFacturar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnFacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buy-button.png"))); // NOI18N
        jbtnFacturar.setText("FACTURAR");
        jbtnFacturar.setBorder(null);
        jbtnFacturar.setBorderPainted(false);
        jbtnFacturar.setContentAreaFilled(false);
        jbtnFacturar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFacturarActionPerformed(evt);
            }
        });

        Separator6.setBackground(new java.awt.Color(255, 255, 204));
        Separator6.setForeground(new java.awt.Color(0, 0, 0));

        jbtnReportes.setBackground(new java.awt.Color(0, 0, 0));
        jbtnReportes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/analytics.png"))); // NOI18N
        jbtnReportes.setText("REPORTES");
        jbtnReportes.setBorder(null);
        jbtnReportes.setBorderPainted(false);
        jbtnReportes.setContentAreaFilled(false);
        jbtnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReportesActionPerformed(evt);
            }
        });

        Separator7.setBackground(new java.awt.Color(255, 255, 204));
        Separator7.setForeground(new java.awt.Color(0, 0, 0));

        Separator8.setBackground(new java.awt.Color(255, 255, 204));
        Separator8.setForeground(new java.awt.Color(0, 0, 0));

        jbtnHistorial.setBackground(new java.awt.Color(0, 0, 0));
        jbtnHistorial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh.png"))); // NOI18N
        jbtnHistorial.setText("HABITACIONES");
        jbtnHistorial.setBorder(null);
        jbtnHistorial.setBorderPainted(false);
        jbtnHistorial.setContentAreaFilled(false);
        jbtnHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHistorialActionPerformed(evt);
            }
        });

        jbtnMenu.setBackground(new java.awt.Color(0, 0, 0));
        jbtnMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu.png"))); // NOI18N
        jbtnMenu.setText("MENU DEL DÍA");
        jbtnMenu.setBorder(null);
        jbtnMenu.setBorderPainted(false);
        jbtnMenu.setContentAreaFilled(false);
        jbtnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMenuActionPerformed(evt);
            }
        });

        Separator9.setBackground(new java.awt.Color(255, 255, 204));
        Separator9.setForeground(new java.awt.Color(0, 0, 0));
        Separator9.setEnabled(false);

        jbtnCliente.setBackground(new java.awt.Color(0, 0, 0));
        jbtnCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/costumer.png"))); // NOI18N
        jbtnCliente.setText("CLIENTE");
        jbtnCliente.setBorder(null);
        jbtnCliente.setBorderPainted(false);
        jbtnCliente.setContentAreaFilled(false);
        jbtnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClienteActionPerformed(evt);
            }
        });

        jbtnCheck.setBackground(new java.awt.Color(0, 0, 0));
        jbtnCheck.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mostrador-de-facturacion.png"))); // NOI18N
        jbtnCheck.setText("CHECK-IN");
        jbtnCheck.setBorder(null);
        jbtnCheck.setBorderPainted(false);
        jbtnCheck.setContentAreaFilled(false);
        jbtnCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbtnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Separator1)
                                    .addComponent(Separator2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                                        .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8))
                                    .addComponent(jbtnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Separator9)
                                    .addComponent(Separator8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Separator7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Separator6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Separator5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Separator4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Separator3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnFacturar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(jbtnProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnCheck, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(Separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jbtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        Background.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 109, 200, 500));

        Contenido.setBackground(new java.awt.Color(204, 204, 204));
        Contenido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Contenido.setPreferredSize(new java.awt.Dimension(1010, 500));

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1008, Short.MAX_VALUE)
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        Background.add(Contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 1010, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUsuarioActionPerformed
        FrmUsuario p1 = new FrmUsuario();
        ShowPanel(p1);

    }//GEN-LAST:event_jbtnUsuarioActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnProductoActionPerformed
        // TODO add your handling code here:
        FrmServicio p2 = new FrmServicio();
        ShowPanel(p2);

    }//GEN-LAST:event_jbtnProductoActionPerformed

    private void jbtnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClienteActionPerformed
        FrmCliente p3 = new FrmCliente();
        ShowPanel(p3);
    }//GEN-LAST:event_jbtnClienteActionPerformed

    private void jbtnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCheckActionPerformed
        // TODO add your handling code here:
        FrmCheck_In p4 = new FrmCheck_In();
        ShowPanel(p4);
    }//GEN-LAST:event_jbtnCheckActionPerformed

    private void jbtnFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFacturarActionPerformed
        // TODO add your handling code here:
        FrmFacturacion p5 = new FrmFacturacion();
        ShowPanel(p5);
    }//GEN-LAST:event_jbtnFacturarActionPerformed
    
    private void jbtnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReportesActionPerformed
        // TODO add your handling code here:
        FrmReportes p6 = new FrmReportes();
        ShowPanel(p6);
    }//GEN-LAST:event_jbtnReportesActionPerformed

    private void jbtnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHistorialActionPerformed
        // TODO add your handling code here:}}
        FrmHabitacion p7 = new FrmHabitacion();
        ShowPanel(p7);
    }//GEN-LAST:event_jbtnHistorialActionPerformed

    private void jbtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMenuActionPerformed
        // TODO add your handling code here:
        FrmMenu p8 = new FrmMenu();
        ShowPanel(p8);
    }//GEN-LAST:event_jbtnMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Invocar la ventana del panel de control
        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    public static javax.swing.JPanel Contenido;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JSeparator Separator3;
    private javax.swing.JSeparator Separator4;
    private javax.swing.JSeparator Separator5;
    private javax.swing.JSeparator Separator6;
    private javax.swing.JSeparator Separator7;
    private javax.swing.JSeparator Separator8;
    private javax.swing.JSeparator Separator9;
    private javax.swing.JLabel Titulo_header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtnCheck;
    private javax.swing.JButton jbtnCliente;
    private javax.swing.JButton jbtnFacturar;
    private javax.swing.JButton jbtnHistorial;
    private javax.swing.JButton jbtnMenu;
    private javax.swing.JButton jbtnProducto;
    private javax.swing.JButton jbtnReportes;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JButton jbtnUsuario;
    // End of variables declaration//GEN-END:variables

    //nos sirve para cambiar entre jpanels cuando presioanmos un boton en el dashboardd
    public static void ShowPanel(JPanel p) {

        p.setSize(1010, 500);// forzamos a darle el tamaño para evitar errores
        p.setLocation(0, 0); //centra
        Contenido.removeAll();//borras los panle anteriors
        Contenido.add(p, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();

    }
}
