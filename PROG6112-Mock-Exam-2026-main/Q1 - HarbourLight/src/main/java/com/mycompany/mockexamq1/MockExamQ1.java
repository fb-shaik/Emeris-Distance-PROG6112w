/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mockexamq1;

/**
 *
 * @author mdewlok
 */
public class MockExamQ1 {

    public static void main(String[] args) {
        // Single-dimensional array for season names
        String[] seasons = {
            "SUMMER",
            "AUTUMN",
            "WINTER",
            "SPRING"
        };

        // Two-dimensional array for ticket sales
        int[][] ticketSales = {
            {420, 310, 180, 390},
            {450, 280, 220, 390}
        };

        // Create TicketSales object
        TicketSales sales = new TicketSales();

        // Display report heading
        System.out.println("THEATRE TICKET SALES REPORT - 2026");
        System.out.println("---------------------------------------------");

        // Print season headings
        System.out.printf("%-10s", "");

        for (int i = 0; i < seasons.length; i++) {

            System.out.printf("%-10s", seasons[i]);
        }

        System.out.println();

        // Print ticket sales for each year
        for (int row = 0; row < ticketSales.length; row++) {

            System.out.printf("%-10s", "YEAR " + (row + 1));

            for (int col = 0; col < ticketSales[row].length; col++) {

                System.out.printf("%-10d", ticketSales[row][col]);
            }

            System.out.println();
        }

        System.out.println("---------------------------------------------");

        // Calculate report statistics
        int total = sales.TotalTicketSales(ticketSales);

        double average = sales.AverageTicketSales(ticketSales);

        int highest = sales.HighestSale(ticketSales);

        int lowest = sales.LowestSale(ticketSales);

        // Display results
        System.out.printf("Total tickets sold:   %d%n", total);

        System.out.printf("Average per season:   %.0f%n", average);

        System.out.printf("Highest season:       %d%n", highest);

        System.out.printf("Lowest season:        %d%n", lowest);

        System.out.println("---------------------------------------------");
    }
}
