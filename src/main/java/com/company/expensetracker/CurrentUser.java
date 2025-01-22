package com.company.expensetracker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CurrentUser extends User {
    FileHandler fh = new FileHandler();

    @Override
    public String getValue(int index) {
        String[] readData = new String[4];
            try{
                BufferedReader br = new BufferedReader(new FileReader(fh.userInfoPath));
                            String line = br.readLine();
                            int count = 0;
                            while(line != null){
                                readData[count]= line;
                                count++;
                                line = br.readLine();
                            }
                            br.close();
            }            
            catch(IOException error){
                error.printStackTrace();
                System.out.println("Couldn't read data!");
            }//end catch
            
            return readData[index];
    }
    
}
