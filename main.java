/*
This will be a new InteliJ project and a new GItHub Repo. Make sure everyone present in class is able to get their GitHub set up properly before starting. Then set a 30 minute timer for everyone to work on the first section solo.

-- SOLO --

Spend the first 30 minutes trying to do the following solo

Create an application that can take a user's name as input from the terminal
Have the application display a message --> Hello <name>

If you are done before time is up you can look into solutions for the following steps

-- AS A CLASS --

As a class create a Menu system that
Also the user to choose a program options OR exit the program using a number menu

It should look something like this

-------------------------
Welcome to Gabe's CLI!

Please choose an option to continue
1) Say Hello
2) Reverse a string
3) Add two numbers
4) Exit the program

Selection:
---------------------------

The text cursor should blink next to "Selection: " and allow the user to type a number.
When they press enter
then give them the ability to try again

*/
package com.company;
import java.util.*;

public class main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Eri's CLI");

        boolean isValid = true;

        while (isValid) {

            System.out.println("");
            System.out.println("Please choose an option to continue");
            System.out.println("1) Say Hello");
            System.out.println("2) Reverse a string");
            System.out.println("3) Add two numbers");
            System.out.println("4) Exit the program");
            System.out.println("");
            System.out.print("Selection: ");

            int selection = scan.nextInt();

            switch (selection) {
                case 1:
                    if (selection == 1) {
                        System.out.println("Please provide a name");
                        String trown = scan.nextLine();
                        String name = scan.nextLine();
                        System.out.println("Hello " + name);
                    }
                    break;

                case 2:
                    System.out.println("Please provide a phrase");
                    String reverse = "";
                    String trash = scan.nextLine();
                    String phrase = scan.nextLine();

                    for (int i = phrase.length() - 1; i >= 0; i--) {
                        reverse = reverse + phrase.charAt(i);
                    }
                    System.out.println(reverse);
                    break;

                case 3:
                    System.out.println("Please enter a number");
                    int first = scan.nextInt();
                    System.out.println("Please enter second number");
                    int second = scan.nextInt();
                    int result = first + second;
                    System.out.println(result);
                    break;

                case 4:
                    isValid = false;
                    break;

                default:
                    System.out.println("Invalid Option, please try again");

            }
        }
    }
}