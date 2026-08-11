package com.mycompany.lu1_2d_arrays_methods;

/*
 * CINEMA CLASS
 * ------------
 * This class demonstrates how 2D arrays can be used with methods.
 *
 * In our cinema:
 *
 *      'A' = Available seat
 *      'B' = Booked seat
 *
 * We will create methods that:
 *
 * 1. Create and RETURN a 2D array
 * 2. RECEIVE a 2D array and count booked seats
 * 3. RECEIVE a 2D array and display the seating plan
 */

public class Cinema {


    /*
     * METHOD 1: CREATE THE SEATING PLAN
     * ---------------------------------
     * This method creates a 2D char array containing
     * the cinema seating plan.
     *
     * Method signature:
     *
     * public char[][] creatingSeatingPlan()
     *
     * public   -> Access modifier
     * char[][] -> Return type
     * creatingSeatingPlan -> Method name
     * ()       -> No parameters are required
     *
     * Because the return type is char[][], this method
     * MUST return a 2D char array.
     */

    public char[][] creatingSeatingPlan() {

        /*
         * Create a 2D char array.
         *
         * Each ROW represents a row of cinema seats.
         * Each COLUMN represents an individual seat.
         *
         * A = Available
         * B = Booked
         */

        char[][] seats = {
            {'A', 'B', 'A', 'A'},
            {'B', 'B', 'A', 'A'},
            {'A', 'A', 'A', 'B'}
        };

        // Return the completed 2D array to wherever
        // this method was called.
        return seats;
    }


    /*
     * METHOD 2: COUNT THE BOOKED SEATS
     * --------------------------------
     * This method RECEIVES a 2D char array as a parameter
     * and counts how many seats contain 'B'.
     *
     * Method signature:
     *
     * public int countBookedSeats(char[][] seats)
     *
     * public           -> Access modifier
     * int              -> Return type
     * countBookedSeats -> Method name
     * char[][] seats   -> Parameter
     *
     * The method returns an integer containing
     * the total number of booked seats.
     */

    public int countBookedSeats(char[][] seats) {

        // Accumulator / counter variable
        // Starts at 0 because we have not counted any booked seats yet.
        int booked = 0;


        /*
         * NESTED LOOP
         * -----------
         * A 2D array has rows AND columns.
         *
         * Therefore, we use:
         *
         * Outer loop -> moves through the ROWS
         * Inner loop -> moves through the COLUMNS in each row
         */


        // OUTER LOOP:
        // Move through each row of the 2D array.
        for (int row = 0; row < seats.length; row++) {


            // INNER LOOP:
            // Move through each column in the current row.
            for (int column = 0;
                 column < seats[row].length;
                 column++) {


                /*
                 * Access the current seat using:
                 *
                 * seats[row][column]
                 *
                 * Check whether the current seat contains 'B'.
                 */

                if (seats[row][column] == 'B') {

                    // A booked seat was found.
                    // Increase the counter by 1.
                    booked++;
                }
            }
        }


        // Return the total number of booked seats.
        return booked;
    }


    /*
     * METHOD 3: DISPLAY THE SEATING PLAN
     * ----------------------------------
     * This method RECEIVES the 2D array and displays
     * all the seats on the screen.
     *
     * Method signature:
     *
     * public void displaySeatingPlan(char[][] seats)
     *
     * public             -> Access modifier
     * void               -> Return type
     * displaySeatingPlan -> Method name
     * char[][] seats     -> Parameter
     *
     * void means this method does NOT return a value.
     */

    public void displaySeatingPlan(char[][] seats) {

        System.out.println("CINEMA SEATING PLAN");
        System.out.println("-------------------");


        /*
         * Again, we need a nested loop because
         * we are working with a 2D array.
         */


        // OUTER LOOP:
        // Move through each ROW.
        for (int row = 0; row < seats.length; row++) {


            // INNER LOOP:
            // Move through each COLUMN in the current row.
            for (int column = 0;
                 column < seats[row].length;
                 column++) {

                // Display the seat at the current row and column.
                System.out.print(seats[row][column] + " ");
            }


            /*
             * Once all columns in the current row have been displayed,
             * move the cursor to the next line.
             *
             * This makes the output look like the original 2D array.
             */
            System.out.println();
        }
    }

}


/*
 * =========================================================
 * METHODS - IMPORTANT CONCEPTS
 * =========================================================
 *
 * General method structure:
 *
 * accessModifier returnType methodName(parameters)
 * {
 *      // Method body
 *
 *      return value;     // Only required when returning a value
 * }
 *
 *
 * EXAMPLE 1:
 * Method returns a 2D array
 *
 * public char[][] creatingSeatingPlan()
 * {
 *      ...
 *      return seats;
 * }
 *
 *
 * EXAMPLE 2:
 * Method receives a 2D array and returns an int
 *
 * public int countBookedSeats(char[][] seats)
 * {
 *      ...
 *      return booked;
 * }
 *
 *
 * EXAMPLE 3:
 * Method receives a 2D array but returns nothing
 *
 * public void displaySeatingPlan(char[][] seats)
 * {
 *      ...
 * }
 *
 *
 * Remember:
 *
 * void     -> Nothing is returned
 * int      -> An integer must be returned
 * char[][] -> A 2D char array must be returned
 */