package com.company;
/*
 * Jerilyn Mensah
 * October 12, 2017
 *
 * This application will print all values between 1 and 100, printing "Fizz" for multiples of 3,
 * "Buzz" for multiples of 5 and "FizzBuzzFreeze" for multiples of both 3 and 5.
 *
 * Update: The user will be asked to input a number greater than 1 and the program will display multiples
 * of that number, plus multiples of 7, 17 and 23.
 */

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        int currentValue = 0;
        String FizzBuzzFreeze;
        String answer = null;

        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("Enter a number greater than 1");
            currentValue = keyboard.nextInt();



            for (int counter = 1; counter < 255; counter++)

            {
                FizzBuzzFreeze = "";


                //Print "Fizz" for multiples of 7
                if (counter % 7 == 0) {
                    FizzBuzzFreeze += "Fizz";
                }

                // Print "Buzz for multiples of 17
                if (counter % 17 == 0) {
                    FizzBuzzFreeze += "Buzz";
                }

                // Print "Freeze" for multiples of 23
                if (counter % 23 == 0) {
                    FizzBuzzFreeze += "Freeze";
                }

                if (counter % currentValue == 0) {
                    FizzBuzzFreeze += "FizzFreeze";
                }

                //Convert to string value when displayed
                if (counter % 7 != 0 && counter % 17 != 0 && counter % 23 !=0 && counter % currentValue !=0) {
                    FizzBuzzFreeze = Integer.toString(counter);
                }
                System.out.println(FizzBuzzFreeze);
            }
        }while(!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"));

            {
            System.out.println("Do you want to continue?");
            }

            if(answer.equalsIgnoreCase("y")&& (!answer.equalsIgnoreCase("n")))
            {
                System.out.println(currentValue);
                currentValue++;
            }else{
                System.out.println("Thanks for playing!");
            }
         }
    }
