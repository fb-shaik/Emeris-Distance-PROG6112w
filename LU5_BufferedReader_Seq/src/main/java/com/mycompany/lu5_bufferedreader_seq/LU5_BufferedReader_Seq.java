
package com.mycompany.lu5_bufferedreader_seq;

import java.io.*; //BufferedReader + FileReader + IOException

public class LU5_BufferedReader_Seq {

    public static void main(String[] args) {
          try (BufferedReader reader =
                 new BufferedReader(new FileReader("students.txt"))) {

            String line; //hold each record from the file
              System.out.printf("%-15s %-20s -%10s%n", "Student Number", "Name", "Grade");
              System.out.println("--------------------------------------------------------------------------");
             
            while ((line = reader.readLine()) != null) {
               String [] fields = line.split(",");
               int studentNumber = Integer.parseInt(fields[0]);
               String name = fields[1];
               int mark = Integer.parseInt(fields[2]);
               
                System.out.printf("%-15s %-20s -%10s%n", studentNumber, name, mark);  
               
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

/*fields
+---------+--------+------+
|  "101"  | "John" | "75" |
+---------+--------+------+
     [0]         [1]         [2]

*/