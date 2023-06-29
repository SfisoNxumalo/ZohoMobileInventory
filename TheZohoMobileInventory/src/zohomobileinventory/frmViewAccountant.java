/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zohomobileinventory;
import javax.swing.JOptionPane;
import java.util.Date;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import javax.swing.DefaultListModel;
/**
 *
 * @author User
 */
public class frmViewAccountant extends javax.swing.JFrame {

    /**
     * Creates new form frmViewAccountant
     */
    public frmViewAccountant() {
        initComponents();
        
        Date dtDate = new Date();
        lblDate.setText(dtDate.toString());     //DISPLAYS THE DATE
    }
    
    DefaultListModel<String> dlmList = new <String>DefaultListModel<String>();
    
    private void spViewAccountants()
    {
        String strLine;
        BufferedReader brReader = null;
        InputStreamReader isrReader = null;
        
        try
        {
            FileInputStream fisFin = new FileInputStream("Accountant Data.txt");
            isrReader = new InputStreamReader(fisFin);          //READS THE DATA IN THE ACCOUNTANT DATA TEXTFILE. 
            brReader = new BufferedReader(isrReader);
            
            while((strLine = brReader.readLine()) != null)
            {
               dlmList.addElement(strLine);                 //VIEWS THE ACCOUNTANT DETAILS IN A LIST
            }                               
            brReader.close();
            isrReader.close();
            fisFin.close();
        }
        catch(Exception EX)
        {
           JOptionPane.showMessageDialog(null, "System Cannot find  the specified file."); 
        }
        lstViewAccountant.setModel(dlmList);
    }
    
    private void spClear()
    {
       dlmList.removeAllElements();            //CLEARS THE LIST.
    }
    
    private void spBack()
    {
        frmAdmin frmAdmin = new frmAdmin();         //CALLS THE ADMIN FORM, ACTS AS A BACK BUTTON.
        frmAdmin.show();
        this.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnViewAccountants = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstViewAccountant = new javax.swing.JList();
        btnBack = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Accountant");

        btnViewAccountants.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnViewAccountants.setText("View Accountants");
        btnViewAccountants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAccountantsActionPerformed(evt);
            }
        });

        lstViewAccountant.setToolTipText("");
        jScrollPane1.setViewportView(lstViewAccountant);

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lblDate.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewAccountants)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnViewAccountants)
                        .addGap(40, 40, 40)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(btnBack)
                .addGap(17, 17, 17)
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewAccountantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAccountantsActionPerformed
spViewAccountants();        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewAccountantsActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
spClear();        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
spBack();        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(frmViewAccountant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmViewAccountant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmViewAccountant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmViewAccountant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmViewAccountant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnViewAccountants;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JList lstViewAccountant;
    // End of variables declaration//GEN-END:variables
}