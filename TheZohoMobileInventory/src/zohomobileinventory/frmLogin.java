/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zohomobileinventory;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author User
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
        initComponents();
        Date dtDate = new Date();
        lblDate.setText(dtDate.toString());         //DISPLAYS THE DATE
    }

private void spLogin()
{   
    String strUsername;
    String strPassword;
    String strLine;
    String strLine2;
    
    strUsername = txtUsername.getText();
    strPassword = pwdPassword.getText();

    BufferedReader brReader = null;
    InputStreamReader isrReader = null;
    
    
    try
    {
        
        FileInputStream fisFin = new FileInputStream("Accountant Data.txt");
            isrReader = new InputStreamReader(fisFin);          //THIS GUIDES THE CODE TO READ THE DATA CONTAINED IN THE "ACCOUNTANT DATA" TEXT FILE.
            brReader = new BufferedReader(isrReader);
            
            
            while((strLine = brReader.readLine()) != null && (strLine2 = brReader.readLine()) != null)      //READS THE DATA IN THE TEXT FILE.
            {
                if(strLine .equals (strUsername) && strLine2 .equals (strPassword))         //CHECKS IF THE ENTERED DETAILS ARE COORECT.
                {
                     frmAdmin frmAdmin = new frmAdmin();
                     frmAdmin.show();                           //IF LOGIN DETAILS ARE CORRECT, THE LOGIN FORM WILL APPEAR.
                     this.setVisible(false);
                }
                else
                {
                    lblWrong.setText("Wrong Details entered!!");
                    txtUsername.setText(null);                  //THE WRONG DETAILS ARE ENTERED THE MESSGAE WILL APPEAER.
                    pwdPassword.setText(null);
                }
                
           }
    }
    catch(Exception EX)
    {
        JOptionPane.showMessageDialog(null, EX);
    }
    
    try
    {
        
        FileInputStream fisFin = new FileInputStream("Storeman Data.txt");
            isrReader = new InputStreamReader(fisFin);              //THIS GUIDES THE CODE TO READ THE DATA CONTAINED IN THE "STOREMAN DATA" TEXT FILE.
            brReader = new BufferedReader(isrReader);
            
            
            while((strLine = brReader.readLine()) != null && (strLine2 = brReader.readLine()) != null)  //READS THE DATA IN THE TEXT FILE.
            {
                if(strLine .equals (strUsername) && strLine2 .equals (strPassword))            //CHECKS IF THE ENTERED DETAILS ARE COORECT. 
                {
                     frmStoreman frmStoreman = new frmStoreman();
                     frmStoreman.show();                //IF LOGIN DETAILS ARE CORRECT, THE STOREMAN FORM WILL APPEAR.
                     this.setVisible(false);
                }
                else
                {
                    lblWrong.setText("Wrong details entered!!");
                    txtUsername.setText(null);              //THE WRONG DETAILS ARE ENTERED THE MESSGAE WILL APPEAER.
                    pwdPassword.setText(null);
                }
                
           }
    }
    catch(Exception EX)
    {
        JOptionPane.showMessageDialog(null, EX);
    }
    
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        pwdPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        lblLoginText = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblWrong = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        btnLogin.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblLoginText.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblLoginText.setText("Please Enter Login Details.");
        lblLoginText.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnExit.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblUsername.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblPassword.setText("Password:");

        lblDate.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zohomobileinventory/LoginImage.png"))); // NOI18N

        lblWrong.setForeground(new java.awt.Color(239, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLoginText)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername)
                            .addComponent(lblPassword))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                .addComponent(pwdPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                            .addComponent(lblWrong, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(btnExit)
                        .addGap(109, 109, 109))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLoginText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsername)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblWrong, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnExit))
                .addGap(33, 33, 33)
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
spLogin();        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblLoginText;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWrong;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
