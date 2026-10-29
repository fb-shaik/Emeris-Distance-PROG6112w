package com.mycompany.exam_2025;

public class ProductSales implements IProductSales {
    private final int [][] sales = 
    {
        {300,150,700},
        {250,200,600},
    };
    
   private static final int SALES_LIMIT = 500; //constant  

    @Override
    public int[][] GetProductSales() {
        return sales; // Return the entire 2D sales array
      }

    @Override
    public int GetTotalSales() {
        int total = 0; // Variable used to store the total sales
        //Nested Loop that wiil look at the 2D array for the values to add-up
        //Outer Loop
        for (int row = 0; row < sales.length; row++)
        {//inner loop
            for(int col = 0; col< sales[row].length; col++)
            {
                total += sales[row][col]; //total = total + sales[row][col];
            }
        }
        return total; 
      }

    @Override
    public int GetSalesOverLimit() {
          // Counter for sales greater than 500
        int count = 0;
        // Loop through each year
        for (int row = 0; row < sales.length; row++) {
            // Loop through each product
            for (int col = 0; col < sales[row].length; col++) {
                // Check whether the current sales value is greater than 500.
                if (sales[row][col] > SALES_LIMIT) {
                    count++;// Increase counter when condition is true
                }
            }
        }
        return count;
      }

    @Override
    public int GetSalesUnderLimit() {
          // Counter for sales less than 500
        int count = 0;
        // Loop through each year
        for (int row = 0; row < sales.length; row++) {
            // Loop through each product
            for (int col = 0; col < sales[row].length; col++) {
                // Check whether the current sales value is less than 500.
                if (sales[row][col] < SALES_LIMIT) {
                    count++;  // Increase counter when condition is true
                }
            }
        }
        return count; 
    }

    @Override
    public int GetProductsProcessed() {
         return sales.length;        
    }

    @Override
    public double GetAverageSales() {
         int count = 0; //Count how many sales values exist
            for (int row = 0; row < sales.length; row++)
        {//inner loop
            for(int col = 0; col< sales[row].length; col++)
            {
               count++; // Increase the count by 1 for every sales value found
            }
        }
        if(count == 0) 
        {
            return 0; 
        } 
        return (double) GetTotalSales() / count; 
      }
     
    }
    
