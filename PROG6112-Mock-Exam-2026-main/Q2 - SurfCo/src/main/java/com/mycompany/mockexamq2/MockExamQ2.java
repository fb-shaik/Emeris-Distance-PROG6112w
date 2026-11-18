/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mockexamq2;

/**
 *
 * @author mdewlok
 */

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

public class MockExamQ2 extends JFrame {

    // Create SurfSales object
    private final SurfSales sales = new SurfSales();

    // GUI components
    private JButton btnLoad;
    private JButton btnSave;
    private JTextArea txtReport;
    private JLabel lblYears;

    // Constructor
    public MockExamQ2() {

        setTitle("Surf Shop Sales Tracker");

        setSize(600, 450);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        // Create GUI components
        createComponents();

        // Create menu
        createMenu();

        // Display window
        setVisible(true);
    }

    // Create GUI components
    private void createComponents() {

        // Main panel
        JPanel mainPanel = new JPanel();

        mainPanel.setLayout(new BorderLayout(10, 10));

        mainPanel.setBorder(
            BorderFactory.createEmptyBorder(15, 15, 15, 15)
        );

        // Create buttons
        btnLoad = new JButton("Load Sales Data");

        btnSave = new JButton("Save Sales Data");

        // Create button panel
        JPanel buttonPanel = new JPanel();

        buttonPanel.add(btnLoad);

        buttonPanel.add(btnSave);

        // Create text area
        txtReport = new JTextArea();

        txtReport.setEditable(false);

        txtReport.setFont(new Font("Monospaced", Font.PLAIN, 14));

        // Add scroll bar
        JScrollPane scrollPane = new JScrollPane(txtReport);

        // Create years processed label
        lblYears = new JLabel("Years Processed: ");

        // Add components to main panel
        mainPanel.add(buttonPanel, BorderLayout.NORTH);

        mainPanel.add(scrollPane, BorderLayout.CENTER);

        mainPanel.add(lblYears, BorderLayout.SOUTH);

        add(mainPanel);

        // Button event handling
        btnLoad.addActionListener(e -> loadSalesData());

        btnSave.addActionListener(e -> saveSalesData());
    }

    // Create menu system
    private void createMenu() {

        JMenuBar menuBar = new JMenuBar();

        // File menu
        JMenu fileMenu = new JMenu("File");

        JMenuItem exitItem = new JMenuItem("Exit");

        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(exitItem);

        // Tools menu
        JMenu toolsMenu = new JMenu("Tools");

        JMenuItem loadItem = new JMenuItem("Load Sales Data");

        JMenuItem saveItem = new JMenuItem("Save Sales Data");

        JMenuItem clearItem = new JMenuItem("Clear");

        // Menu event handling
        loadItem.addActionListener(e -> loadSalesData());

        saveItem.addActionListener(e -> saveSalesData());

        clearItem.addActionListener(e -> clearReport());

        toolsMenu.add(loadItem);

        toolsMenu.add(saveItem);

        toolsMenu.addSeparator();

        toolsMenu.add(clearItem);

        // Add menus to menu bar
        menuBar.add(fileMenu);

        menuBar.add(toolsMenu);

        setJMenuBar(menuBar);
    }

    // Load sales data and display report
    private void loadSalesData() {

        int total = sales.GetTotalSales();

        double average = sales.GetAverageSales();

        int overTarget = sales.GetSalesOverTarget();

        int underTarget = sales.GetSalesUnderTarget();

        int years = sales.GetYearsProcessed();

        // Create report
        String report = "SALES REPORT\n";

        report += "******************************\n";

        report += "Total Sales: " + total + "\n";

        report += "Average Sales: " + String.format("%.0f", average) + "\n";

        report += "Sales over target: " + overTarget + "\n";

        report += "Sales under target: " + underTarget + "\n";

        report += "******************************";

        // Display report
        txtReport.setText(report);

        // Display years processed
        lblYears.setText("Years Processed: " + years);
    }

    // Save report to text file
    private void saveSalesData() {

        if (txtReport.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                this,
                "Please load sales data before saving."
            );

            return;
        }

        try (FileWriter writer = new FileWriter("sales_log.txt")) {

            writer.write(txtReport.getText());

            JOptionPane.showMessageDialog(
                this,
                "Sales report saved successfully!"
            );

        } catch (IOException e) {

            JOptionPane.showMessageDialog(
                this,
                "Error saving sales report: " + e.getMessage()
            );
        }
    }

    // Clear report and years label
    private void clearReport() {

        txtReport.setText("");

        lblYears.setText("Years Processed: ");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MockExamQ2();
        });
    }
}
