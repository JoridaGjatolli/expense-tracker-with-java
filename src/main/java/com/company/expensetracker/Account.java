package com.company.expensetracker;
import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author User
 */
public class Account extends javax.swing.JFrame {

    DataHandler dh=new DataHandler();
   
    public Account() {
        initComponents();
        newNameTxtField.setText(dh.returnElementFromDB(0));
        newPasswordTxtField.setText(dh.returnElementFromDB(1));
        budgetTxtField.setText(dh.returnElementFromDB(2));
        currencyComboBox.setSelectedItem(dh.returnElementFromDB(3) );
        byeLabel.setText("Goodbye, " + dh.returnElementFromDB(0));
        newNameTxtField.setEnabled(false);
        newPasswordTxtField.setEnabled(false);
        budgetTxtField.setEnabled(false);
        currencyComboBox.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainAccountPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        homeNavBtn = new javax.swing.JButton();
        tableNavBtn = new javax.swing.JButton();
        logoutNavBtn = new javax.swing.JButton();
        statsNavBtn = new javax.swing.JButton();
        addNavBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        logoutBtn = new javax.swing.JButton();
        byeLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        newNameLabel = new javax.swing.JLabel();
        nametxtBox = new javax.swing.JScrollPane();
        newNameTxtField = new javax.swing.JTextArea();
        newPasswordLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        newPasswordTxtField = new javax.swing.JTextArea();
        budgetLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        budgetTxtField = new javax.swing.JTextArea();
        submitBTN = new javax.swing.JButton();
        currencyComboBox = new javax.swing.JComboBox<>();
        editModeBTN = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        deleteAccBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 720));

        mainAccountPanel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("ACCOUNT");

        homeNavBtn.setText("HOME");
        homeNavBtn.setMargin(new java.awt.Insets(5, 5, 5, 5));
        homeNavBtn.setMaximumSize(new java.awt.Dimension(51, 27));
        homeNavBtn.setMinimumSize(new java.awt.Dimension(51, 27));
        homeNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeNavBtnActionPerformed(evt);
            }
        });

        tableNavBtn.setText("TABLE");
        tableNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableNavBtnActionPerformed(evt);
            }
        });

        logoutNavBtn.setBackground(new java.awt.Color(0, 0, 102));
        logoutNavBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logoutNavBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutNavBtn.setText("ACCOUNT");
        logoutNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutNavBtnActionPerformed(evt);
            }
        });

        statsNavBtn.setText("STATS");
        statsNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statsNavBtnActionPerformed(evt);
            }
        });

        addNavBtn.setText("ADD");
        addNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNavBtnActionPerformed(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(250, 360));

        logoutBtn.setBackground(new java.awt.Color(0, 0, 102));
        logoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("LOG OUT");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        byeLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        byeLabel.setForeground(new java.awt.Color(0, 0, 102));
        byeLabel.setText("Goodbye!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoutBtn)
                    .addComponent(byeLabel))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(byeLabel)
                .addGap(52, 52, 52)
                .addComponent(logoutBtn)
                .addGap(50, 50, 50))
        );

        newNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        newNameLabel.setForeground(new java.awt.Color(0, 0, 102));
        newNameLabel.setText("NEW NAME (3 or more characters):");

        newNameTxtField.setColumns(1);
        newNameTxtField.setRows(1);
        nametxtBox.setViewportView(newNameTxtField);

        newPasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        newPasswordLabel.setForeground(new java.awt.Color(0, 0, 102));
        newPasswordLabel.setText("NEW PASSWORD:");

        newPasswordTxtField.setColumns(1);
        newPasswordTxtField.setRows(1);
        jScrollPane1.setViewportView(newPasswordTxtField);

        budgetLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        budgetLabel.setForeground(new java.awt.Color(0, 0, 102));
        budgetLabel.setText("BUDGET (whole number):");

        budgetTxtField.setColumns(1);
        budgetTxtField.setRows(1);
        jScrollPane2.setViewportView(budgetTxtField);

        submitBTN.setBackground(new java.awt.Color(0, 0, 102));
        submitBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitBTN.setForeground(new java.awt.Color(255, 255, 255));
        submitBTN.setText("SUBMIT");
        submitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBTNActionPerformed(evt);
            }
        });

        currencyComboBox.setEditable(true);
        currencyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "ALL", "EUR" }));

        editModeBTN.setBackground(new java.awt.Color(0, 0, 102));
        editModeBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editModeBTN.setForeground(new java.awt.Color(255, 255, 255));
        editModeBTN.setText("EDIT MODE: OFF");
        editModeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editModeBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(budgetLabel))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currencyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(newNameLabel))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(newPasswordLabel)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(nametxtBox))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(editModeBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(newNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nametxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(budgetLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(currencyComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editModeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        deleteAccBtn.setBackground(new java.awt.Color(0, 0, 102));
        deleteAccBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteAccBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteAccBtn.setText("DELETE");
        deleteAccBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(deleteAccBtn)
                .addGap(100, 100, 100))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(298, Short.MAX_VALUE)
                .addComponent(deleteAccBtn)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout mainAccountPanelLayout = new javax.swing.GroupLayout(mainAccountPanel);
        mainAccountPanel.setLayout(mainAccountPanelLayout);
        mainAccountPanelLayout.setHorizontalGroup(
            mainAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainAccountPanelLayout.createSequentialGroup()
                .addGap(412, 412, 412)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainAccountPanelLayout.createSequentialGroup()
                .addGroup(mainAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainAccountPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tableNavBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addNavBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(homeNavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(statsNavBtn))
                    .addGroup(mainAccountPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainAccountPanelLayout.createSequentialGroup()
                        .addComponent(logoutNavBtn)
                        .addGap(243, 243, 243))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainAccountPanelLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        mainAccountPanelLayout.setVerticalGroup(
            mainAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainAccountPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(mainAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(mainAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeNavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statsNavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutNavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addNavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tableNavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainAccountPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainAccountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void addNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNavBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AddExpense().setVisible(true);
    }//GEN-LAST:event_addNavBtnActionPerformed

    private void tableNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableNavBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Table().setVisible(true);
    }//GEN-LAST:event_tableNavBtnActionPerformed

    private void homeNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeNavBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new HomeFrame().setVisible(true);
    }//GEN-LAST:event_homeNavBtnActionPerformed

    private void statsNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statsNavBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Stats().setVisible(true);
    }//GEN-LAST:event_statsNavBtnActionPerformed

    private void logoutNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutNavBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Account().setVisible(true);
    }//GEN-LAST:event_logoutNavBtnActionPerformed

    private void deleteAccBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAccBtnActionPerformed
        // TODO add your handling code here:
        try (FileWriter fileWriter = new FileWriter("UserInfo.txt", false)) {
            fileWriter.write("");  
            this.dispose();
            new SignUp().setVisible(true);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "ERROE DELETING YOUR ACCOUNT!");
        }
    }//GEN-LAST:event_deleteAccBtnActionPerformed

    private void submitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBTNActionPerformed
        // TODO add your handling code here:
        dh.writeInDB(newNameTxtField.getText(), newPasswordTxtField.getText(), budgetTxtField.getText(), (String)currencyComboBox.getSelectedItem());
    }//GEN-LAST:event_submitBTNActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new LogIn().setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void editModeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editModeBTNActionPerformed
        // TODO add your handling code here:
        if (editModeBTN.isSelected()){
            editModeBTN.setText("EDIT MODE: ON"); 
            newNameTxtField.setEnabled(true);
            newPasswordTxtField.setEnabled(true);
            budgetTxtField.setEnabled(true);
            currencyComboBox.setEnabled(true);   

        }
        else{
            editModeBTN.setText("EDIT MODE: OFF");
            newNameTxtField.setEnabled(false);
            newPasswordTxtField.setEnabled(false);
            budgetTxtField.setEnabled(false);
            currencyComboBox.setEnabled(false);     
        }
    }//GEN-LAST:event_editModeBTNActionPerformed

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
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNavBtn;
    private javax.swing.JLabel budgetLabel;
    private javax.swing.JTextArea budgetTxtField;
    private javax.swing.JLabel byeLabel;
    private javax.swing.JComboBox<String> currencyComboBox;
    private javax.swing.JButton deleteAccBtn;
    private javax.swing.JToggleButton editModeBTN;
    private javax.swing.JButton homeNavBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton logoutNavBtn;
    private javax.swing.JPanel mainAccountPanel;
    private javax.swing.JScrollPane nametxtBox;
    private javax.swing.JLabel newNameLabel;
    private javax.swing.JTextArea newNameTxtField;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JTextArea newPasswordTxtField;
    private javax.swing.JButton statsNavBtn;
    private javax.swing.JButton submitBTN;
    private javax.swing.JButton tableNavBtn;
    // End of variables declaration//GEN-END:variables
}
