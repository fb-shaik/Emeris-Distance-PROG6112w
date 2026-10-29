/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.exam_2025;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ProductSalesTest {
    
    public ProductSalesTest() {
    }

    @org.junit.jupiter.api.Test
    public void testGetProductSales() {
    }

    @org.junit.jupiter.api.Test
    public void testGetTotalSales() {
    }

    @org.junit.jupiter.api.Test
    public void testGetSalesOverLimit() {
        ProductSales sales = new ProductSales(); // ARRANGE
        int  expected = 2;
        int actual = sales.GetSalesOverLimit(); //ACT: Call the method we want to test.     
        assertEquals(expected, actual); //ASSERT: Compare the expected value with the actual value.

    }

    @org.junit.jupiter.api.Test
    public void testGetSalesUnderLimit() {
        ProductSales sales = new ProductSales(); // ARRANGE
        int  expected = 4;
        int actual = sales.GetSalesUnderLimit(); //ACT: Call the method we want to test.     
        assertEquals(expected, actual); //ASSERT: Compare the expected value with the actual value.
        
    }

    @org.junit.jupiter.api.Test
    public void testGetProductsProcessed() {
    }

    @org.junit.jupiter.api.Test
    public void testGetAverageSales() {
    }
    
}
