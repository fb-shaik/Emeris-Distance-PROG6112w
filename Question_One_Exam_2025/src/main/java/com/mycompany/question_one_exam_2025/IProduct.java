/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question_one_exam_2025;

/**
 *
 * @author FS
 */
// This interface specifies the methods that the ProductSales
// class MUST provide.
//
// An interface does not contain the calculation logic.
// It simply states what methods an implementing class must have.
public interface IProduct {

    // Returns the total of all sales values.
    int TotalSales(int[][] productSales);

    // Returns the average of all sales values.
    double AverageSales(int[][] productSales);

    // Returns the highest sales value.
    int MaxSale(int[][] productSales);

    // Returns the lowest sales value.
    int MinSale(int[][] productSales);
}