package com.mycompany.lu5_filehandling_recap;

import java.io.IOException;
import java.io.*;

public class LU5_FileHandling_Recap {

    public static void main(String[] args) {
        
        //try-with-resources
        try (BufferedWriter writer =
                 new BufferedWriter(new FileWriter("students.txt")))
        {
                writer.write("101,John,75"); //Writes characters or strings to the file
                writer.newLine();
                writer.write("102,Mary,82");
                writer.newLine();
                writer.write("103,Peter,68");
                writer.newLine();
        }
        
        catch (IOException e)
        {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        
       
    }
}
/*

101 , John , 75 (1 record that has 3 pieces of data. Each data piece is seperated by a comma (de-limiter)
102,Mary,82
103,Peter,68

The basic process is:
1. Open/create the file.
2. Create a BufferedWriter.
3. Convert each record into text.
4. Write each record.
5. Add a line separator between records.
6. Close the writer when finished.

*/