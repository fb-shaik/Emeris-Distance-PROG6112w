/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mockexamq1;

/**
 *
 * @author mdewlok
 */
public class TicketSales implements ITicketSales {

    // Calculate total ticket sales
    @Override
    public int TotalTicketSales(int[][] ticketSales) {

        int total = 0;

        for (int row = 0; row < ticketSales.length; row++) {

            for (int col = 0; col < ticketSales[row].length; col++) {

                total += ticketSales[row][col];
            }
        }

        return total;
    }

    // Calculate average ticket sales
    @Override
    public double AverageTicketSales(int[][] ticketSales) {

        int total = TotalTicketSales(ticketSales);

        int numberOfSales = ticketSales.length * ticketSales[0].length;

        return (double) total / numberOfSales;
    }

    // Find highest ticket sale
    @Override
    public int HighestSale(int[][] ticketSales) {

        int highest = ticketSales[0][0];

        for (int row = 0; row < ticketSales.length; row++) {

            for (int col = 0; col < ticketSales[row].length; col++) {

                if (ticketSales[row][col] > highest) {

                    highest = ticketSales[row][col];
                }
            }
        }

        return highest;
    }

    // Find lowest ticket sale
    @Override
    public int LowestSale(int[][] ticketSales) {

        int lowest = ticketSales[0][0];

        for (int row = 0; row < ticketSales.length; row++) {

            for (int col = 0; col < ticketSales[row].length; col++) {

                if (ticketSales[row][col] < lowest) {

                    lowest = ticketSales[row][col];
                }
            }
        }

        return lowest;
    }
}
