package com.mycompany.lu1_enum_demo;

import java.util.Scanner;

/*
 * ENUM DEMO - DAYS OF THE WEEK
 * ----------------------------
 *
 * An enum is a special Java type used to store
 * a FIXED set of related constants.
 *
 * In this example, the Day enum stores the
 * seven valid days of the week.
 *
 * Because the possible values are fixed,
 * an enum helps prevent invalid or inconsistent values.
 */

public class LU1_Enum_Demo {

    /*
     * STEP 1: CREATE THE ENUM
     * -----------------------
     *
     * enum means "enumeration".
     *
     * The Day enum contains a fixed list of constants.
     *
     * By convention, enum constants are normally written
     * using UPPERCASE letters.
     */

    public enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }


    public static void main(String[] args) {

        /*
         * STEP 2: CREATE THE SCANNER OBJECT
         * ---------------------------------
         *
         * Scanner allows the program to receive
         * keyboard input from the user.
         */

        Scanner input = new Scanner(System.in);


        // Display the application heading.
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("       DAYS OF THE WEEK");
        System.out.println("++++++++++++++++++++++++++++");


        /*
         * STEP 3: GET ALL ENUM VALUES
         * ---------------------------
         *
         * The values() method returns all the constants
         * declared inside the Day enum.
         *
         * The returned values are stored inside an array.
         *
         * Therefore:
         *
         * Day[] days = Day.values();
         *
         * creates an array that contains:
         *
         * days[0] = MONDAY
         * days[1] = TUESDAY
         * days[2] = WEDNESDAY
         * days[3] = THURSDAY
         * days[4] = FRIDAY
         * days[5] = SATURDAY
         * days[6] = SUNDAY
         */

        Day[] days = Day.values();


        /*
         * STEP 4: DISPLAY THE MENU
         * ------------------------
         */

        System.out.println("\nSelect a day:");


        /*
         * Loop through the enum array and display
         * each available option.
         */

        for (int index = 0; index < days.length; index++) {

            /*
             * Array indexes begin at 0.
             *
             * However, menu options are normally easier
             * for users to understand when numbered from 1.
             *
             * Therefore:
             *
             * index     -> array position
             * index + 1 -> menu number
             *
             * Example:
             *
             * index 0 -> displays as option 1
             * index 1 -> displays as option 2
             */

            System.out.println(
                    (index + 1) + ". " + days[index]
            );
        }


        /*
         * STEP 5: GET AND VALIDATE USER INPUT
         * -----------------------------------
         *
         * This variable will store the user's
         * menu selection.
         */

        int choice;


        /*
         * while(true) creates a loop that continues
         * until we explicitly stop it using break.
         *
         * This allows the program to repeatedly ask
         * the user for input until a valid value is entered.
         */

        while (true) {

            System.out.print("\nEnter your choice (1-7): ");


            /*
             * hasNextInt() checks whether the next value
             * entered by the user is a valid whole number.
             *
             * It returns:
             *
             * true  -> the input can be read as an int
             * false -> the input is not an int
             */

            if (input.hasNextInt()) {

                choice = input.nextInt();


                /*
                 * Check whether the number is within
                 * the valid menu range.
                 *
                 * days.length = 7
                 *
                 * Therefore valid choices are:
                 *
                 * 1 to 7
                 */

                if (choice >= 1 && choice <= days.length) {

                    /*
                     * The input is valid.
                     *
                     * break exits the while loop.
                     */

                    break;

                } else {

                    System.out.println(
                            "Invalid choice. Please select a number from 1 to 7."
                    );
                }

            } else {

                /*
                 * The user entered something that cannot
                 * be converted into an integer.
                 */

                System.out.println(
                        "Invalid input. Please enter a whole number."
                );


                /*
                 * input.next() removes the invalid value
                 * from the Scanner.
                 *
                 * Without this, the Scanner would keep
                 * reading the same invalid input.
                 */

                input.next();
            }
        }


        /*
         * STEP 6: CONVERT THE MENU CHOICE INTO AN ENUM VALUE
         * --------------------------------------------------
         *
         * The user selects a number from 1 to 7.
         *
         * However, the days array uses indexes from 0 to 6.
         *
         * Therefore, subtract 1 from the user's choice.
         *
         * Example:
         *
         * User enters:
         *      1
         *
         * Array index:
         *      1 - 1 = 0
         *
         * Therefore:
         *
         *      days[0]
         *
         * returns:
         *
         *      MONDAY
         */

        Day selectedDay = days[choice - 1];


        // Display the enum value selected by the user.
        System.out.println("\nYou selected: " + selectedDay);


        /*
         * STEP 7: USE THE ENUM IN A SWITCH STATEMENT
         * ------------------------------------------
         *
         * A switch statement can work directly
         * with enum values.
         *
         * Each case represents one possible value
         * from the Day enum.
         */

        switch (selectedDay) {

            case MONDAY:
                System.out.println(
                        "Monday is the start of the working week."
                );
                break;

            case TUESDAY:
                System.out.println(
                        "Tuesday is the second day of the working week."
                );
                break;

            case WEDNESDAY:
                System.out.println(
                        "Wednesday is the middle of the working week."
                );
                break;

            case THURSDAY:
                System.out.println(
                        "Thursday is almost the end of the working week."
                );
                break;

            case FRIDAY:
                System.out.println(
                        "Friday is the final day of the working week."
                );
                break;

            case SATURDAY:
                System.out.println(
                        "Saturday is part of the weekend."
                );
                break;

            case SUNDAY:
                System.out.println(
                        "Sunday is a day to rest and prepare for Monday."
                );
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
 * a FIXED collection of related constants.
 *
 *
 * GENERAL SYNTAX:
 *
 * accessModifier enum EnumName
 * {
 *      CONSTANT_ONE,
 *      CONSTANT_TWO,
 *      CONSTANT_THREE
 * }
 *
 *
 * EXAMPLE:
 *
 * public enum Day
 * {
 *      MONDAY,
 *      TUESDAY,
 *      WEDNESDAY
 * }
 *
 *
 * IMPORTANT:
 *
 * Enum constants are normally written in UPPERCASE.
 *
 *
 * WHY USE AN ENUM?
 *
 * - Restricts values to a fixed set of valid options.
 * - Improves readability.
 * - Reduces spelling mistakes.
 * - Provides type safety.
 * - Makes code easier to maintain.
 * - Works well with switch statements.
 * - Keeps related constants together.
 *
 *
 * USEFUL ENUM METHODS:
 *
 * Day.values()
 *      -> Returns all Day constants in an array.
 *
 * Day.valueOf("MONDAY")
 *      -> Converts the String "MONDAY"
 *         into the enum constant Day.MONDAY.
 *
 * selectedDay.name()
 *      -> Returns the name of the enum constant
 *         as a String.
 *
 * selectedDay.ordinal()
 *      -> Returns the position of the enum constant.
 *
 * Example:
 *
 * MONDAY.ordinal()    -> 0
 * TUESDAY.ordinal()   -> 1
 * WEDNESDAY.ordinal() -> 2
 *
 * Remember:
 *
 * ordinal() also starts counting at 0.
 */