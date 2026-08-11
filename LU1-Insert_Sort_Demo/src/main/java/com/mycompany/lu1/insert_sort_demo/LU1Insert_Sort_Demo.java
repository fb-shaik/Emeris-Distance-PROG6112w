package com.mycompany.lu1.insert_sort_demo;

/*
 * INSERTION SORT
 * --------------
 * Insertion Sort is a simple sorting algorithm that builds the
 * sorted part of the array one value at a time.
 *
 * Think about arranging playing cards in your hand:
 *
 * 1. Pick the next card.
 * 2. Compare it with the cards before it.
 * 3. Move larger cards to the right.
 * 4. Insert the card into the correct position.
 *
 * Example:
 *
 * 8  3  4  11
 *
 * Pick 3:
 * 8 is bigger than 3 -> move 8 right
 *
 * 3  8  4  11
 *
 * Pick 4:
 * 8 is bigger than 4 -> move 8 right
 * 3 is smaller than 4 -> stop
 *
 * 3  4  8  11
 */

public class LU1Insert_Sort_Demo {

    public static void main(String[] args) {

        /*
         * STEP 1: CREATE THE ARRAY
         * ------------------------
         * A 1D (one-dimensional) array stores multiple values
         * of the same data type in a single list.
         */

        int[] numbers = {8, 3, 4, 11, 0, 34, 1, 10};


        /*
         * STEP 2: DISPLAY THE UNSORTED ARRAY
         * ----------------------------------
         * Use a for-each loop to visit and display
         * every value in the array.
         */

        System.out.println("Unsorted array list:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();


        /*
         * STEP 3: INSERTION SORT
         * ----------------------
         * We start at index 1 (the second element).
         *
         * Why?
         *
         * The first element at index 0 is treated as already sorted.
         *
         * We then take each remaining value and find where
         * it belongs in the sorted part of the array.
         */

        for (int index = 1; index < numbers.length; index++) {

            /*
             * Save the value we are currently trying to insert.
             *
             * This is sometimes called the "current" or "key" value.
             */
            int current = numbers[index];


            /*
             * Start checking from the position immediately
             * BEFORE the current value.
             *
             * Example:
             *
             * index = 3
             * position = 2
             */
            int position = index - 1;


            /*
             * WHILE LOOP
             * ----------
             * Move backwards through the sorted part of the array.
             *
             * Continue while BOTH conditions are true:
             *
             * 1. position >= 0
             *    We are still inside the array.
             *
             * 2. numbers[position] > current
             *    The previous value is bigger than the value
             *    we are trying to insert.
             */

            while (position >= 0 && numbers[position] > current) {

                /*
                 * SHIFT THE VALUE
                 * ---------------
                 * The previous value is bigger than "current",
                 * so move it one position to the RIGHT.
                 *
                 * Notice:
                 * We are SHIFTING here, not swapping.
                 */

                numbers[position + 1] = numbers[position];


                /*
                 * Move one position to the LEFT so that we can
                 * check the next previous value.
                 */
                position--;
            }


            /*
             * INSERT THE CURRENT VALUE
             * ------------------------
             * Once the while loop stops, we have found the
             * correct position for "current".
             *
             * position + 1 gives us the location where
             * the current value must be inserted.
             */

            numbers[position + 1] = current;
        }


        /*
         * STEP 4: DISPLAY THE SORTED ARRAY
         * --------------------------------
         */

        System.out.println("\nSorted array list:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}