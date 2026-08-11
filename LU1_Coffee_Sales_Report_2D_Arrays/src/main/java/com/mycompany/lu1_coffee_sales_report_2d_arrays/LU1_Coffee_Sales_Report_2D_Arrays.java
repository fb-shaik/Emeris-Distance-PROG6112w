package com.mycompany.lu1_coffee_sales_report_2d_arrays;

import java.util.Scanner; // Provides console-based user input

/*
 * COFFEE SHOP SALES REPORT - 2D ARRAYS
 * ------------------------------------
 *
 * This program records the number of drinks sold
 * throughout the week.
 *
 * The shop sells three types of drinks:
 *
 *      Coffee
 *      Tea
 *      Hot Chocolate
 *
 * Sales are recorded for seven days:
 *
 *      Monday - Sunday
 *
 * A 2D array is used to store the sales.
 *
 * ROWS    -> Days of the week
 * COLUMNS -> Drink types
 *
 * The program will:
 *
 * 1. Ask the user to enter daily drink sales
 * 2. Store the sales in a 2D array
 * 3. Calculate the total sales for each day
 * 4. Calculate the total sales for each drink
 * 5. Calculate the overall weekly total
 * 6. Display a sales report
 */

public class LU1_Coffee_Sales_Report_2D_Arrays {

    public static void main(String[] args) {

        /*
         * STEP 1: CREATE THE SCANNER OBJECT
         * ---------------------------------
         *
         * Scanner allows us to receive input from the keyboard.
         *
         * General syntax:
         *
         * ClassName objectName = new ClassName(parameters);
         */

        Scanner input = new Scanner(System.in);


        /*
         * STEP 2: CREATE THE DAYS ARRAY
         * -----------------------------
         *
         * This 1D String array stores the days of the week.
         *
         * Each day will represent a ROW in our 2D sales array.
         *
         * Index:
         *
         * 0 -> Monday
         * 1 -> Tuesday
         * 2 -> Wednesday
         * ...
         * 6 -> Sunday
         */

        String[] days = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
        };


        /*
         * STEP 3: CREATE THE DRINK TYPES ARRAY
         * ------------------------------------
         *
         * Each drink type represents a COLUMN
         * in the 2D sales array.
         *
         * Column 0 -> Coffee
         * Column 1 -> Tea
         * Column 2 -> Hot Chocolate
         */

        String[] drinkTypes = {
            "Coffee",
            "Tea",
            "Hot Chocolate"
        };


        /*
         * STEP 4: CREATE THE 2D SALES ARRAY
         * ---------------------------------
         *
         * The number of rows comes from:
         *
         *      days.length = 7
         *
         * The number of columns comes from:
         *
         *      drinkTypes.length = 3
         *
         * Therefore:
         *
         *      7 rows x 3 columns = 21 values
         *
         *
         *                    DRINK TYPES
         *
         *                Coffee   Tea   Hot Chocolate
         * Monday
         * Tuesday
         * Wednesday
         * Thursday
         * Friday
         * Saturday
         * Sunday
         */

        int[][] drinkSales =
                new int[days.length][drinkTypes.length];


        /*
         * STEP 5: CREATE ARRAYS FOR THE TOTALS
         * ------------------------------------
         */


        /*
         * Stores the total sales for each DRINK TYPE.
         *
         * Index 0 -> Total Coffee
         * Index 1 -> Total Tea
         * Index 2 -> Total Hot Chocolate
         */

        int[] drinkTotals = new int[drinkTypes.length];


        /*
         * Stores the total number of drinks sold
         * on each DAY.
         *
         * Index 0 -> Monday total
         * Index 1 -> Tuesday total
         * ...
         * Index 6 -> Sunday total
         */

        int[] dailyTotals = new int[days.length];


        /*
         * Stores the total number of ALL drinks
         * sold during the entire week.
         *
         * This is an accumulator variable.
         */

        int overallTotal = 0;


        /*
         * STEP 6: CAPTURE THE SALES
         * -------------------------
         */

        System.out.println("COFFEE SHOP SALES APP");
        System.out.println("=====================");


        /*
         * OUTER LOOP
         * ----------
         *
         * Moves through each ROW of the 2D array.
         *
         * Each row represents a DAY.
         */

        for (int row = 0; row < drinkSales.length; row++) {

            System.out.println(
                    "\nEnter sales for " + days[row] + ":"
            );


            /*
             * INNER LOOP
             * ----------
             *
             * Moves through each COLUMN in the current row.
             *
             * Each column represents a DRINK TYPE.
             */

            for (int column = 0;
                 column < drinkSales[row].length;
                 column++) {

                /*
                 * Temporarily stores the sales value
                 * entered by the user.
                 */

                int sales;


                /*
                 * INPUT VALIDATION
                 * ----------------
                 *
                 * A do-while loop is used because we want
                 * the user to enter a value at least once.
                 *
                 * Sales may be:
                 *
                 *      0 or greater
                 *
                 * Sales may NOT be negative.
                 */

                do {

                    System.out.print(
                            drinkTypes[column] + " sales: "
                    );

                    sales = input.nextInt();


                    // Display an error if an invalid value was entered.
                    if (sales < 0) {

                        System.out.println(
                                "Sales cannot be negative. Try again."
                        );
                    }

                } while (sales < 0);


                /*
                 * STORE THE SALES
                 * ---------------
                 *
                 * Store the user's valid input in the
                 * correct row and column.
                 *
                 * Syntax:
                 *
                 * arrayName[row][column]
                 */

                drinkSales[row][column] = sales;
            }
        }


        /*
         * STEP 7: CALCULATE THE TOTALS
         * ----------------------------
         *
         * We now move through every value in the 2D array.
         *
         * Each sales value contributes to:
         *
         * 1. A daily total
         * 2. A drink total
         * 3. The overall weekly total
         */

        for (int row = 0; row < drinkSales.length; row++) {

            for (int column = 0;
                 column < drinkSales[row].length;
                 column++) {


                /*
                 * Store the current 2D array value
                 * in a temporary variable.
                 *
                 * This makes the calculations below
                 * easier to read.
                 */

                int currentSales = drinkSales[row][column];


                /*
                 * DAILY TOTAL
                 * -----------
                 *
                 * The row represents the current day.
                 *
                 * Therefore, add the current sales value
                 * to the total for that row/day.
                 */

                dailyTotals[row] += currentSales;


                /*
                 * DRINK TOTAL
                 * -----------
                 *
                 * The column represents the drink type.
                 *
                 * Therefore, add the current value
                 * to the total for that drink.
                 */

                drinkTotals[column] += currentSales;


                /*
                 * OVERALL TOTAL
                 * -------------
                 *
                 * Add every sales value to one
                 * overall weekly accumulator.
                 */

                overallTotal += currentSales;
            }
        }


        /*
         * STEP 8: DISPLAY THE SALES REPORT
         * --------------------------------
         */

        System.out.println("\n\nCOFFEE SHOP WEEKLY SALES REPORT");
        System.out.println("================================");


        /*
         * Display the sales for every day and drink.
         */

        for (int row = 0; row < drinkSales.length; row++) {

            System.out.println("\n" + days[row]);

            for (int column = 0;
                 column < drinkSales[row].length;
                 column++) {

                System.out.println(
                        drinkTypes[column]
                        + ": "
                        + drinkSales[row][column]
                );
            }


            /*
             * Display the total number of drinks
             * sold on the current day.
             */

            System.out.println(
                    "Daily Total: " + dailyTotals[row]
            );
        }


        /*
         * STEP 9: DISPLAY TOTALS BY DRINK TYPE
         * ------------------------------------
         */

        System.out.println("\nTOTAL SALES BY DRINK");
        System.out.println("--------------------");

        for (int column = 0;
             column < drinkTypes.length;
             column++) {

            System.out.println(
                    drinkTypes[column]
                    + ": "
                    + drinkTotals[column]
            );
        }


        /*
         * STEP 10: DISPLAY THE OVERALL TOTAL
         * ----------------------------------
         */

        System.out.println(
                "\nOverall Weekly Total: " + overallTotal
        );


        // Close the Scanner once input is no longer required.
        input.close();
    }
}