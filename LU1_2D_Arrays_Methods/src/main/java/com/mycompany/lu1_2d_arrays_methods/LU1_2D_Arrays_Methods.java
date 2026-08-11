package com.mycompany.lu1_2d_arrays_methods;

/*
 * 2D ARRAYS WITH METHODS - CINEMA DEMO
 * ------------------------------------
 *
 * Scenario:
 * A small cinema has:
 *      - 3 rows of seats
 *      - 4 seats in each row
 *
 * Each seat stores one of the following characters:
 *
 *      'A' = Available
 *      'B' = Booked
 *
 * The program uses methods in the Cinema class to:
 *
 * 1. Create the 2D seating plan
 * 2. Display the seating plan
 * 3. Count the number of booked seats
 *
 * This demonstrates how a 2D array can be:
 *
 *      - RETURNED from a method
 *      - STORED in a variable
 *      - PASSED to another method as an argument
 */

public class LU1_2D_Arrays_Methods {

    public static void main(String[] args) {


        /*
         * STEP 1: CREATE A CINEMA OBJECT
         * ------------------------------
         * The methods we want to use are inside the Cinema class.
         *
         * Therefore, we first create an object of the Cinema class.
         *
         * General syntax:
         *
         * ClassName objectName = new ClassName();
         */

        Cinema cinema = new Cinema();


        /*
         * STEP 2: CREATE AND RECEIVE THE 2D ARRAY
         * ---------------------------------------
         *
         * Call the creatingSeatingPlan() method using
         * the cinema object.
         *
         * The method RETURNS a char[][] array.
         *
         * We therefore need a char[][] variable to receive
         * and store the returned 2D array.
         */

        char[][] seatingPlan = cinema.creatingSeatingPlan();


        /*
         * Think of the statement above as:
         *
         *              METHOD
         *                 |
         *                 | returns char[][]
         *                 ↓
         *
         * char[][] seatingPlan = cinema.creatingSeatingPlan();
         *
         * The returned 2D array is now stored in seatingPlan.
         */


        /*
         * STEP 3: DISPLAY THE SEATING PLAN
         * --------------------------------
         *
         * Pass seatingPlan to the displaySeatingPlan() method.
         *
         * seatingPlan is the ARGUMENT being sent to the method.
         *
         * The method receives it using its char[][] parameter.
         */

        cinema.displaySeatingPlan(seatingPlan);


        /*
         * STEP 4: COUNT THE BOOKED SEATS
         * ------------------------------
         *
         * Pass the same seatingPlan 2D array to the
         * countBookedSeats() method.
         *
         * The method counts every 'B' in the array and
         * RETURNS the total as an int.
         *
         * We therefore store the returned value
         * in an int variable called bookedSeats.
         */

        int bookedSeats = cinema.countBookedSeats(seatingPlan);


        /*
         * STEP 5: DISPLAY THE NUMBER OF BOOKED SEATS
         * ------------------------------------------
         */

        System.out.println("\nBooked Seats: " + bookedSeats);

    }
}