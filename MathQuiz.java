/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;


import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Greg
 */
public class MathQuiz {
    public static void main(String[] args) {
        
        // initiate scanner and random
        Random randGenerator = new Random();
        Scanner userScanner = new Scanner(System.in);
        
        // declare variables
        int userAnswer;
        int count = 0;
        final int UPPER_RANGE = 10;
        int randNum1 = randGenerator.nextInt(UPPER_RANGE);
        int randNum2 = randGenerator.nextInt(UPPER_RANGE);
        int randNum3 = randGenerator.nextInt(UPPER_RANGE);
        int problemAnswer = (randNum1 % randNum2)* randNum3;
        
        System.out.println("**Math Checker**");
        
        while(count < 3){
            
            // Prompt user w question
            System.out.println( "Compute the value of (" + randNum1 + " % " + randNum2 + " ) * " + randNum3);
            userAnswer = userScanner.nextInt();
            
            //begin if()
            if(userAnswer > problemAnswer){
                // answer too high
                System.out.println("Sorry, Incorrect");
                System.out.println("(Your answer is too high)");
                System.out.println("***");
                count++;
            } else if(userAnswer < problemAnswer){
                // answer too low
                System.out.println("Sorry, Incorrect");
                System.out.println("(Your answer is too low)");
                System.out.println("***");
                count++;
            } else if(userAnswer == problemAnswer){
                //correct answer
                System.out.println("You are correct!");
                break;
            } // end if()
        } // end while()
    System.out.println("Thanks for taking the quiz!");
    System.out.println("Solution: \n("+ randNum1 + " % " + randNum2 + " ) * " + randNum3 + " = " + problemAnswer );
    
    } // end main
} // end class
