package com.mycompany.lu5_filewriter_demo;

import java.io.FileWriter; 
import java.io.IOException; 

public class LU5_FileWriter_Demo {

    public static void main(String[] args) {

        try
        {
            //think of the writer object as a pen & output.txt as the paper
                FileWriter writer = new FileWriter("output.txt", true); //true: places the writer object into append mode
                
                writer.write("\nThis is a new sentence we want to add to our text file");
              
                
                writer.close();
        }
        catch(IOException e)
        {
            System.out.println("An error has occured!");
        }
        
        
    }
}
/*
    FileWriter Class
 - import java.io.FileWriter;

- Used to write test / characters into a file
- You will need an object of the FileWrite class to bring this into your aplication
- You will need to include the IOException class as well.
*/
