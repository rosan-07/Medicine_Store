/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KIIT
 */
public class Profile extends javax.swing.JFrame {
User_db b=new User_db();
    /**
     * Creates new form Profile
     */
    public Profile() {
        initComponents();
    }
    
    public Profile(User_db b1) {
        b=b1;
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

        Change_Pin = new javax.swing.JButton();
        Change_Info = new javax.swing.JButton();
        Check_History = new javax.swing.JButton();
        Close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Change_Pin.setText("Change Pin");
        Change_Pin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_PinMouseClicked(evt);
            }
        });
        getContentPane().add(Change_Pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        Change_Info.setText("Change Info");
        Change_Info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_InfoMouseClicked(evt);
            }
        });
        Change_Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Change_InfoActionPerformed(evt);
            }
        });
        getContentPane().add(Change_Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        Check_History.setText("Check Order History");
        Check_History.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Check_HistoryMouseClicked(evt);
            }
        });
        Check_History.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check_HistoryActionPerformed(evt);
            }
        });
        getContentPane().add(Check_History, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        Close.setText("Close");
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Change_InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Change_InfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Change_InfoActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CloseActionPerformed

    private void Change_PinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Change_PinMouseClicked
        // TODO add your handling code here:
        new Change_pin(b).setVisible(true);
    }//GEN-LAST:event_Change_PinMouseClicked

    private void Check_HistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check_HistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Check_HistoryActionPerformed

    private void Check_HistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Check_HistoryMouseClicked
        // TODO add your handling code here:
        new Order_history(b.u_id).setVisible(true);
    }//GEN-LAST:event_Check_HistoryMouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        // TODO add your handling code here:
        new Home(b).setVisible(true);
        dispose();
    }//GEN-LAST:event_CloseMouseClicked

    private void Change_InfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Change_InfoMouseClicked
        // TODO add your handling code here:
        new Change_info(b).setVisible(true);
    }//GEN-LAST:event_Change_InfoMouseClicked

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Change_Info;
    private javax.swing.JButton Change_Pin;
    private javax.swing.JButton Check_History;
    private javax.swing.JButton Close;
    // End of variables declaration//GEN-END:variables
}
