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

public class UsernameAndPassword {
  public static void main(String[] args) {
    // constants to authenticate against
    final String CORRECT_USERNAME = "JazzPanther";
    final String CORRECT_PASSWORD = "Time2Cod3";
    // storage variables for user data
    String enteredUsername;
    String enteredPassword;

    //create scanner obj
    Scanner userInputScanner = new Scanner(System.in);

    //prompt user for username
    System.out.println("Enter your username:");
    // read username typed in convert to variable
    enteredUsername = userInputScanner.next();

    //prompt user for password
    System.out.println("Enter your password:");
    // same scanner to read entered password
    enteredPassword = userInputScanner.next();

    //check both username and password
    if(enteredUsername.equals(CORRECT_USERNAME) && enteredPassword.equals(CORRECT_PASSWORD)){
      // successful auth message
      System.out.println("Authentication Success! Welcome to nothing!");
    } else {
      // failed auth message
      System.out.println("Failure to autheticate. This attempt will not be recorded");
    } // end if/else blocks
  } // close main method
} //close class
