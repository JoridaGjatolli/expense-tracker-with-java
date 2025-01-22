package com.company.expensetracker;


public class LastExpense extends Expense {
    DataHandler handleData = new DataHandler();
    String[] expenseData;
    
    @Override
    public String retrieveLastName() {
            String[] allData = handleData.readExpenses();
            
            expenseData = allData[allData.length - 1].split(",");
            
        return expenseData[0];
    }
    
}
