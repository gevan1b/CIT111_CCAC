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

public class SpeedEnforcement {
  public static void main(String[] args){
     // setup speed limits
     final int MIN_SPEED = 40;
     final int MAX_SPEED = 55;
     //working speed variable
     int carSpeed;
     //create scanner object for car speed 
     Scanner userInputScanner = new Scanner(System.in);
     // prompt user
     System.out.println("Enter speed of vehicle in MPH: ");
     // grab integer from console
     carSpeed = userInputScanner.nextInt();

     // implement if statement
     if(carSpeed < MIN_SPEED){
       System.out.println("Car is moving too slow");
     } else if(carSpeed > MAX_SPEED){
          System.out.println("Car is moving too fast");
        } else {
            System.out.println("Car is within speed limit range");
     } //close if/blocks

  } //close main method
} //close class main