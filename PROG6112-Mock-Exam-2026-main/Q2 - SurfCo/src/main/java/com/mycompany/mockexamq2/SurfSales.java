/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mockexamq2;

/**
 *
 * @author mdewlok
 */
public class SurfSales implements ISurfSales {

    // Sales target stored as a constant
    public static final int SALES_TARGET = 400;

    // Two-dimensional array containing product sales
    private final int[][] productSales = {
        {520, 610, 450},
        {380, 340, 290},
        {150, 210, 200}
    };

    // Return product sales array
    @Override
    public int[][] GetProductSales() {
        return productSales;
    }

    // Calculate total sales
    @Override
    public int GetTotalSales() {

        int total = 0;

        for (int row = 0; row < productSales.length; row++) {

            for (int col = 0; col < productSales[row].length; col++) {

                total += productSales[row][col];
            }
        }

        return total;
    }

    // Calculate number of sales over target
    @Override
    public int GetSalesOverTarget() {

        int count = 0;

        for (int row = 0; row < productSales.length; row++) {

            for (int col = 0; col < productSales[row].length; col++) {

                if (productSales[row][col] > SALES_TARGET) {
                    count++;
                }
            }
        }

        return count;
    }

    // Calculate number of sales under or equal to target
    @Override
    public int GetSalesUnderTarget() {

        int count = 0;

        for (int row = 0; row < productSales.length; row++) {

            for (int col = 0; col < productSales[row].length; col++) {

                if (productSales[row][col] <= SALES_TARGET) {
                    count++;
                }
            }
        }

        return count;
    }

    // Calculate number of years processed
    @Override
    public int GetYearsProcessed() {

        return productSales[0].length;
    }

    // Calculate average sales
    @Override
    public double GetAverageSales() {

        int total = GetTotalSales();

        int numberOfSales = 0;

        for (int row = 0; row < productSales.length; row++) {

            numberOfSales += productSales[row].length;
        }

        return (double) total / numberOfSales;
    }
}
