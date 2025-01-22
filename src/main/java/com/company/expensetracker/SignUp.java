package com.company.expensetracker;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {
    //Validator class instance
    Validator validate = new Validator();
    //Data Handler class instance
    DataHandler handleData = new DataHandler();
        //makes fields empty after a sign up attempt
        private void resetFields(){
            nameInput.setText("");
            passwordInput.setText("");
            budgetInput.setText("");
    }
        
        //generated SignUp Constructor
    public SignUp() {
        initComponents();
        if(!handleData.isFileEmpty()){
            JOptionPane.showMessageDialog(null,"There is an account already created, please log in instead! ");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        mainContainer = new javax.swing.JPanel();
        passwordInput = new javax.swing.JPasswordField();
        nameInput = new javax.swing.JTextField();
        unitSelector = new javax.swing.JComboBox<>();
        budgetInput = new javax.swing.JTextField();
        signUpBTN = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        psswLabel = new javax.swing.JLabel();
        budgetLabel = new javax.swing.JLabel();
        userLogo = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        sendToLogInBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Expense Tracker - Sign Up");
        setBackground(new java.awt.Color(241, 241, 241));
        setBounds(new java.awt.Rectangle(0, 0, 1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setName("SignUpFrame"); // NOI18N
        setSize(new java.awt.Dimension(1080, 720));

        mainPanel.setBackground(new java.awt.Color(241, 241, 241));
        mainPanel.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledBackground"));

        mainContainer.setBackground(new java.awt.Color(217, 217, 217));
        mainContainer.setPreferredSize(new java.awt.Dimension(522, 599));

        unitSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "ALL", "EUR" }));

        signUpBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signUpBTN.setText("SIGN UP");
        signUpBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBTNActionPerformed(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(51, 51, 51));
        nameLabel.setText("NAME (3 or more characters):");

        psswLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        psswLabel.setForeground(new java.awt.Color(51, 51, 51));
        psswLabel.setText("PASSWORD:");

        budgetLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        budgetLabel.setForeground(new java.awt.Color(51, 51, 51));
        budgetLabel.setText("BUDGET (whole number):");

        userLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\jorid\\Downloads\\ExpenseTracker_with_Java-master\\ExpenseTracker_with_Java-master\\src\\main\\java\\com\\company\\expensetracker\\images\\user.png")); // NOI18N

        errorLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout mainContainerLayout = new javax.swing.GroupLayout(mainContainer);
        mainContainer.setLayout(mainContainerLayout);
        mainContainerLayout.setHorizontalGroup(
            mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainContainerLayout.createSequentialGroup()
                .addGroup(mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainContainerLayout.createSequentialGroup()
                        .addGroup(mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainContainerLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(budgetLabel))
                            .addGroup(mainContainerLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainContainerLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(psswLabel)
                                            .addComponent(nameLabel)))
                                    .addGroup(mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(mainContainerLayout.createSequentialGroup()
                                            .addComponent(budgetInput, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(unitSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(nameInput, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(passwordInput, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(mainContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(userLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainContainerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(signUpBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
        );
        mainContainerLayout.setVerticalGroup(
            mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainContainerLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(userLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(psswLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(budgetLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(budgetInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(signUpBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        sendToLogInBTN.setBackground(new java.awt.Color(241, 241, 241));
        sendToLogInBTN.setForeground(new java.awt.Color(0, 0, 102));
        sendToLogInBTN.setText("Already have an account? Click here to log in!");
        sendToLogInBTN.setOpaque(true);
        sendToLogInBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToLogInBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sendToLogInBTN)
                .addGap(396, 396, 396))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(283, Short.MAX_VALUE)
                .addComponent(mainContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(275, 275, 275))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(mainContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sendToLogInBTN)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBTNActionPerformed
        //gets all data from userInputs
       final String userName = nameInput.getText();
       final String userPassword = String.valueOf(passwordInput.getPassword());//turns char[] into String :))))))))))))
       final String userBudget = budgetInput.getText();
       final String currencyType = unitSelector.getSelectedItem().toString();
       
       //checks if userInputs are valid, the validate reference is created at the top of THIS page
       if(validate.validateInputs(userName, userPassword, userBudget)){
           //writes in db the sign up data
           handleData.writeInDB(userName, userPassword, userBudget, currencyType);
           //on successful sign up this frame is disposed, and we go to the home
           this.dispose();
           new HomeFrame().setVisible(true);
  
       }
       else{
           //error handling for each input field
                  if(userName.isEmpty() || userPassword.isEmpty() || userBudget.isEmpty()){
                        errorLabel.setText("Please fill every field!");
                    }
                  else if(!validate.validateBudget(userBudget)){
                        errorLabel.setText("The budget should be a whole number");
                  }
                  else{
                            errorLabel.setText("The password must be at least 8 characters long, contain uppercase and lowercase letters, a number and a symbol!");
                  }
                  //fields are emptied after each error
                  resetFields();
       }
    }//GEN-LAST:event_signUpBTNActionPerformed

    private void sendToLogInBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToLogInBTNActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new LogIn().setVisible(true);
    }//GEN-LAST:event_sendToLogInBTNActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField budgetInput;
    private javax.swing.JLabel budgetLabel;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JPanel mainContainer;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel psswLabel;
    private javax.swing.JButton sendToLogInBTN;
    private javax.swing.JButton signUpBTN;
    private javax.swing.JComboBox<String> unitSelector;
    private javax.swing.JLabel userLogo;
    // End of variables declaration//GEN-END:variables
}
