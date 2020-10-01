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

public class IfControl {
  public static void main(String[] args) {
    
    //set purchase limit
    final double PURCHASE_LIMIT = 200.0;
    // double variable
    double purchaseAmount;
    // create Scanner
    Scanner userInputScanner = new Scanner(System.in);

    // prompt user for amount
    System.out.println("Enter the amount of the purchase and press enter:");
    // read what is typed on the keyboard
    purchaseAmount = userInputScanner.nextDouble();

    if(purchaseAmount > PURCHASE_LIMIT){
      // code to run if you DONT have enough money
      System.out.println("Sorry, You don't have enough money to make that purchase!");
    } else {
      //code if you dohave enough
      System.out.println("You have enough money to make that purchase for: $" + purchaseAmount);
    } // end if()
  } // end main method
} // end class Main