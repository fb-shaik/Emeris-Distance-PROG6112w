/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question_one_exam_2025;

/**
 *
 * @author FS
 */
// ProductSales is responsible for performing all calculations.
//
// This demonstrates OOP because the calculation behaviour
// is placed inside its own class instead of putting everything
// inside the main method.
public class ProductSales implements IProduct {

    // ---------------------------------------------------------
    // TOTAL SALES
    // ---------------------------------------------------------
    @Override
    public int TotalSales(int[][] productSales) {

        // Start the total at zero.
        int total = 0;

        // Outer loop moves through each year (each row).
        for (int row = 0; row < productSales.length; row++) {

            // Inner loop moves through each quarter (each column).
            for (int col = 0; col < productSales[row].length; col++) {

                // Add the current sale to the running total.
                total += productSales[row][col];
            }
        }

        // Send the completed total back to the calling code.
        return total;
    }


    // ---------------------------------------------------------
    // AVERAGE SALES
    // ---------------------------------------------------------
    @Override
    public double AverageSales(int[][] productSales) {

        int total = 0;
        int numberOfSales = 0;

        // Visit every value in the two-dimensional array.
        for (int row = 0; row < productSales.length; row++) {

            for (int col = 0; col < productSales[row].length; col++) {

                // Add the sale to the total.
                total += productSales[row][col];

                // Count how many sales values have been processed.
                numberOfSales++;
            }
        }

        // Cast total to double so Java performs decimal division.
        return (double) total / numberOfSales;
    }


    // ---------------------------------------------------------
    // MAXIMUM SALE
    // ---------------------------------------------------------
    @Override
    public int MaxSale(int[][] productSales) {

        // Assume the first value is the largest initially.
        int max = productSales[0][0];

        // Compare every value with the current maximum.
        for (int row = 0; row < productSales.length; row++) {

            for (int col = 0; col < productSales[row].length; col++) {

                // If the current sale is larger, make it the new max.
                if (productSales[row][col] > max) {
                    max = productSales[row][col];
                }
            }
        }

        return max;
    }


    // ---------------------------------------------------------
    // MINIMUM SALE
    // ---------------------------------------------------------
    @Override
    public int MinSale(int[][] productSales) {

        // Assume the first value is the smallest initially.
        int min = productSales[0][0];

        // Compare every sale with the current minimum.
        for (int row = 0; row < productSales.length; row++) {

            for (int col = 0; col < productSales[row].length; col++) {

                // If the current sale is smaller, make it the new min.
                if (productSales[row][col] < min) {
                    min = productSales[row][col];
                }
            }
        }

        return min;
    }
}