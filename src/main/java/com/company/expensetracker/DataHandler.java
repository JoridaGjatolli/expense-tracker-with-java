package com.company.expensetracker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DataHandler extends FileHandler{
    //Writes in the text file the new data AND/OR checks if the file is already written in or not
        public void writeInDB(String username, String password, String budget, String currency){      
            try{
                //reads from file and checks if it is empty or no
                if(isFileEmpty()){
                    String[] data = {username, password, budget, currency};
                    FileWriter fw = new FileWriter(userInfoPath);
                    for (int i = 0; i < 4; i++) {
                        fw.write(data[i] + "\n");
                 }//end for
                System.out.println("Data written in DB!");
                fw.close();
                }//end if
                else{ // the file is not empty
                    System.out.println("The DB already has data in it!");
                }  // end else
            } // end try
            catch(IOException error){
                error.printStackTrace();
                System.out.println("The data could not be written!");
            }//end catch
        }//end function writeInDB
        
        
        public void addExpense(String name, String amount, String date){
            try{
                FileWriter fw = new FileWriter(expensePath, true);
                String dataToWrite=name + "," + amount + "," + date + "\n";
                fw.write(dataToWrite);
                System.out.println("Data written in DB!");
                fw.close();
            } // end try
            catch(IOException error){
                error.printStackTrace();
                System.out.println("The data could not be written!");
            }//end catch
        }
        
        public String[] readExpenses(){
            try(BufferedReader br = new BufferedReader(new FileReader(expensePath))){
            ArrayList<String> allData = new ArrayList<String>(); // array list because it doesnt have a limit on the number of items added
            String line;
            while ((line = br.readLine()) != null) {
                allData.add(line);
            }
            
            return allData.toArray(new String[0]); // returns entirety of lines in  the format {"blabla,123,12/12/2023" , "blablabla,321,12/32/32"}
            }
            catch(IOException error){
                error.printStackTrace();
                return null;
            }
        }
        
        public void updateInDB(String username, String password, String budget, String currency){   
            try{
                String[] data = {username, password, budget, currency};
                FileWriter fw = new FileWriter(userInfoPath);
                
                for (int i = 0; i < 4; i++) {
                   fw.write(data[i] + "\n");
                }   
                fw.close();
            }catch(IOException error){
                error.printStackTrace();
            }
        }

        
        
}
