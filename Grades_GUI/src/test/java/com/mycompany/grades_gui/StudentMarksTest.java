/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.grades_gui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author FS
 */
public class StudentMarksTest {
    
    
    public StudentMarksTest() {
    }

    @org.junit.jupiter.api.Test
    public void testGetMarks() {
    }

    @org.junit.jupiter.api.Test
    public void testGetTotalMarks() {
    }

    @org.junit.jupiter.api.Test
    public void testGetAverageMarks() {
    }

    @org.junit.jupiter.api.Test
    public void testGetPassCount() {
        int [][] marks = 
        {{70, 60},
           {40, 80},
           {60,90}
        };    
        StudentMarks student = new StudentMarks(marks);
        int expected = 5;
        int actual = student.GetPassCount();
        assertEquals(expected, actual); 
    }
   
    @org.junit.jupiter.api.Test
    public void testGetFailCount() {
          int [][] marks = 
        {{70, 60},
           {40, 80},
           {60,90}
        };
        
        StudentMarks student = new StudentMarks(marks);
        int expected = 1;
        int actual = student.GetFailCount();
        assertEquals(expected, actual); 
    }

    @org.junit.jupiter.api.Test
    public void testGetStudentsProcessed() {
    }
    
}
