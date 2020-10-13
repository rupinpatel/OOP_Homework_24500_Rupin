/*
 * Program: Object Oriented Programming 01
 * CPSC-24500-003
 * Date: 9/30/2020
 *
 * This program prompts the user to enter a students name, academic year and GPA
 * while also ensuring there are no errors with the information entered.
 *
 */

package com.company;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Rupin Patel
 */


public class PatelOOP01 {

    // Main function that runs the mainMenu method
    public static void main(String[] args) throws IOException {
        mainMenu();
    }

    // Method for displaying the main menu
    private static void mainMenu() throws IOException {

        // Initializes variables name, year and gpa and sets default values
        String name = "";
        String year = "";
        double gpa = -0.1;

        // Loop that keeps repeating as long as the program does not exit
        while (true) {

            // Main menu that prompts the user to enter the name, year and GPA of a student
            System.out.println("1. Enter Students Name");
            System.out.println("2. Enter Students Academic Year");
            System.out.println("3. Enter Students GPA");
            System.out.println("4. Display Students Info");
            System.out.println("5. Exit");
            System.out.println("");

            // Saves the input value into a variable named choice
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter which number you want to answer: ");
            String choice = scanner.next();

            // If the user enters 1
            if (choice.equals("1")) {

                // Prompts and saves the user's name into the name variable
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Enter the students name: ");
                name = scanner2.nextLine();
                System.out.println("");

                // If the user enters 2
            } else if (choice.equals("2")) {

                //Prompts the user to enter the academic year
                Scanner scanner2 = new Scanner(System.in);
                String temp;
                System.out.println("Enter the students Academic Year: ");

                // Converts all the text into lower case and saves it into a temp variable
                temp = (scanner2.nextLine()).toLowerCase();

                // Checks if the user entered a proper value or gives an error if the year entered is invalid
                // If the year is valid, it moves the year from temp to year variable
                if ((temp.equals("freshman")) || (temp.equals("sophomore")) || (temp.equals("junior")) || (temp.equals("senior"))) {
                    year = temp;
                } else {
                    System.out.println("");
                    System.out.println("ERROR, INVALID YEAR: Please try entering the year again!");
                    System.out.println("Acceptable options are Freshman, Sophomore, Junior, Senior");
                }
                System.out.println("");

                // If the user enters 3
            } else if (choice.equals("3")) {

                // Prompts the user to enter the GPA
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Enter the students GPA: ");

                // Stores the GPA entered into a temporary variable
                double temp = scanner2.nextDouble();

                // If the GPA entered is valid, saves it into the GPA variable
                // else displays an error and prompts to retry
                if (temp >= 0.0 && temp <= 4.0) {
                    gpa = temp;
                } else {
                    System.out.println("");
                    System.out.println("ERROR, INVALID GPA: Please try entering the GPA again!");
                    System.out.println("Acceptable values should be between 0.0 to 4.0");
                }
                System.out.println("");

                // If the user picks option 4
            } else if (choice.equals("4")) {

                // Creates a new student object
                Student currentStudent = new Student(name, year, gpa);

                // Ensures all the values are entered (different from default) before displaying information
                if (!name.equals("") && !year.equals("") && gpa != -0.1) {
                    System.out.println("");
                    System.out.println("The students name is: " + currentStudent.getStudentName());
                    System.out.println("The students academic year is: " + currentStudent.getStudentYear());
                    System.out.println("The students GPA is: " + currentStudent.getStudentGpa());
                    System.out.println("");

                    // Allows the user to 'clear' the terminal
                    // Uses a 100 empty lines to make it look clean
                    System.out.println("Type 'clear' to clear the terminal and restart from main menu.");
                    System.out.println("Type anything else to exit.");
                    Scanner scanner3 = new Scanner(System.in);
                    String command = scanner3.next();

                    if (command.equals("clear")) {

                        // Resets all the values before leaving a hundred empty spaces to make it look clean
                        name = "";
                        year = "";
                        gpa = -0.1;
                        for (int space =0; space <100; space++) {
                            System.out.println("");
                        }

                        // If the user does not enter clear, exits the program
                    } else {
                        System.out.println("Goodbye!");
                        System.exit(0);
                    }

                    // Displays an error if some of the information from 1 to 3 is missing
                } else {
                    System.out.println("");
                    System.out.println("PLEASE ANSWER ALL THE QUESTIONS BEFORE DISPLAYING STUDENT INFORMATION!");
                    System.out.println("");
                }

                // Exits the program if the user picks option 5
            } else if (choice.equals("5")) {
                System.exit(0);

                // Displays an error and prompts the user to reenter valid choices
            } else {
                System.out.println("");
                System.out.println("INVALID CHOICE! Please enter a number between 1 to 5.");
                System.out.println("");
            }
        }
    }
}
