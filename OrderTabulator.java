/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.util.Scanner;

/**
 *
 * @author Greg
 */
public class OrderTabulator {
    
    private static int numPSliders = 0;
    private static int numRBSliders = 0;
    
    public static void main(String[] args) {
        
        System.out.println("******* WELCOME TO OUR PIZZERIA ********");
        
        
               
        orderPSliders();
        
        
        
        orderRBSliders();
        
        displayOrderTotals();
        
        
        
        
        orderPSliders();
        
        
        
        orderRBSliders();
        
        displayOrderTotals();
    }
    
    public static int orderPSliders(){
        Scanner userScanner = new Scanner(System.in);
        int orderAmount;
        System.out.println("Please enter the amount of pizza sliders you want: ");
        orderAmount = userScanner.nextInt();
        System.out.println("Preparing " + orderAmount + " pizza sliders.");
        numPSliders = numPSliders + orderAmount;
        return orderAmount;
    } // close method orderPSliders()
    
     public static int orderRBSliders(){
        Scanner userScanner = new Scanner(System.in);
        int orderAmount;
        System.out.println("Please Enter the amount of roast Beef sliders you want: ");
        orderAmount = userScanner.nextInt();
        System.out.println("Preparing " + orderAmount + " roast beef sliders.");
        numRBSliders = numRBSliders + orderAmount;
        return orderAmount;
    } // close method orderPSliders()
    
     public static void displayOrderTotals(){
         System.out.println("\n************ ORDER TOTALS ***********");
         System.out.println("Total pizza sliders ordered: " + numPSliders);
         System.out.println("Total Roast beef sliders ordered: " + numRBSliders);
         System.out.println("*************************************\n");
    } // close method displayOrderTotals()
    
     
}
