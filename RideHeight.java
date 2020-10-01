/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author Greg
 */

import java.util.Scanner;

public class RideHeight {
  public static void main(String[] args) {

    // final variable height in cm
    final double MIN_HEIGHT_CM = 80.0;

    // declare double type variables
    double userHeight;
    // Scanner object from library
    Scanner userInputScanner = new Scanner(System.in);

    // prompt user to enter height in cm
    System.out.println("Enter your height in cm to see if you are eligible to ride the Coaster: ");
    // scanner object reads the value
    userHeight = userInputScanner.nextDouble();

    //begin if()
    if(userHeight < MIN_HEIGHT_CM){
      // code if user is NOT taller than min height
      System.out.println(userHeight + "!!! Sorry, you are too short to ride -- Better luck next year!");
      } else {
        // code if user correct height
        System.out.println("Congratulations, you are tall enough to ride!");
    } // end if()


  }
}
