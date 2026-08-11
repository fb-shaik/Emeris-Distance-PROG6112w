package com.mycompany.arraysclass_demo;

// Import the Arrays class from the java.util package.
// This gives us access to useful methods for working with arrays.
import java.util.Arrays;


/*
 * ARRAYS CLASS DEMO
 * -----------------
 *
 * An ARRAY and the ARRAYS CLASS are two different things:
 *
 * Array:
 *      A fixed-size structure used to store multiple values
 *      of the same data type.
 *
 * Arrays Class:
 *      A utility/helper class provided by Java that contains
 *      useful methods for working with arrays.
 *
 * Some useful Arrays class methods include:
 *
 *      Arrays.toString()
 *      Arrays.sort()
 *      Arrays.copyOf()
 *      Arrays.copyOfRange()
 *      Arrays.binarySearch()
 *      Arrays.equals()
 *      Arrays.fill()
 *
 * To use the Arrays class:
 *
 *      import java.util.Arrays;
 */

public class ArraysClass_Demo {

    public static void main(String[] args) {


        /*
         * STEP 1: CREATE AN ARRAY
         * -----------------------
         * Store five student test marks in an integer array.
         */

        int[] marks = {78, 56, 91, 69, 84};


        /*
         * STEP 2: DISPLAY THE ORIGINAL ARRAY
         * ----------------------------------
         */

        System.out.println("Original Marks");

        /*
         * If we try:
         *
         * System.out.println(marks);
         *
         * Java does NOT display the individual array values
         * in a readable format.
         *
         * Arrays.toString() converts the array into a readable
         * String representation.
         */

        System.out.println(Arrays.toString(marks));


        /*
         * STEP 3: SORT THE ARRAY
         * ----------------------
         *
         * Arrays.sort() sorts the values into
         * ASCENDING order (smallest to largest).
         *
         * IMPORTANT:
         * Arrays.sort() changes the ORIGINAL array.
         */

        Arrays.sort(marks);

        System.out.println("\nSorted Marks - Ascending Order");
        System.out.println(Arrays.toString(marks));


        /*
         * STEP 4: DISPLAY IN DESCENDING ORDER
         * -----------------------------------
         *
         * Arrays.sort() sorts an int[] into ascending order.
         *
         * To DISPLAY the values in descending order, we can
         * loop through the sorted array backwards.
         *
         * marks.length - 1 gives us the index of the
         * last element in the array.
         */

        System.out.println("\nDescending Order");

        for (int i = marks.length - 1; i >= 0; i--) {

            System.out.print(marks[i] + " ");
        }


        /*
         * STEP 5: COPY THE ARRAY - copyOf()
         * ---------------------------------
         *
         * Arrays.copyOf() creates a NEW array containing
         * values copied from another array.
         *
         * Syntax:
         *
         * Arrays.copyOf(originalArray, newLength)
         *
         * marks.length means that we want to copy
         * the entire array.
         */

        int[] copiedArray = Arrays.copyOf(marks, marks.length);

        System.out.println("\n\nCopied Array (copyOf)");
        System.out.println(Arrays.toString(copiedArray));


        /*
         * STEP 6: COPY PART OF AN ARRAY - copyOfRange()
         * ---------------------------------------------
         *
         * Arrays.copyOfRange() allows us to copy only
         * a selected range of elements.
         *
         * Syntax:
         *
         * Arrays.copyOfRange(array, fromIndex, toIndex)
         *
         * IMPORTANT:
         *
         * fromIndex -> INCLUDED
         * toIndex   -> EXCLUDED
         *
         * Therefore:
         *
         * Arrays.copyOfRange(copiedArray, 1, 3)
         *
         * copies:
         *
         * index 1
         * index 2
         *
         * but NOT index 3.
         */

        int[] rangeCopyArray =
                Arrays.copyOfRange(copiedArray, 1, 3);

        System.out.println("\nRange Copy Array (copyOfRange)");
        System.out.println(Arrays.toString(rangeCopyArray));


        /*
         * STEP 7: CLONE AN ARRAY - clone()
         * --------------------------------
         *
         * clone() creates a new copy of the array.
         *
         * The new array contains the same values,
         * but it is a separate array in memory.
         */

        int[] cloneMarks = marks.clone();

        System.out.println("\nCloned Array (clone)");
        System.out.println(Arrays.toString(cloneMarks));


        /*
         * STEP 8: DEMONSTRATE INDEPENDENT COPIES
         * --------------------------------------
         *
         * Change the first element of copiedArray.
         *
         * Because copyOf() created a NEW array,
         * changing copiedArray will NOT change marks.
         */

        copiedArray[0] = 100;

        System.out.println("\nAfter changing copiedArray:");

        // Original array remains unchanged.
        System.out.println(
                "Original Marks: " + Arrays.toString(marks)
        );

        // Only copiedArray has been changed.
        System.out.println(
                "Copied Array:   " + Arrays.toString(copiedArray)
        );

        // cloneMarks also remains unchanged.
        System.out.println(
                "Cloned Array:   " + Arrays.toString(cloneMarks)
        );

    }
}


/*
 * =========================================================
 * ARRAYS CLASS - SUMMARY
 * =========================================================
 *
 * ARRAY:
 * ------
 * A fixed-size structure that stores multiple values
 * of the same data type.
 *
 * Example:
 *
 *      int[] marks = {78, 56, 91, 69, 84};
 *
 *
 * ARRAYS CLASS:
 * -------------
 * A utility/helper class provided by Java that makes
 * working with arrays easier.
 *
 * Import it using:
 *
 *      import java.util.Arrays;
 *
 *
 * COMMON ARRAYS CLASS METHODS:
 *
 * Arrays.toString(array)
 *      -> Displays an array in a readable format.
 *
 * Arrays.sort(array)
 *      -> Sorts an array into ascending order.
 *
 * Arrays.copyOf(array, length)
 *      -> Creates a new copy of an array.
 *
 * Arrays.copyOfRange(array, start, end)
 *      -> Copies a selected range from an array.
 *
 * Arrays.binarySearch(array, value)
 *      -> Searches for a value in a sorted array.
 *
 * Arrays.equals(array1, array2)
 *      -> Checks whether two arrays contain the same values.
 *
 * Arrays.fill(array, value)
 *      -> Fills an array with a specified value.
 *
 *
 * IMPORTANT:
 *
 * The methods in the Arrays class are STATIC.
 *
 * Therefore, we call them using the class name:
 *
 *      Arrays.sort(marks);
 *
 * We do NOT need to create an Arrays object.
 */