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
public class MenuUser extends javax.swing.JFrame {

    /**
     * Creates new form MenuUser
     */
    public MenuUser() {
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

        LabelGreetingUser2 = new javax.swing.JLabel();
        LabelGreetingUser = new javax.swing.JLabel();
        ButtonLogOut = new javax.swing.JButton();
        ButtonOnlenConsult = new javax.swing.JButton();
        ButtonDiary = new javax.swing.JButton();
        LogoInnerPeace = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("InnerPeace");
        setName("MenuUser"); // NOI18N
        setPreferredSize(new java.awt.Dimension(709, 483));
        setResizable(false);
        setSize(new java.awt.Dimension(709, 483));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelGreetingUser2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 28)); // NOI18N
        LabelGreetingUser2.setForeground(new java.awt.Color(0, 102, 153));
        LabelGreetingUser2.setText("How can we help?");
        getContentPane().add(LabelGreetingUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 400, 70));

        LabelGreetingUser.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        LabelGreetingUser.setForeground(new java.awt.Color(0, 102, 153));
        LabelGreetingUser.setText("Hello, *username* :)");
        getContentPane().add(LabelGreetingUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 400, 70));

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

        ButtonOnlenConsult.setBackground(java.awt.Color.pink);
        ButtonOnlenConsult.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        ButtonOnlenConsult.setForeground(new java.awt.Color(0, 102, 153));
        ButtonOnlenConsult.setText("Talk to a Consultant");
        ButtonOnlenConsult.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonOnlenConsult.setBorderPainted(false);
        ButtonOnlenConsult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonOnlenConsult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonOnlenConsultMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonOnlenConsultMouseExited(evt);
            }
        });
        ButtonOnlenConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOnlenConsultActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonOnlenConsult, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 340, 60));

        ButtonDiary.setBackground(java.awt.Color.pink);
        ButtonDiary.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        ButtonDiary.setForeground(new java.awt.Color(0, 102, 153));
        ButtonDiary.setText("My Personal Diary");
        ButtonDiary.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonDiary.setBorderPainted(false);
        ButtonDiary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonDiary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonDiaryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonDiaryMouseExited(evt);
            }
        });
        ButtonDiary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDiaryActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonDiary, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 340, 60));

        LogoInnerPeace.setIcon(new javax.swing.ImageIcon("D:\\Buat kuliah\\Semester 2\\OOP\\TugasBesar\\TubesInnerPeace\\src\\main\\java\\OOP_InnerPeace\\logo_innerpeace1.png")); // NOI18N
        getContentPane().add(LogoInnerPeace, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 260, 450));

        jPanel1.setBackground(new java.awt.Color(77, 150, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonDiaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDiaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonDiaryActionPerformed

    private void ButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLogOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLogOutActionPerformed

    private void ButtonOnlenConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOnlenConsultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonOnlenConsultActionPerformed

    private void ButtonDiaryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonDiaryMouseEntered
        ButtonDiary.setBackground(Color.lightGray);
    }//GEN-LAST:event_ButtonDiaryMouseEntered

    private void ButtonDiaryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonDiaryMouseExited
        ButtonDiary.setBackground(Color.pink);
    }//GEN-LAST:event_ButtonDiaryMouseExited

    private void ButtonOnlenConsultMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonOnlenConsultMouseEntered
        ButtonOnlenConsult.setBackground(Color.lightGray);
    }//GEN-LAST:event_ButtonOnlenConsultMouseEntered

    private void ButtonOnlenConsultMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonOnlenConsultMouseExited
        ButtonOnlenConsult.setBackground(Color.pink);
    }//GEN-LAST:event_ButtonOnlenConsultMouseExited

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
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDiary;
    private javax.swing.JButton ButtonLogOut;
    private javax.swing.JButton ButtonOnlenConsult;
    private javax.swing.JLabel LabelGreetingUser;
    private javax.swing.JLabel LabelGreetingUser2;
    private javax.swing.JLabel LogoInnerPeace;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
