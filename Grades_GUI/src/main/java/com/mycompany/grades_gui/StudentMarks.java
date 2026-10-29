
package com.mycompany.grades_gui;


public class StudentMarks implements IStudentMarks 
{
    //2d Array to store the student marks
    private int[][]marks; 
    private final int PASS_MARK = 50; 

    //constructor receives the marks from the GUI
    public StudentMarks(int[][] marks) {
        this.marks = marks;
    }
        
    @Override
    public int [][] GetMarks() {
      return marks;
       }
    
    @Override
    public int GetTotalMarks() {
          int total =0; //variable to store the total marks
        for(int row = 0; row <marks.length; row++)
        {
            for(int col = 0; col <marks[row].length; col++)
            {
                total +=marks[row][col];
            }
        }
        return total;     
}

    @Override
    public double GetAverageMarks() {
        int count =0;
        for(int[] student : marks)
        {
            count += student.length;
        }
        if (count == 0)
        {
            return 0;
        }
        return (double) GetTotalMarks()/count;
        
    }

    @Override
    public int GetPassCount() {
        int count = 0;
        for(int row=0; row<marks.length; row++)
        {
            for(int col = 0; col <marks[row].length; col++){
                if (marks[row][col] >=PASS_MARK)
                {
                    count++;
                }
            }
    }
        return count;
    }
            
    @Override
    public int GetFailCount() {
           int count = 0;
        for(int row=0; row<marks.length; row++)
        {
            for(int col = 0; col <marks[row].length; col++){
                if (marks[row][col] <PASS_MARK)
                {
                    count++;
                }
            }
    }
            return count; 
    }

    @Override
    public int GetStudentsProcessed() {
        return marks.length;
    }
    
    }
   
