
package com.mycompany.two_d_array_demo;
//2D Array Demo - Rental App

import javax.swing.JOptionPane; //Imports the JOptionPane class for the GUI
public class Two_D_Array_Demo {

    public static void main(String[] args) {
        
        //declare a 2D array of size 12 (4 rows & 3 columns)
        int [][] rental = {
                                   //1B    2B       3B
                                    {400, 800,   1000}, //floor 1
                                    {550, 950,   1100}, //floor 2
                                    {600, 1000, 1250}, //floor 3
                                    {750, 1250, 1500} //floor 4
                                    };
        
     String userEntry; //variable for user prompt
     int floors;// stores the floor choice of the user
     int bedrooms; //stores the bedroom choice of the user

     //Prompt to the user to request floor & bedroom choice
     userEntry = JOptionPane.showInputDialog(null, "Enter which floor you would like to rent on (1-4): ");
     floors = Integer.parseInt(userEntry); //Convert the String input into an integer
     
     userEntry = JOptionPane.showInputDialog("How many bedrooms would you like to rent (1-3): ");
     bedrooms = Integer.parseInt(userEntry);//Convert the String input into an integer
     
     //Access the combined Row & Column choice & display the result back
     JOptionPane.showMessageDialog(null, "The rent for a " + bedrooms + " bedrooms aprtment on Floor " + floors + " is R "
                                                                + rental[floors-1][bedrooms-1]);
     
     
        
    }
}

/*
                    Columns
                   1B      2B      3B
                  C0       C1      C2
               -------------------------
        R0 |    400   800      1000    //Floor 1
        R1 |    550   950      1100   //Floor 2
        R2 |    600   1000    1250  //Floor 3
        R3 |    750   1250    1500  //Floor 4

A 2D array is a multi-dimensional array
Known as an Array of Arrays
Think of a Table / Spreadsheet
*Rows are horizontal
*Columns are vertical
* Array ALWAYS start counting at index 0

 syntax:
        dataType [R][C] arrayName = {
                                                                {row1},          
                                                                {row2},
                                                                {row3},
                                                            };
Accessing Values: arrayName[rowIndex][columnIndex]
 e.g. rental[2][1]
                Row 2
                Column 1   

*/