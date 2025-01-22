/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.company.expensetracker;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Table extends javax.swing.JFrame implements Searchable {
    @Override
    public String[] searchExpenses(String searchTerm) {
        try(BufferedReader br = new BufferedReader(new FileReader(handleData.expensePath))){
                ArrayList<String> allData = new ArrayList<String>();
                String line;
                while ((line = br.readLine()) != null) {
                    if(line.toLowerCase().contains(searchTerm.toLowerCase())){
                        allData.add(line);
                    }
                }
                return allData.toArray(new String[0]); // returns entirety of lines in  the format {"name,123,12/12/2023" , "name,321,12/32/32"}
            }
                catch(Exception error){
                    error.printStackTrace();

                    return null;
                }
    }
    
    DataHandler handleData = new DataHandler();
    DefaultTableModel tableModel = new DefaultTableModel();
    DefaultTableModel searchModel = new DefaultTableModel();
    boolean searching = false;
    
    /**
     * Creates new form Table
     */
    
    public Table() {
        initComponents();
        tableModel.addColumn("Name");
        tableModel.addColumn("Amount");
        tableModel.addColumn("Date");
        searchModel.addColumn("Name");
        searchModel.addColumn("Amount");
        searchModel.addColumn("Date");
        
        
        String[] allDataArray = handleData.readExpenses();
        
        //prints in reverse order so that the newest addition comes up first
        for (int i = allDataArray.length -  1; i >= 0 ; i--) {
            String[] temp = allDataArray[i].split(",");
            tableModel.addRow(temp);
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

        mainTablePanel = new javax.swing.JPanel();
        mainTableTitle = new javax.swing.JLabel();
        searchTxtField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        homeNavBtn = new javax.swing.JButton();
        statsNavBtn = new javax.swing.JButton();
        logoutNavBtn = new javax.swing.JButton();
        addNavBtn = new javax.swing.JButton();
        tableNavBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Expense Tracker - Table");
        setSize(new java.awt.Dimension(1080, 720));

        mainTablePanel.setBackground(new java.awt.Color(204, 204, 204));

        mainTableTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        mainTableTitle.setForeground(new java.awt.Color(0, 0, 102));
        mainTableTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainTableTitle.setText("TABLE");

        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchButton.setText("SEARCH");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        table.setModel(tableModel);
        jScrollPane1.setViewportView(table);

        homeNavBtn.setText("HOME");
        homeNavBtn.setMargin(new java.awt.Insets(5, 5, 5, 5));
        homeNavBtn.setMaximumSize(new java.awt.Dimension(51, 27));
        homeNavBtn.setMinimumSize(new java.awt.Dimension(51, 27));
        homeNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeNavBtnActionPerformed(evt);
            }
        });

        statsNavBtn.setText("STATS");
        statsNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statsNavBtnActionPerformed(evt);
            }
        });

        logoutNavBtn.setText("ACCOUNT");
        logoutNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutNavBtnActionPerformed(evt);
            }
        });

        addNavBtn.setText("ADD");
        addNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNavBtnActionPerformed(evt);
            }
        });

        tableNavBtn.setBackground(new java.awt.Color(0, 0, 102));
        tableNavBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tableNavBtn.setForeground(new java.awt.Color(255, 255, 255));
        tableNavBtn.setText("TABLE");
        tableNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableNavBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainTablePanelLayout = new javax.swing.GroupLayout(mainTablePanel);
        mainTablePanel.setLayout(mainTablePanelLayout);
        mainTablePanelLayout.setHorizontalGroup(
            mainTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainTablePanelLayout.createSequentialGroup()
                .addGroup(mainTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainTablePanelLayout.createSequentialGroup()
                        .addGap(473, 473, 473)
                        .addComponent(mainTableTitle))
                    .addGroup(mainTablePanelLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addGroup(mainTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainTablePanelLayout.createSequentialGroup()
                                .addComponent(searchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(204, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainTablePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tableNavBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addNavBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homeNavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statsNavBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutNavBtn)
                .addGap(324, 324, 324))
        );
        mainTablePanelLayout.setVerticalGroup(
            mainTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainTablePanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(mainTableTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(searchTxtField))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(mainTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeNavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statsNavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutNavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addNavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tableNavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void addNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNavBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AddExpense().setVisible(true);
    }//GEN-LAST:event_addNavBtnActionPerformed

    private void tableNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableNavBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tableNavBtnActionPerformed

    private void homeNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeNavBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new HomeFrame().setVisible(true);
    }//GEN-LAST:event_homeNavBtnActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        searching = !searching;
        String searchTerm = searchTxtField.getText();

        if(searching && searchTerm.length() > 0){
            while(searchModel.getRowCount()>0){
                searchModel.removeRow(0);
            }

            String[] allDataArray = searchExpenses(searchTerm);

            for (int i = 0; i < allDataArray.length; i++) {
                String[] temp = allDataArray[i].split(",");
                searchModel.addRow(temp);
                System.out.println(temp);
            }
            table.setModel(searchModel);
            searchButton.setText("CLEAR");
            
        }else{
            table.setModel(tableModel);
            searchButton.setText("SEARCH");
            searchTxtField.setText("");
        }
    }//GEN-LAST:event_searchButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNavBtn;
    private javax.swing.JButton homeNavBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutNavBtn;
    private javax.swing.JPanel mainTablePanel;
    private javax.swing.JLabel mainTableTitle;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTxtField;
    private javax.swing.JButton statsNavBtn;
    private javax.swing.JTable table;
    private javax.swing.JButton tableNavBtn;
    // End of variables declaration//GEN-END:variables


}
