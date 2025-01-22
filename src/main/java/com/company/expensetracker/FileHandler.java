package com.company.expensetracker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileHandler {    
            static String userInfoPath;
            static String expensePath;

            
            static{ // this makes the strings associated with the class and not with the instance of the class so the changes made to the variables are affected in the whole instances of the DataHandler Class
                try{
                         String workingDir = new File("").getCanonicalPath();  // gets the working directory path which in my case is C:\\Users\\User\\Documents\\NetBeansProjects\\ExpenseTracker\\

                        // gets the remainder of the path that the working directory path doesnt have
                        userInfoPath = new File(workingDir, "src\\main\\java\\com\\company\\expensetracker\\UserInfo.txt").getCanonicalPath();
                        expensePath = new File(workingDir, "src\\main\\java\\com\\company\\expensetracker\\Expenses.txt").getCanonicalPath();
                        }
                catch(Exception error){
                           error.printStackTrace();
                           userInfoPath = "C:\\Users\\User\\Documents\\NetBeansProjects\\ExpenseTracker\\src\\main\\java\\com\\company\\expensetracker\\UserInfo.txt";
                           expensePath = "C:\\Users\\User\\Documents\\NetBeansProjects\\ExpenseTracker\\src\\main\\java\\com\\company\\expensetracker\\Expenses.txt";
                        }      
            }  
            
            public boolean isFileEmpty(){
            try{
                BufferedReader br = new BufferedReader(new FileReader(userInfoPath));
                return br.readLine() == null;
            }
            catch(Exception error){
                error.printStackTrace();
                return false;
            }
        }
            
            public boolean isFileEmpty(String path){
            try{
                BufferedReader br = new BufferedReader(new FileReader(path));
                return br.readLine() == null;
            }
            catch(Exception error){
                error.printStackTrace();
                return false;
            }
        }
            
}
