package com.mycompany.lu5_file_handling_demo;

import java.io.File;
import java.io.IOException;

public class LU5_File_Handling_Demo {

    public static void main(String[] args) {
      
        try{
            //File class to create a file object that would allow for a filepath to be created
            //you have supply the file name & file extension in the object creation
            File file = new File("myFirstTextFile.txt");
            
            if(file.createNewFile())
            {
                System.out.println("File created!");
            } else
            {
                System.out.println("File already exist");
            }
                
        }
        catch(IOException e)
        {
            System.out.println("An error occurred.");
        }
        
    }
}

/*LU 5 - File Handling in Java

- Create, Read, Update, Delete behaviours in an app
- import java.io; [old version / traditional package]
- import java.nio; [newer version / API]

- Common Class: File Class 
 - path in which the file object will be created

- IOException class 
    - import java.IOException
    
*/