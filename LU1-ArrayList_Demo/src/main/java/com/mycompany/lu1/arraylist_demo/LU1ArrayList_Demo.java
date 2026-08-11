package com.mycompany.lu1.arraylist_demo;

// STEP 1: Import the ArrayList class from the java.util package.
import java.util.ArrayList;

/*
 * ARRAYLIST DEMO
 * --------------
 *
 * An ArrayList is a resizable collection used to store
 * multiple objects of the same type.
 *
 * Unlike a normal array, the size of an ArrayList can
 * grow or shrink while the program is running.
 *
 * Some common ArrayList methods are:
 *
 * add()       -> Add an item
 * get()       -> Retrieve an item
 * set()       -> Update an item
 * remove()    -> Remove an item
 * contains()  -> Check whether an item exists
 * size()      -> Get the number of items
 * clear()     -> Remove all items
 */

public class LU1ArrayList_Demo {

    public static void main(String[] args) {

        /*
         * STEP 2: CREATE ARRAYLISTS
         * -------------------------
         *
         * General syntax:
         *
         * ArrayList<DataType> listName = new ArrayList<>();
         *
         * IMPORTANT:
         *
         * ArrayLists store objects.
         *
         * Therefore, primitive types such as int and boolean
         * cannot be used directly.
         *
         * We use wrapper classes instead:
         *
         * int      -> Integer
         * double   -> Double
         * char     -> Character
         * boolean  -> Boolean
         */

        // Create an ArrayList that can store Integer values.
        ArrayList<Integer> prices = new ArrayList<>();

        // Create an ArrayList that can store String values.
        ArrayList<String> languages = new ArrayList<>();


        /*
         * STEP 3: ADD ITEMS
         * -----------------
         *
         * With a normal array, we might write:
         *
         * arrayName[index] = value;
         *
         * With an ArrayList, we use:
         *
         * listName.add(value);
         *
         * New items are normally added to the end of the list.
         */

        languages.add("Java");   // Index 0
        languages.add("C#");     // Index 1
        languages.add("C++");    // Index 2
        languages.add("Swift");  // Index 3


        /*
         * ArrayLists can be displayed directly using println().
         *
         * Output:
         *
         * [Java, C#, C++, Swift]
         */

        System.out.println(
                "Initial List of Languages: " + languages
        );


        /*
         * STEP 4: ADD AN ITEM AT A SPECIFIC INDEX
         * ---------------------------------------
         *
         * Syntax:
         *
         * listName.add(index, value);
         *
         * The existing items are shifted to the right.
         */

        languages.add(1, "JavaScript");

        System.out.println(
                "After inserting JavaScript: " + languages
        );

        /*
         * The list is now:
         *
         * Index 0 -> Java
         * Index 1 -> JavaScript
         * Index 2 -> C#
         * Index 3 -> C++
         * Index 4 -> Swift
         */


        /*
         * STEP 5: RETRIEVE AN ITEM
         * ------------------------
         *
         * Use get(index) to access an item.
         *
         * ArrayList indexes start at 0.
         */

        System.out.println(
                "Element at index 2: " + languages.get(2)
        );


        /*
         * STEP 6: UPDATE AN ITEM
         * ----------------------
         *
         * Use set(index, newValue) to replace an existing item.
         *
         * Current index 3 contains:
         *
         * C++
         *
         * It will be replaced with:
         *
         * Python
         */

        languages.set(3, "Python");

        System.out.println(
                "After set(): " + languages
        );


        /*
         * STEP 7: REMOVE AN ITEM
         * ----------------------
         *
         * remove() can remove an item from an ArrayList.
         *
         * Here we remove the String value "Swift".
         */

        languages.remove("Swift");

        System.out.println(
                "After remove(): " + languages
        );


        /*
         * STEP 8: BOOLEAN ARRAYLIST
         * -------------------------
         *
         * An ArrayList<Boolean> can store true and false values.
         *
         * In this example:
         *
         * true  -> Student is present
         * false -> Student is absent
         */

        ArrayList<Boolean> attendance = new ArrayList<>();

        attendance.add(true);
        attendance.add(false);
        attendance.add(true);
        attendance.add(false);
        attendance.add(true);
        attendance.add(true);


        System.out.println(
                "\nAttendance List: " + attendance
        );


        /*
         * get(1) accesses the value at index 1.
         *
         * Remember:
         *
         * Index 0 = Student 1
         * Index 1 = Student 2
         */

        System.out.println(
                "Student 2 Present? " + attendance.get(1)
        );


        /*
         * STEP 9: GET THE SIZE OF AN ARRAYLIST
         * ------------------------------------
         *
         * Arrays use:
         *
         * arrayName.length
         *
         * ArrayLists use:
         *
         * listName.size()
         */

        System.out.println(
                "\nNumber of languages: " + languages.size()
        );


        /*
         * STEP 10: COUNT PRESENT STUDENTS
         * -------------------------------
         *
         * Create an accumulator variable.
         *
         * It starts at 0 because no students
         * have been counted yet.
         */

        int present = 0;


        /*
         * Use an enhanced for loop / for-each loop
         * to visit every Boolean value in attendance.
         *
         * Each value is temporarily stored in "status".
         */

        for (Boolean status : attendance) {

            /*
             * Because status contains either true or false,
             * we can use it directly as the condition.
             *
             * if (status)
             *
             * means:
             *
             * if (status == true)
             */

            if (status) {

                present++;
            }
        }


        /*
         * Display the number of students present.
         */

        System.out.println(
                "Students Present: " + present
        );


        /*
         * Calculate absent students:
         *
         * Total students - Present students
         *
         * attendance.size() gives the total number
         * of attendance records.
         */

        System.out.println(
                "Students Absent: "
                + (attendance.size() - present)
        );
    }
}


/*
 * =========================================================
 * RECAP: ARRAY vs ARRAYS CLASS vs ARRAYLIST
 * =========================================================
 *
 *
 * 1. ARRAY
 * ---------------------------------------------------------
 *
 * An array stores a FIXED number of values
 * of the same data type.
 *
 * Example:
 *
 * String[] languages = {"Java", "C#", "Python"};
 *
 * Once the array has been created, its size
 * cannot be changed.
 *
 * Access an item using:
 *
 * languages[0]
 *
 * Get the size using:
 *
 * languages.length
 *
 *
 * 2. ARRAYS CLASS
 * ---------------------------------------------------------
 *
 * The Arrays class is a Java utility class that provides
 * useful methods for working with normal arrays.
 *
 * Import:
 *
 * import java.util.Arrays;
 *
 * Common methods:
 *
 * Arrays.sort(array);
 * Arrays.fill(array, value);
 * Arrays.copyOf(array, newLength);
 * Arrays.copyOfRange(array, start, end);
 * Arrays.binarySearch(array, value);
 * Arrays.equals(array1, array2);
 * Arrays.toString(array);
 *
 * IMPORTANT:
 *
 * The Arrays class does NOT make a normal array dynamic.
 *
 * A normal array still has a fixed size.
 *
 *
 * 3. ARRAYLIST
 * ---------------------------------------------------------
 *
 * An ArrayList stores a DYNAMIC collection of objects.
 *
 * Its size can grow and shrink while the program runs.
 *
 * Import:
 *
 * import java.util.ArrayList;
 *
 * General syntax:
 *
 * ArrayList<DataType> listName = new ArrayList<>();
 *
 *
 * Examples:
 *
 * ArrayList<String> names = new ArrayList<>();
 *
 * ArrayList<Integer> marks = new ArrayList<>();
 *
 * ArrayList<Double> prices = new ArrayList<>();
 *
 * ArrayList<Character> grades = new ArrayList<>();
 *
 * ArrayList<Boolean> attendance = new ArrayList<>();
 *
 *
 * COMMON ARRAYLIST METHODS
 * ---------------------------------------------------------
 *
 * add(value)
 *      -> Adds an item to the end of the list.
 *
 * add(index, value)
 *      -> Adds an item at a specific index.
 *
 * get(index)
 *      -> Retrieves an item.
 *
 * set(index, value)
 *      -> Replaces an existing item.
 *
 * remove(index)
 *      -> Removes an item at an index.
 *
 * remove(value)
 *      -> Removes a matching object.
 *
 * contains(value)
 *      -> Checks whether the list contains a value.
 *
 * size()
 *      -> Returns the number of items.
 *
 * clear()
 *      -> Removes all items.
 *
 *
 * =========================================================
 * PRIMITIVE TYPES AND WRAPPER CLASSES
 * =========================================================
 *
 * ArrayLists store OBJECTS rather than primitive values.
 *
 * Therefore, primitive types use their matching
 * wrapper classes.
 *
 * Primitive Type        Wrapper Class
 * ---------------------------------------------------------
 * int                   Integer
 * double                Double
 * char                  Character
 * boolean               Boolean
 *
 *
 * CORRECT:
 *
 * ArrayList<Integer> marks = new ArrayList<>();
 *
 *
 * INCORRECT:
 *
 * ArrayList<int> marks = new ArrayList<>();
 */