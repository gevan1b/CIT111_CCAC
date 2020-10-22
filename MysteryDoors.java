/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.Scanner;

/**
 *
 * @author Greg
 */
public class MysteryDoors {
    public static void main(String[] args) {
        
        System.out.println("    WELCOME TO THE GAME OF THE CENTURY");
        System.out.println("     -------DECIDE YOUR FATE------- ");
        System.out.println("");
        System.out.println("**********     **********     **********");
        System.out.println("*  **    *     *  * *   *     * ****   *");
        System.out.println("*   *    *     * *   *  *     *     *  *");
        System.out.println("*   *    *     *     *  *     * *****  *");
        System.out.println("*   *    *     *    *   *     *     *  *");
        System.out.println("*  ***   *     * ****** *     * ****   *");
        System.out.println("**********     **********     **********");
        System.out.println("");
        
        //declare variables
        double userBirthYear;
        double userBirthMonthDay;
        //initalize scanner
        Scanner userScanner = new Scanner(System.in);
        
        //user chooses door
        System.out.println("Enter the door you would like to select - 1, 2, or 3: ");
        System.out.println("The prize you get is determined by if you solve the problem within");
        int doorChoice = userScanner.nextInt();
        
        //switch to decide door
        switch(doorChoice){
            case 1:
                openDoor1();
                break;
            case 2:
                openDoor2();
                break;
            case 3:
                //door 3 will pass user input into the openDoor3() method
                System.out.println("WELCOME TO DOOR 3");
                System.out.println("Please enter the year you were born (YYYY)");
                userBirthYear = userScanner.nextDouble();
                System.out.println("Please enter month and day you were born as follows (MM.DD)");
                System.out.println("Must include '.' between month and day ");
                userBirthMonthDay = userScanner.nextDouble();
                
                openDoor3(userBirthYear, userBirthMonthDay);
                
                break;
            default:
                System.out.println("Sorry, that is an incorrect choice");
                System.out.println("Please relaunch program");
        } // end switch() method
        
        System.out.println("Thanks for playing!");
    } // end main method
    
    public static void openDoor1(){
        System.out.println("Welcome to door one please! Please solve the following problem: ");
        System.out.println("2 * 5(16 / 2) = ");
        //initialize scanner
        Scanner userScanner = new Scanner(System.in);
        int door1Answer = userScanner.nextInt();
        
        //determines if the user solved the problem
        if(door1Answer == 90){
            System.out.println("Congratulations! You've won!");
            System.out.println("Your prize you might ask?");
            System.out.println("Well, it's the friends we made along the way.");
            
        } else {
            System.out.println("Uh oh! Seems you made an error.");
            System.out.println("Better luck next time!");
        }
            
        
    } // end openDoor1()
    
    public static void openDoor2(){
        System.out.println("Welcome to door number 2!");
        System.out.println("Are you able to complete this Subrataction Quiz in under 60 seconds");
        subtractionQuiz();
        System.out.println("Congratulations you passed! Maybe? I don't know");
        System.out.println("I have to figure out how to return your results but lets just say you did it!");
    } // end openDoor2()
    
    public static void openDoor3(double year, double monthDay){
        System.out.println("This door is a freebie, you won!!");
        System.out.println("First we must calculate your winnings based on your age");
        System.out.println("Your birth year determines the amount of money you won");
        System.out.println(year);
        System.out.println("While your age determines the amount of tax you must pay");
        System.out.println(monthDay + "%");
        
        monthDay = monthDay / 100;
        double tax = year * monthDay;
        double totalWinnings = year - tax;
        System.out.println("Congratulations your final total is $" + totalWinnings + "!");
                
    } // end openDoor3 ()
    
    public static void subtractionQuiz(){
        final int NUMBER_OF_QUESTIONS = 5; // # of Qs
        int correctCount = 0; // Count # of correct answers
        int count = 0; // count # of questions
        long startTime = System.currentTimeMillis();
        String output = " "; // output string is initially empty
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            // 1. Generate two randon single-digit integers
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);

            // 2. if number1 < number2, swap number1 with number 2
            if (number1 < number2) {
                int temp = number1;
                    number1 = number2;
                    number2 = temp;
            }

            // 3. Prompt the student to answer 
            System.out.print("What is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();

            // 4. Grade the answer and display the result
            if (number1 - number2 == answer) {
                System.out.print("You are correct!\n");
                correctCount++; // increase correct answer count
                count++;
            } else {
                
                System.out.println("Your answer is wrong.\n" + number1 + " - " 
                    + number2  + " should be " + (number1 - number2));
                        

                // increase the question count
                count++;

                output += "\n" + number1 + "-" + number2 + "=" + answer + 
                    ((number1 - number2 == answer) ? " correct" : " wrong");
            }
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctCount + 
            "\nTest time is " + testTime / 1000 + " seconds\n" + output);
        
    }
}
