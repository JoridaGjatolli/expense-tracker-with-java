package com.company.expensetracker;

public class LogIn extends javax.swing.JFrame {
    DataHandler handleData = new DataHandler();
    CurrentUser  cu = new CurrentUser();

    public LogIn() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLogInPanel = new javax.swing.JPanel();
        dataInputMainContainer = new javax.swing.JPanel();
        userIcon = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        psswLabel = new javax.swing.JLabel();
        passwordInput = new javax.swing.JPasswordField();
        nameLabel = new javax.swing.JLabel();
        logInBtn = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sendToSignUpLink = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Expense Tracker - Log In");
        setSize(new java.awt.Dimension(1080, 720));

        mainLogInPanel.setBackground(new java.awt.Color(255, 255, 255));

        dataInputMainContainer.setBackground(new java.awt.Color(204, 204, 204));

        psswLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        psswLabel.setForeground(new java.awt.Color(51, 51, 51));
        psswLabel.setText("PASSWORD:");

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(51, 51, 51));
        nameLabel.setText("USERNAME:");

        logInBtn.setBackground(new java.awt.Color(0, 0, 102));
        logInBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logInBtn.setForeground(new java.awt.Color(255, 255, 255));
        logInBtn.setText("LOG IN");
        logInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInBtnActionPerformed(evt);
            }
        });

        errorLabel.setBackground(new java.awt.Color(255, 0, 0));
        errorLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\jorid\\Downloads\\ExpenseTracker_with_Java-master\\ExpenseTracker_with_Java-master\\src\\main\\java\\com\\company\\expensetracker\\images\\user.png")); // NOI18N

        javax.swing.GroupLayout dataInputMainContainerLayout = new javax.swing.GroupLayout(dataInputMainContainer);
        dataInputMainContainer.setLayout(dataInputMainContainerLayout);
        dataInputMainContainerLayout.setHorizontalGroup(
            dataInputMainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataInputMainContainerLayout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userIcon)
                .addGap(183, 183, 183))
            .addGroup(dataInputMainContainerLayout.createSequentialGroup()
                .addGroup(dataInputMainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataInputMainContainerLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(dataInputMainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameLabel)
                            .addComponent(psswLabel)
                            .addComponent(nameInput, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                            .addComponent(passwordInput)
                            .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(dataInputMainContainerLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(logInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dataInputMainContainerLayout.setVerticalGroup(
            dataInputMainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataInputMainContainerLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(dataInputMainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userIcon)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(psswLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(errorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        sendToSignUpLink.setForeground(new java.awt.Color(0, 0, 102));
        sendToSignUpLink.setText("Don't have an account? Click here and sign up!");
        sendToSignUpLink.setOpaque(true);
        sendToSignUpLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToSignUpLinkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainLogInPanelLayout = new javax.swing.GroupLayout(mainLogInPanel);
        mainLogInPanel.setLayout(mainLogInPanelLayout);
        mainLogInPanelLayout.setHorizontalGroup(
            mainLogInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLogInPanelLayout.createSequentialGroup()
                .addContainerGap(350, Short.MAX_VALUE)
                .addGroup(mainLogInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLogInPanelLayout.createSequentialGroup()
                        .addComponent(sendToSignUpLink)
                        .addGap(355, 355, 355))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLogInPanelLayout.createSequentialGroup()
                        .addComponent(dataInputMainContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(231, 231, 231))))
        );
        mainLogInPanelLayout.setVerticalGroup(
            mainLogInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLogInPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(dataInputMainContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(sendToSignUpLink)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLogInPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLogInPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInBtnActionPerformed
        // TODO add your handling code here:
        final String usernameInput = nameInput.getText();
        final String userPassword = String.valueOf(passwordInput.getPassword());//turns char[] into String :))))))))))))
        if(cu.getValue(0).equals(usernameInput) && cu.getValue(1).equals(userPassword)){
            this.dispose();
            new HomeFrame().setVisible(true);
        }
        else{
            errorLabel.setText("Username or password are incorrect. Please try again!");
        }

    }//GEN-LAST:event_logInBtnActionPerformed

    private void sendToSignUpLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToSignUpLinkActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new SignUp().setVisible(true);
    }//GEN-LAST:event_sendToSignUpLinkActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dataInputMainContainer;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logInBtn;
    private javax.swing.JPanel mainLogInPanel;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel psswLabel;
    private javax.swing.JButton sendToSignUpLink;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables
}
