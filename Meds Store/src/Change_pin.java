
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KIIT
 */
public class Change_pin extends javax.swing.JFrame {
User_db b=new User_db();
    /**
     * Creates new form Change_pin
     */
    public Change_pin() {
        initComponents();
    }
    
    public Change_pin(User_db b1) {
        b=b1;
        b.extract_pin();
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

        jLabel1 = new javax.swing.JLabel();
        old_p = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        new_p = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Enter Old Pin");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 98, 80, -1));

        old_p.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        old_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                old_pActionPerformed(evt);
            }
        });
        getContentPane().add(old_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 123, 80, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Enter New Pin");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 179, -1, -1));

        new_p.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(new_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 204, 80, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Submit");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 253, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void old_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_old_pActionPerformed
        // TODO add your handling code here:
               
    }//GEN-LAST:event_old_pActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         if(new_p.getText().length()!=4){
            JOptionPane.showMessageDialog(null,"Pin must be of 4-Digit !!!");
             return;
        }
         if(old_p.getText().equals(b.u_p)&& new_p.getText().equals(b.u_p)){
             JOptionPane.showMessageDialog(null,"New Pin should be different from old one !");
             return; }
         if(old_p.getText().equals(b.u_p)&& new_p.getText()!=(b.u_p)){
             String p=new_p.getText();
             b.change_pin(new_p.getText());
             JOptionPane.showMessageDialog(null,"Pin successfully changed !");
             dispose();
             return; }
         if(!old_p.getText().equals(b.u_p)){
             JOptionPane.showMessageDialog(null,"You have entered wrong old pin !");
             return; }
 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Change_pin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Change_pin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Change_pin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Change_pin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Change_pin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField new_p;
    private javax.swing.JPasswordField old_p;
    // End of variables declaration//GEN-END:variables
}
