package com.mycompany.lu5_filereader_demo;


import java.io.FileReader; // used to open the text file & read its contents
import java.io.IOException; 

public class LU5_FileReader_Demo {

    public static void main(String[] args) {

        //try-with: Execute the try block with resources
        try(FileReader reader = new FileReader("animals.txt"))
        {
            int character; 
            
            while ((character = reader.read()) != -1)
            {
                System.out.print((char) character);
            }
            reader.close();
        }
        
        catch(IOException e)
        {
            System.out.println("An error has occured when reading the text file!");
        }
            
        
        
    }
}

/*
    FileReader Class
    - the ability to read data from an external source & display into the project

    import java.io.FileReader;
    import java.io.IOException; 

*/
