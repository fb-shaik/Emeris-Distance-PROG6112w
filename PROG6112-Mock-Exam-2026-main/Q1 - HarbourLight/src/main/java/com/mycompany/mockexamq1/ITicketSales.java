/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mockexamq1;

/**
 *
 * @author mdewlok
 */
public interface ITicketSales {
    int TotalTicketSales(int[][] ticketSales);

    double AverageTicketSales(int[][] ticketSales);

    int HighestSale(int[][] ticketSales);

    int LowestSale(int[][] ticketSales);
}
