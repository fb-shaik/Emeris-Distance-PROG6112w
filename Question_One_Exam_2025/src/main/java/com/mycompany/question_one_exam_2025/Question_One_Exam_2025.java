
package com.mycompany.question_one_exam_2025;

public class Question_One_Exam_2025 {

    public static void main(String[] args) {

        // -----------------------------------------------------
        // SINGLE-DIMENSIONAL ARRAYS
        // -----------------------------------------------------

        // Stores the quarter headings.
        String[] quarters = {
            "QUARTER 1",
            "QUARTER 2",
            "QUARTER 3"
        };

        // Stores the year headings.
        String[] years = {
            "YEAR 1",
            "YEAR 2"
        };


        // -----------------------------------------------------
        // TWO-DIMENSIONAL ARRAY
        // -----------------------------------------------------

        // Each ROW represents a year.
        // Each COLUMN represents a quarter.
        int[][] productSales = {
            {300, 150, 700},
            {250, 200, 600}
        };


        // -----------------------------------------------------
        // CREATE OBJECT
        // -----------------------------------------------------

        // Create an object of the ProductSales class.
        // We use this object to call the calculation methods.
        ProductSales sales = new ProductSales();


        // -----------------------------------------------------
        // DISPLAY SALES TABLE
        // -----------------------------------------------------

        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println();

        // Print blank space before the quarter headings.
        System.out.printf("%-12s", "");

        // Print each quarter heading.
        for (int col = 0; col < quarters.length; col++) {
            System.out.printf("%-12s", quarters[col]);
        }

        System.out.println();


        // Print each year and its sales values.
        for (int row = 0; row < productSales.length; row++) {

            // Print the current year.
            System.out.printf("%-12s", years[row]);

            // Print the sales values for the current year.
            for (int col = 0; col < productSales[row].length; col++) {
                System.out.printf("%-12d", productSales[row][col]);
            }

            System.out.println();
        }


        // -----------------------------------------------------
        // DISPLAY CALCULATED RESULTS
        // -----------------------------------------------------

        System.out.println();
        System.out.println("--------------------------------");

        // Call methods from the ProductSales object.
        System.out.println(
                "Total sales:   " + sales.TotalSales(productSales)
        );

        // %.0f rounds the displayed average to zero decimal places,
        // matching the sample report where 366.67 displays as 367.
        System.out.printf(
                "Average sales: %.0f%n",
                sales.AverageSales(productSales)
        );

        System.out.println(
                "Maximum sale:  " + sales.MaxSale(productSales)
        );

        System.out.println(
                "Minimum sale:  " + sales.MinSale(productSales)
        );
    }
}