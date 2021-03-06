/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package OOP_InnerPeace;

import java.awt.Color;

/**
 *
 * @author Aspire 5
 */
public class MenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MenuUser
     */
    public MenuAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelGreetingAdmin = new javax.swing.JLabel();
        ButtonLogOut = new javax.swing.JButton();
        ButtonAppointmentStatus = new javax.swing.JButton();
        ButtonUserData = new javax.swing.JButton();
        LogoInnerPeace = new javax.swing.JLabel();
        BackgroundRainbow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("InnerPeace");
        setName("MenuUser"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(709, 483));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelGreetingAdmin.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        LabelGreetingAdmin.setForeground(new java.awt.Color(0, 102, 153));
        LabelGreetingAdmin.setText("Welcome back, admin.");
        getContentPane().add(LabelGreetingAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 70));

        ButtonLogOut.setBackground(java.awt.Color.pink);
        ButtonLogOut.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        ButtonLogOut.setForeground(new java.awt.Color(0, 102, 153));
        ButtonLogOut.setText("Log Out");
        ButtonLogOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonLogOut.setBorderPainted(false);
        ButtonLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonLogOutMouseExited(evt);
            }
        });
        ButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 150, 40));

        ButtonAppointmentStatus.setBackground(java.awt.Color.pink);
        ButtonAppointmentStatus.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        ButtonAppointmentStatus.setForeground(new java.awt.Color(0, 102, 153));
        ButtonAppointmentStatus.setText("User Appointment Status");
        ButtonAppointmentStatus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonAppointmentStatus.setBorderPainted(false);
        ButtonAppointmentStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonAppointmentStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonAppointmentStatusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonAppointmentStatusMouseExited(evt);
            }
        });
        getContentPane().add(ButtonAppointmentStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 340, 60));

        ButtonUserData.setBackground(java.awt.Color.pink);
        ButtonUserData.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        ButtonUserData.setForeground(new java.awt.Color(0, 102, 153));
        ButtonUserData.setText("Manage User Data");
        ButtonUserData.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonUserData.setBorderPainted(false);
        ButtonUserData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonUserData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonUserDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonUserDataMouseExited(evt);
            }
        });
        ButtonUserData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUserDataActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonUserData, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 340, 60));

        LogoInnerPeace.setIcon(new javax.swing.ImageIcon("D:\\Buat kuliah\\Semester 2\\OOP\\TugasBesar\\TubesInnerPeace\\src\\main\\java\\OOP_InnerPeace\\logo_innerpeace1.png")); // NOI18N
        getContentPane().add(LogoInnerPeace, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 260, 480));

        BackgroundRainbow.setIcon(new javax.swing.ImageIcon("D:\\Buat kuliah\\Semester 2\\OOP\\TugasBesar\\TubesInnerPeace\\src\\main\\java\\OOP_InnerPeace\\ombreBackGround.jpg")); // NOI18N
        BackgroundRainbow.setPreferredSize(new java.awt.Dimension(709, 483));
        getContentPane().add(BackgroundRainbow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonUserDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUserDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonUserDataActionPerformed

    private void ButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLogOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLogOutActionPerformed

    private void ButtonUserDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonUserDataMouseEntered
        ButtonUserData.setBackground(Color.lightGray);
    }//GEN-LAST:event_ButtonUserDataMouseEntered

    private void ButtonUserDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonUserDataMouseExited
        ButtonUserData.setBackground(Color.pink);
    }//GEN-LAST:event_ButtonUserDataMouseExited

    private void ButtonAppointmentStatusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAppointmentStatusMouseEntered
        ButtonAppointmentStatus.setBackground(Color.lightGray);
    }//GEN-LAST:event_ButtonAppointmentStatusMouseEntered

    private void ButtonAppointmentStatusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAppointmentStatusMouseExited
        ButtonAppointmentStatus.setBackground(Color.pink);
    }//GEN-LAST:event_ButtonAppointmentStatusMouseExited

    private void ButtonLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLogOutMouseEntered
        ButtonLogOut.setBackground(Color.lightGray);
    }//GEN-LAST:event_ButtonLogOutMouseEntered

    private void ButtonLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLogOutMouseExited
        ButtonLogOut.setBackground(Color.pink);
    }//GEN-LAST:event_ButtonLogOutMouseExited

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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundRainbow;
    private javax.swing.JButton ButtonAppointmentStatus;
    private javax.swing.JButton ButtonLogOut;
    private javax.swing.JButton ButtonUserData;
    private javax.swing.JLabel LabelGreetingAdmin;
    private javax.swing.JLabel LogoInnerPeace;
    // End of variables declaration//GEN-END:variables
}
