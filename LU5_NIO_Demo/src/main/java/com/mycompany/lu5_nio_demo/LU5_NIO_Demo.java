
package com.mycompany.lu5_nio_demo;

 import java.io.IOException; 
import java.nio.file.*;

public class LU5_NIO_Demo {

    public static void main(String[] args) {
      
        try
        {   Path filePath = Paths.get("my_file.txt"); // Define a file path
        
            //Example 1 - Create a file
            //createFile(filePath);
            //Write to file
            writeToFile(filePath, "Hello, World!"); 
           deleteFile(filePath);
            
            
        }
        catch(IOException e)
        {System.out.println("IO Exception: " + e.getMessage());}
    }
    
    static void createFile(Path filePath) throws IOException
    {
        Files.createFile(filePath);
    }
    
    static void writeToFile(Path filePath, String content) throws IOException
    {
        Files.writeString(filePath, content);
        System.out.println("Content written to the file");
    }
    
     static void deleteFile(Path filePath) throws IOException {
        Files.delete(filePath);
        System.out.println("File deleted: " + filePath);


}
}

/*
    java.nio class:

- used for i/o but has a different approach to the java.io library
- Newer I/O API
- Supports buffers, channels, modern file operations
- common class: Path (File, Path, Channel, Buffer)

in java.io: File file = new File("myFile.txt") (FILE)
in java.nio: Path path = Path.get("myFile.txt) (PATH)



*/