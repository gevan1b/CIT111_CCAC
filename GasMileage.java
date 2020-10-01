/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;


/**
 *
 * @author Greg
 */
public class GasMileage {
    public static void main(String[] args) {
        
        // declare final int for mpg
        final int MPG = 28;
        
        // declare variables
        double remainderGas;
        int serviceStationMiles;
        int milesLeft;
        // create scanner for user
        Scanner userInputScanner = new Scanner(System.in);
        
        System.out.println("************** Will I Make It? **************");
        // user declares remainder of gas
        System.out.println("How many gallons of gas remain in your tank?");
        remainderGas = userInputScanner.nextDouble();
        // user declares miles to next service station
        System.out.println("How many miles to the next gas station?");
        serviceStationMiles = userInputScanner.nextInt();
        
        // equation to see amount of miles left per gallon
        milesLeft = (int) (MPG * remainderGas);
        
        // if() statement
        if(milesLeft > serviceStationMiles){
            // output if you have enough gas left in tank
            System.out.println("You have enough gas to make it to the station!");
        } else {
            // output if you DO NOT have enough gas left
            System.out.println("You do NOT have enough gas to make it to the station, uh oh!");
        } // end if() 
    } //end main method
} //end class GasMileage
