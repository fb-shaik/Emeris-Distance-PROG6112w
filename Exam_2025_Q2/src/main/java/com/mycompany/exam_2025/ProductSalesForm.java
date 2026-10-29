package com.mycompany.exam_2025;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ProductSalesForm extends javax.swing.JFrame {
 
//Create an object of the ProductSales class. This allows the GUI to access methods
     private final ProductSales sales = new ProductSales(); 
        
    public ProductSalesForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLoad = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReport = new javax.swing.JTextArea();
        lblYears = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenuItem();
        menuTools = new javax.swing.JMenu();
        menuLoad = new javax.swing.JMenuItem();
        menuSave = new javax.swing.JMenuItem();
        menuClear = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLoad.setText("Load Product Data");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnSave.setText("Save Product Data");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtReport.setEditable(false);
        txtReport.setColumns(20);
        txtReport.setRows(5);
        jScrollPane1.setViewportView(txtReport);

        lblYears.setText("Years Processed:");

        menuFile.setText("File");

        menuExit.setText("Exit");
        menuFile.add(menuExit);

        menuBar.add(menuFile);

        menuTools.setText("Tools");

        menuLoad.setText("Load Product Data");
        menuLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLoadActionPerformed(evt);
            }
        });
        menuTools.add(menuLoad);

        menuSave.setText("Save Product Data");
        menuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaveActionPerformed(evt);
            }
        });
        menuTools.add(menuSave);

        menuClear.setText("Clear");
        menuClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClearActionPerformed(evt);
            }
        });
        menuTools.add(menuClear);

        menuBar.add(menuTools);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblYears, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(btnLoad)
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblYears)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
      loadData();
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        saveData();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void menuClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClearActionPerformed
        clearData();
    }//GEN-LAST:event_menuClearActionPerformed

    private void menuLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLoadActionPerformed
        loadData();
    }//GEN-LAST:event_menuLoadActionPerformed

    private void menuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaveActionPerformed
        saveData(); 
    }//GEN-LAST:event_menuSaveActionPerformed

   
     private void loadData() {
        // Call GetTotalSales() to calculate total sales
        int total = sales.GetTotalSales();
        // Call GetAverageSales() to calculate average
        double average = sales.GetAverageSales();
        // Count sales greater than 500
        int over = sales.GetSalesOverLimit();
        // Count sales less than 500
        int under = sales.GetSalesUnderLimit();
        // Calculate the number of years processed
        int years = sales.GetProductsProcessed();
        
        // Create an empty String to store the report
        String report = "";
        // Add the total sales to the report
        report += "Total Sales: " + total + "\n";
        // Add the average sales to the report. Math.round() rounds 366.666... to 367.
        report += "Average Sales: " + Math.round(average) + "\n";
        // Add the number of sales over the limit
        report += "Sales over limit: " + over + "\n";
        // Add the number of sales under the limit
        report += "Sales under limit: " + under;

        // Display the completed report in the text area
        txtReport.setText(report);

        // Display the number of years processed
        lblYears.setText("Years Processed: " + years);
    }
     
     private void saveData() {
// try-with-resources automatically closes FileWriter after writing is complete. 
//data.txt will be created in the application's working directory.
        try (FileWriter writer = new FileWriter("data.txt",true)) {
            // Write the report heading
            writer.write("DATA LOG\n");
            // Write a separator line
            writer.write("******************************\n");
            // Get the text currently displayed in the text area and write it to the file.
            writer.write(txtReport.getText());
            // Write the closing separator
            writer.write("\n******************************");
            // Display a success message
            JOptionPane.showMessageDialog( this,"Data saved successfully!");
        } catch (IOException e) {
            // This block executes if a file error occurs.Display an error message to the user.
            JOptionPane.showMessageDialog(this,"Error saving file: " + e.getMessage());
        }

    }
      
     private void clearData() {
        // Remove all text from the text area
        txtReport.setText("");
        // Clear the Years Processed label
        lblYears.setText("");
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductSalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductSalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductSalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductSalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductSalesForm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblYears;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuClear;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuLoad;
    private javax.swing.JMenuItem menuSave;
    private javax.swing.JMenu menuTools;
    private javax.swing.JTextArea txtReport;
    // End of variables declaration//GEN-END:variables
}
