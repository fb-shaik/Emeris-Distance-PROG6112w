package com.mycompany.lu1_arraylist.demo;

// Import ArrayList so that we can create dynamic lists.
import java.util.ArrayList;

// Import Collections so that we can use useful utility methods
// such as sort() with ArrayLists.
import java.util.Collections;

public class LU1_ArrayListDemo {

    public static void main(String[] args) {

        /*
         * STEP 1: CREATE AN ARRAYLIST
         * ---------------------------
         *
         * General syntax:
         *
         * ArrayList<DataType> listName = new ArrayList<>();
         *
         * An ArrayList stores a dynamic collection of objects.
         * This means that its size can grow or shrink while
         * the program is running.
         */

        ArrayList<String> names = new ArrayList<>();


        /*
         * STEP 2: ADD ITEMS TO THE ARRAYLIST
         * ----------------------------------
         *
         * Use the add() method:
         *
         * listName.add(value);
         *
         * New items are added to the end of the list.
         *
         * ArrayList indexes start at 0.
         */

        names.add("Alex");       // Index 0
        names.add("Charlie");    // Index 1
        names.add("David");      // Index 2
        names.add("Bob");        // Index 3

        System.out.println(
                "Initial List of Names: " + names
        );


        /*
         * STEP 3: INSERT AN ITEM AT A SPECIFIC INDEX
         * ------------------------------------------
         *
         * Syntax:
         *
         * listName.add(index, value);
         *
         * Adding an item at a specific index shifts
         * the existing items to the right.
         */

        names.add(1, "Alice");

        System.out.println(
                "After inserting Alice: " + names
        );

        /*
         * The ArrayList now contains:
         *
         * Index 0 -> Alex
         * Index 1 -> Alice
         * Index 2 -> Charlie
         * Index 3 -> David
         * Index 4 -> Bob
         */


        /*
         * STEP 4: RETRIEVE AN ITEM
         * ------------------------
         *
         * Use get(index) to retrieve an item
         * from a specific position.
         */

        System.out.println(
                "Element at index 3: " + names.get(3)
        );


        /*
         * STEP 5: SORT THE ARRAYLIST
         * --------------------------
         *
         * Collections.sort() sorts the elements
         * into ascending order.
         *
         * For Strings, this means alphabetical order A-Z.
         *
         * IMPORTANT:
         *
         * Collections.sort() changes the original ArrayList.
         */

        Collections.sort(names);

        System.out.println(
                "\nSorted in alphabetical order:"
        );

        System.out.println(names);


        /*
         * STEP 6: UPDATE AN ITEM
         * ----------------------
         *
         * Use set(index, newValue) to replace
         * an existing item.
         *
         * Syntax:
         *
         * listName.set(index, newValue);
         */

        names.set(4, "Alan");

        System.out.println(
                "\nAfter set(): " + names
        );


        /*
         * STEP 7: REMOVE AN ITEM
         * ----------------------
         *
         * remove() can remove an item from an ArrayList.
         *
         * Here we remove the String value "Alex".
         */

        names.remove("Alex");

        System.out.println(
                "After remove(): " + names
        );


        /*
         * Because we changed and removed values,
         * we can sort the ArrayList again.
         */

        Collections.sort(names);

        System.out.println(
                "\nSorted again in alphabetical order:"
        );

        System.out.println(names);


        /*
         * STEP 8: BOOLEAN ARRAYLIST
         * -------------------------
         *
         * ArrayLists cannot use primitive data types directly.
         *
         * Therefore, instead of:
         *
         * boolean
         *
         * we use the wrapper class:
         *
         * Boolean
         */

        ArrayList<Boolean> attendance = new ArrayList<>();


        /*
         * In this example:
         *
         * true  -> Student is present
         * false -> Student is absent
         */

        attendance.add(true);     // Student 1
        attendance.add(false);    // Student 2
        attendance.add(false);    // Student 3
        attendance.add(true);     // Student 4
        attendance.add(true);     // Student 5


        System.out.println(
                "\nAttendance List: " + attendance
        );


        /*
         * Index 1 represents Student 2 because
         * indexes begin at 0.
         */

        System.out.println(
                "Student 2 Present? " + attendance.get(1)
        );
    }
}


/*
 * =========================================================
 * RECAP: ARRAY, ARRAYS CLASS, ARRAYLIST & COLLECTIONS
 * =========================================================
 *
 *
 * 1. ARRAY
 * ---------------------------------------------------------
 *
 * An array stores a FIXED number of values
 * of the same data type.
 *
 * General syntax:
 *
 * dataType[] arrayName = {value1, value2, value3};
 *
 * Example:
 *
 * String[] languages = {"Java", "C#", "Python"};
 *
 * Important:
 *
 * Once an array has been created, its size
 * cannot be changed.
 *
 *
 * 2. ARRAYS CLASS
 * ---------------------------------------------------------
 *
 * The Arrays class is a utility/helper class
 * used with normal arrays.
 *
 * Import:
 *
 * import java.util.Arrays;
 *
 * Examples of useful methods:
 *
 * Arrays.sort(array);
 * Arrays.toString(array);
 * Arrays.copyOf(array, length);
 * Arrays.binarySearch(array, value);
 *
 * These methods are STATIC.
 *
 * Therefore, we call them using the class name:
 *
 * Arrays.sort(array);
 *
 * We do not need to create an Arrays object.
 *
 *
 * 3. ARRAYLIST CLASS
 * ---------------------------------------------------------
 *
 * An ArrayList stores a DYNAMIC collection of objects.
 *
 * Dynamic means that items can be added or removed
 * while the program is running.
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
 * COMMON ARRAYLIST METHODS:
 *
 * add(value)
 *      -> Adds an item.
 *
 * add(index, value)
 *      -> Adds an item at a specific index.
 *
 * get(index)
 *      -> Retrieves an item.
 *
 * set(index, value)
 *      -> Updates an item.
 *
 * remove(value)
 *      -> Removes a matching item.
 *
 * remove(index)
 *      -> Removes an item at a specific index.
 *
 * size()
 *      -> Returns the number of items.
 *
 *
 * 4. COLLECTIONS CLASS
 * ---------------------------------------------------------
 *
 * The Collections class provides useful utility methods
 * for working with collections such as ArrayLists.
 *
 * Import:
 *
 * import java.util.Collections;
 *
 * Example:
 *
 * Collections.sort(names);
 *
 * This sorts a String ArrayList alphabetically.
 *
 * Other useful methods include:
 *
 * Collections.reverse(list);
 * Collections.max(list);
 * Collections.min(list);
 * Collections.shuffle(list);
 *
 *
 * =========================================================
 * PRIMITIVE TYPES & WRAPPER CLASSES
 * =========================================================
 *
 * PRIMITIVE TYPES:
 *
 * Primitive types are built-in Java data types.
 * A primitive variable directly stores its value.
 *
 * Examples:
 *
 * int
 * double
 * boolean
 * char
 * float
 *
 *
 * WRAPPER CLASSES:
 *
 * ArrayLists work with objects, so primitive types
 * use their corresponding wrapper classes.
 *
 * Primitive Type       Wrapper Class
 * -----------------------------------
 * int                  Integer
 * double               Double
 * boolean              Boolean
 * char                 Character
 * float                Float
 *
 *
 * Example:
 *
 * Correct:
 *
 * ArrayList<Integer> marks = new ArrayList<>();
 *
 * Incorrect:
 *
 * ArrayList<int> marks = new ArrayList<>();
 */