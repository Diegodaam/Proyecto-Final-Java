/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectofinal;

import com.mycompany.proyectofinal.ListSubject;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author Diego
 */
public class JFrameMenu extends javax.swing.JFrame {

    private ListSubject list = new ListSubject(null, 0);

    /**
     * Creates new form JFrameMenu
     */
    public JFrameMenu() {
        initComponents();
        
        //IMAGEN DEL CURSOR 

        ImageIcon img = new ImageIcon("C:\\Users\\Diego\\Documents\\NetBeansProjects\\ProyectoFinal\\src\\Recursor\\Cursores\\Cursor2.png");
        
        Cursor c;
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        c = tk.createCustomCursor(img.getImage(), new Point(1,1), null);
        
        jMenuCalAverage.setCursor(c);
        jMenuAgenda.setCursor(c);
        jMenuCarts.setCursor(c);
        
        jMenuItemRegisterSubject.setCursor(c);
        jMenuItemReport.setCursor(c);
       // jMenuItemRecomendation.setCursor(c);
        
        ////////////////Titulo de la aplicacion//////////////////////////////
        
        setTitle("EduPlanner");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Icono para la aplicación
        setIconImage(new ImageIcon("C:\\Users\\Diego\\Documents\\NetBeansProjects\\ProyectoFinal\\src\\Recursor\\LogotipoGrande.png").getImage());

        setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCalAverage = new javax.swing.JMenu();
        jMenuItemRegisterSubject = new javax.swing.JMenuItem();
        jMenuItemReport = new javax.swing.JMenuItem();
        jMenuAgenda = new javax.swing.JMenu();
        jMenuCarts = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jMenuCalAverage.setText("Calculadora de promedio");

        jMenuItemRegisterSubject.setText("Registrar materia");
        jMenuItemRegisterSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegisterSubjectActionPerformed(evt);
            }
        });
        jMenuCalAverage.add(jMenuItemRegisterSubject);

        jMenuItemReport.setText("Reporte y Recomendaciones");
        jMenuItemReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReportActionPerformed(evt);
            }
        });
        jMenuCalAverage.add(jMenuItemReport);

        jMenuBar1.add(jMenuCalAverage);

        jMenuAgenda.setText("Agenda academica");
        jMenuBar1.add(jMenuAgenda);

        jMenuCarts.setText("Cartas de estudio");
        jMenuBar1.add(jMenuCarts);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemRegisterSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegisterSubjectActionPerformed
        JInternalFrameRegisterSubject registerSubject = new JInternalFrameRegisterSubject();
        jDesktopPane1.add(registerSubject);
        registerSubject.show();
    }//GEN-LAST:event_jMenuItemRegisterSubjectActionPerformed

    private void jMenuItemReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReportActionPerformed
     
        Reporte reporteFrame = new Reporte(list);
       jDesktopPane1.add(reporteFrame);
    reporteFrame.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItemReportActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenuAgenda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jMenuCalAverage;
    private javax.swing.JMenu jMenuCarts;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemRegisterSubject;
    private javax.swing.JMenuItem jMenuItemReport;
    // End of variables declaration//GEN-END:variables
}
