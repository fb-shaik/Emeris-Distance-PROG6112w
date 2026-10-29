/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.grades_gui;

/**
 *
 * @author FS
 */
public interface IStudentMarks {
    
    int[][] GetMarks(); //2d array return the grades captured

    int GetTotalMarks();

    double GetAverageMarks();

    int GetPassCount(); //scored >50

    int GetFailCount(); //scored <50

    int GetStudentsProcessed();
    
}
