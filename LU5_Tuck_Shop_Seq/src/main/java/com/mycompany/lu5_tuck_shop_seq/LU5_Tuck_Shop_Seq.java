
package com.mycompany.lu5_tuck_shop_seq;

import java.io.*; 
import java.util.Scanner;

public class LU5_Tuck_Shop_Seq {

    public static void main(String[] args) {
       //scanner obj to capture user input for the records
       Scanner input = new Scanner(System.in); 
       String fileName = "sales.txt"; // The text file where sales will be stored
       
        System.out.println("----SCHOOL TUCK SHOP----");
        // PART 1: WRITING TO A SEQUENTIAL FILE
        
        try{
        FileWriter fw = new FileWriter(fileName, true); // true means APPEND new records
        BufferedWriter bw = new BufferedWriter(fw); //BufferedWriter makes writing efficient.
        
            System.out.print("Enter product name: ");
            String product = input.nextLine(); 
            
            System.out.print("Enter product price: ");
            double price = input.nextDouble();
            
            bw.write(product + "|" + price); //Write the record to the file; The | symbol separates the two fields.
            bw.newLine(); // Each sale must occupy its own line.
            bw.close(); //Close the file; This also flushes buffered data.
            System.out.println("Sale saved successfully!");
        }
        catch(IOException e)
        {
            System.out.println("Error reading file. ");
        }
        
        //PART 2: READING A SEQUENTIAL FILE
        System.out.println("\n=== SAVED SALES ===");
        try
        { //Open the file for reading
            FileReader fr = new FileReader(fileName); 
            BufferedReader br = new BufferedReader(fr); //BufferedReader allows us to read one line at a time
            
            //Variable to hold each record from the file
            String record;
            while((record = br.readLine()) !=null)
            {//split the record back into the two variables (product & price) using an array
                String [] details = record.split("\\|");
                String product = details[0];
                String price = details[1];
                //display back on the console
                System.out.println("Product: " + product + " | Price: R " + price);
            }
            br.close();
        }
        
        catch (IOException e) 
        {
            System.out.println("Error reading file.");
        }
        
       
       
       
    }
}

/*
Write sales records to a text file using BufferedWriter.
Read sales records from the file using BufferedReader.
Display the saved records on the screen.
*/