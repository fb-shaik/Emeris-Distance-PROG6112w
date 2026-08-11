package com.mycompany.lu_enums_demo;

import java.util.Scanner;

/*
 * ENUM DEMO - PIZZA SIZE
 * ----------------------
 *
 * This program demonstrates how an enum can be used
 * to represent a fixed set of related values.
 *
 * In this example, the valid pizza sizes are:
 *
 *      SMALL
 *      MEDIUM
 *      LARGE
 *
 * The user selects a menu option from 1 to 3.
 * The program then converts that menu choice into
 * the matching PizzaSize enum value.
 */

public class LU_enums_demo {


    /*
     * STEP 1: CREATE THE ENUM
     * -----------------------
     *
     * An enum contains a FIXED set of related constants.
     *
     * By convention, enum constants are written
     * using UPPERCASE letters.
     *
     * An enum can be declared inside the class,
     * but outside the main() method.
     */

    enum PizzaSize {
        SMALL,
        MEDIUM,
        LARGE
    }


    public static void main(String[] args) {

        /*
         * STEP 2: CREATE THE SCANNER OBJECT
         * ---------------------------------
         *
         * Scanner is used to receive keyboard input
         * from the user.
         */

        Scanner input = new Scanner(System.in);


        /*
         * STEP 3: DISPLAY THE MENU
         * ------------------------
         */

        System.out.println("PIZZA SIZE SELECTION");
        System.out.println("--------------------");
        System.out.println("1. Small");
        System.out.println("2. Medium");
        System.out.println("3. Large");

        System.out.print("\nPlease choose a pizza size (1-3): ");

        int choice = input.nextInt();


        /*
         * STEP 4: CREATE AN ENUM VARIABLE
         * -------------------------------
         *
         * PizzaSize is now being used as a data type.
         *
         * Just as we can declare:
         *
         *      int number;
         *      String name;
         *
         * we can also declare:
         *
         *      PizzaSize size;
         *
         * The variable "size" can only store one of the
         * constants declared inside PizzaSize.
         */

        PizzaSize size;


        /*
         * STEP 5: CONVERT THE USER'S MENU CHOICE
         *         INTO AN ENUM VALUE
         * ---------------------------------------
         *
         * The user enters an integer:
         *
         *      1, 2 or 3
         *
         * The switch statement converts that number
         * into the corresponding enum constant.
         *
         * Example:
         *
         * User enters 2
         *
         *      choice = 2
         *
         * Therefore:
         *
         *      size = PizzaSize.MEDIUM;
         */

        switch (choice) {

            case 1:
                size = PizzaSize.SMALL;
                break;

            case 2:
                size = PizzaSize.MEDIUM;
                break;

            case 3:
                size = PizzaSize.LARGE;
                break;

            default:
                System.out.println("Invalid selection.");

                // Close the Scanner before ending the program.
                input.close();

                // return exits the main() method,
                // which ends the program.
                return;
        }


        /*
         * STEP 6: USE THE ENUM VALUE
         * --------------------------
         *
         * Now that "size" contains a PizzaSize value,
         * we can use it directly in another switch statement.
         *
         * Each case represents one possible enum constant.
         */

        switch (size) {

            case SMALL:
                System.out.println("\nSelected Size: Small");
                System.out.println("Price: R65");
                System.out.println("Perfect for one person.");
                break;


            case MEDIUM:
                System.out.println("\nSelected Size: Medium");
                System.out.println("Price: R95");
                System.out.println("Ideal for sharing.");
                break;


            case LARGE:
                System.out.println("\nSelected Size: Large");
                System.out.println("Price: R120");
                System.out.println("Great for the whole family.");
                break;
        }


        // Close the Scanner when input is no longer required.
        input.close();
    }
}


/*
 * =========================================================
 * ENUM NOTES
 * =========================================================
 *
 * enum means ENUMERATION.
 *
 * An enum is a special Java type used to represent
 * a fixed collection of related constants.
 *
 * An enum defines its own data type, and variables of that type can store only the constants declared in the enum
 * 
 * GENERAL SYNTAX:
 *
 * enum EnumName
 * {
 *      CONSTANT_ONE,
 *      CONSTANT_TWO,
 *      CONSTANT_THREE
 * }
 *
 *
 * EXAMPLE:
 *
 * enum PizzaSize
 * {
 *      SMALL,
 *      MEDIUM,
 *      LARGE
 * }
 *
 *
 * ENUM CONSTANTS:
 *
 * Enum constants are normally written using
 * UPPERCASE letters.
 *
 *
 * ACCESSING AN ENUM CONSTANT:
 *
 * Use the enum name followed by the dot operator:
 *
 *      EnumType.EnumValue
 *
 * Example:
 *
 *      PizzaSize.SMALL
 *      PizzaSize.MEDIUM
 *      PizzaSize.LARGE
 *
 *
 * AN ENUM CAN BE USED AS A DATA TYPE:
 *
 *      PizzaSize size;
 *
 * The variable "size" can only store values
 * declared inside the PizzaSize enum.
 *
 * Valid:
 *
 *      size = PizzaSize.SMALL;
 *
 * Invalid:
 *
 *      size = "Extra Large";
 *
 * because EXTRA_LARGE was not declared in the enum.
 *
 *
 * WHY USE ENUMS?
 *
 * - Keeps related constants together.
 * - Limits values to a known set.
 * - Reduces invalid values.
 * - Improves readability.
 * - Provides type safety.
 * - Works well with switch statements.
 */