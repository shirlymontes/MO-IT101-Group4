/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;


// Importing classes for handling database connections and operations
import employeeSystem.userHome;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author PotChi
 */
public class loginFrame extends javax.swing.JFrame {

    /**
     * Creates new form loginFrame
     */
    public loginFrame() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        noAcct = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/logingif.gif"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 750, 310));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 204));
        jButton1.setText("LOGIN");
        jButton1.setMargin(new java.awt.Insets(6, 14, 3, 14));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 600, 530, 50));

        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "USERNAME", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Consolas", 1, 14))); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 490, 70));

        jPasswordField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PASSWORD", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Consolas", 1, 14))); // NOI18N
        jPanel3.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 490, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/logo-negate.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));

        noAcct.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        noAcct.setForeground(new java.awt.Color(51, 153, 255));
        noAcct.setText("No account? Register here");
        noAcct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noAcctMouseClicked(evt);
            }
        });
        jPanel3.add(noAcct, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 680, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/5172988_door_internet_key_lock_password_icon.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/user1.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String id = jTextField1.getText(); // Retrieve the username from the jTextField1
        String pass = new String(jPasswordField1.getPassword()); // Use getPassword to retrieve password securely
        String query = "SELECT * FROM login WHERE username = ? AND password = ?";    // Prepare the SQL query to check for the existence of the provided username and password

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "");
            PreparedStatement pstmt = con.prepareStatement(query)) {

            // Set the parameters in the prepared statement
            pstmt.setString(1, id);
            pstmt.setString(2, pass);
            ResultSet rs = pstmt.executeQuery();     // Execute the query and get the result set

            // If the result set has a next row, it means the username and password are valid
            if (rs.next()) {
                // Hide the login form
                this.setVisible(false);

                // Open the userHome frame
                userHome homeFrame = new userHome(); // Instantiate the userHome class
                homeFrame.setVisible(true); // Display the userHome frame

            } else {
                // If no matching record found, show an error message
                JOptionPane.showMessageDialog(null, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            // If an SQL exception occurs, display an error message
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void noAcctMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noAcctMouseClicked
        // Open the registerFrame when the "no account?" option is clicked

        //Open registerFrame
        registerFrame register = new registerFrame();
        // Make the registerFrame visible
        register.setVisible(true);

    }//GEN-LAST:event_noAcctMouseClicked

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
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel noAcct;
    // End of variables declaration//GEN-END:variables
}