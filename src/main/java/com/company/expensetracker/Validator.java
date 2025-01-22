package com.company.expensetracker;

public class Validator {

        //checks if the budget string is a proper integer
    public boolean validateBudget(String budget){
        try{
            int validatedBudget = Integer.parseInt(budget);
            return true;
        }catch(Exception error){
            return false;
        }
    }
    
        //check password format
    public boolean validatePassword(String password){
        //^ start of the string, $ end of the string
        //(?=.*[A-Z]) at least one uppercase, (?=.*[a-z]) at least one lowercase, (?=.*\\d) at least one digit , 
        //(?=.*[@$!%*#&]) at least one of these symbols @$!%*#&, 
        //[A-Za-z\\d@$!%*?&]+ checks if the whole password has allowed values (which are uppercase, lowercase,numbers, and some symbols)
        if(password.length() >= 8 && password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]+$")){
            return true;
        }
        return false;
    }
    
    public boolean validateDate(String date){
        if(date.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean validateInputs(String username, String password, String budget){
        boolean isUsernameCorrect = username.length()>=3;
        boolean isBudgetCorrect = validateBudget(budget);
        boolean isPasswordCorrect = validatePassword(password);
   

        return (isUsernameCorrect && isBudgetCorrect && isPasswordCorrect);
    }
}
