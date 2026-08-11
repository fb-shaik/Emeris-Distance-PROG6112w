package com.mycompany.lu1_bubble_sort_app;

/*
 * BUBBLE SORT
 * -----------
 * Bubble Sort is a simple sorting algorithm.
 *
 * It repeatedly compares two neighbouring (adjacent) values in an array.
 *
 * If the value on the LEFT is greater than the value on the RIGHT,
 * the two values are swapped.
 *
 * After each pass through the array, the largest unsorted value
 * "bubbles" towards the end of the array.
 *
 * Example:
 *
 * 8  4  5  1
 *
 * Compare 8 and 4  -> swap
 * 4  8  5  1
 *
 * Compare 8 and 5  -> swap
 * 4  5  8  1
 *
 * Compare 8 and 1  -> swap
 * 4  5  1  8
 *
 * Notice that 8 has now moved to its correct position at the end.
 */

public class LU1_Bubble_Sort_App {

    public static void main(String[] args) {

        /*
         * STEP 1: CREATE THE ARRAY
         * ------------------------
         * Create an integer array containing numbers in an unsorted order.
         *
         * General array syntax:
         * dataType[] arrayName = {element1, element2, element3, ...};
         */

        int[] numbers = {8, 4, 5, 1, 20, 9, 12};

        // numbers.length gives us the number of elements in the array.
        // In this example, numbers.length = 7.


        /*
         * STEP 2: BUBBLE SORT
         * -------------------
         * Bubble Sort uses NESTED LOOPS:
         *
         * 1. Outer loop -> controls the number of PASSES
         * 2. Inner loop -> compares neighbouring values
         *
         * An IF statement is then used to decide whether
         * two neighbouring values need to be swapped.
         */


        // OUTER LOOP
        // Controls how many passes are made through the array.
        //
        // An array with 7 elements needs a maximum of 6 passes.
        // Therefore, we use:
        //
        // numbers.length - 1

        for (int pass = 0; pass < numbers.length - 1; pass++) {

            /*
             * INNER LOOP
             * ----------
             * Moves through the unsorted section of the array
             * and compares neighbouring values.
             *
             * index       -> current value
             * index + 1   -> next value
             *
             * Example:
             * numbers[index]     = 8
             * numbers[index + 1] = 4
             *
             * The "- pass" is important because after each pass,
             * one more value at the end of the array is already
             * in its correct sorted position.
             *
             * Therefore, we do not need to compare it again.
             */

            for (int index = 0;
                 index < numbers.length - 1 - pass;
                 index++) {

                /*
                 * SELECTION / DECISION
                 * --------------------
                 * Compare two neighbouring values.
                 *
                 * If the LEFT value is greater than the RIGHT value,
                 * they are in the wrong order and must be swapped.
                 */

                if (numbers[index] > numbers[index + 1]) {

                    /*
                     * SWAPPING VALUES
                     * ---------------
                     * We cannot simply overwrite one value because
                     * we would lose it.
                     *
                     * A temporary variable (temp) is therefore used
                     * to temporarily store one of the values.
                     *
                     * Example:
                     *
                     * 8  4
                     *
                     * temp = 8
                     * first position = 4
                     * second position = temp
                     *
                     * Result:
                     * 4  8
                     */

                    int temp = numbers[index];

                    // Move the smaller RIGHT value to the LEFT.
                    numbers[index] = numbers[index + 1];

                    // Move the original LEFT value to the RIGHT.
                    numbers[index + 1] = temp;
                }
            }
        }


        /*
         * STEP 3: DISPLAY THE SORTED ARRAY
         * --------------------------------
         */

        System.out.println("Sorted Array:");

        // Enhanced for loop / for-each loop
        //
        // This loop visits every element in the numbers array.
        // Each value is temporarily stored in the variable "number".

        for (int number : numbers) {

            System.out.print(number + " ");
        }
    }
}