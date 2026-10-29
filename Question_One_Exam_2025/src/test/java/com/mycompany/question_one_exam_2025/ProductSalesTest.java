/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.question_one_exam_2025;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductSalesTest {

    // ---------------------------------------------------------
    // TEST TOTAL SALES
    // ---------------------------------------------------------
    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {

        // Arrange:
        // Create the same sales data used by the application.
        int[][] productSales = {
            {300, 150, 700},
            {250, 200, 600}
        };

        // Create the object containing the method being tested.
        ProductSales sales = new ProductSales();


        // Act:
        // Call the TotalSales method.
        int actualTotal = sales.TotalSales(productSales);


        // Assert:
        // The expected total is 2200.
        assertEquals(2200, actualTotal);
    }


    // ---------------------------------------------------------
    // TEST AVERAGE SALES
    // ---------------------------------------------------------
    @Test
    public void AverageSales_ReturnsAverageProductSales() {

        // Arrange:
        int[][] productSales = {
            {300, 150, 700},
            {250, 200, 600}
        };

        ProductSales sales = new ProductSales();


        // Act:
        double actualAverage =
                sales.AverageSales(productSales);


        // Assert:
        // 2200 / 6 = 366.666...
        //
        // The third parameter (0.01) is the allowed difference
        // when comparing double values.
        assertEquals(366.67, actualAverage, 0.01);
    }
}