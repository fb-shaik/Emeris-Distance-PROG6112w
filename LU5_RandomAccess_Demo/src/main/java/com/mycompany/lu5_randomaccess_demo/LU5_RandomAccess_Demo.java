package com.mycompany.lu5_randomaccess_demo;

import java.io.*; 
import java.util.Scanner; 

public class LU5_RandomAccess_Demo {

    public static void main(String[] args)  throws IOException {
        Scanner input = new Scanner(System.in); 
        
        //create the locker.txt with sample records
        RandomAccessFile file = new RandomAccessFile("lockers.txt", "rw"); //"rw" means we can read and write to the file.
        String [] learners = {
                "Alice",
                "Bob",
                "Charlie",
                "Dave",
                "Edward"
        };
        
        for(String learner : learners)
        {
            file.writeChars(String.format("%-20s", learner));
        }
        
        int recordSize = 40;  // 20 chars × 2 bytes
        int lockerNumber; 
        
        do {
            System.out.println("Locker Loop-Up");
            System.out.println("Enter a Locker Number (1-5), or 0 to exit");
            
            lockerNumber = input.nextInt(); 
            
            if(lockerNumber == 0)
            {System.out.println("GoodBye!");
                break; 
            }
            
            if(lockerNumber < 1 || lockerNumber > 5)
            {
                System.out.println("Invalid locker number");
                continue; 
            }
            
            //Jump directly to the requested record
            file.seek((lockerNumber - 1) * recordSize);
            // Read the learner's name
            String name = "";
            for(int i = 0; i < 20; i++)
            {
                name += file.readChar(); 
            }
            System.out.println("Locker" + lockerNumber + " belongs to " + name.trim());
           
        }while (lockerNumber !=0); 
        
        file.close();
        input.close();
       
    }
}
