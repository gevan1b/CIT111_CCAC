/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.util.Scanner;

/**
 * Program to allow a restaurant to tabulate food orders
 * @author Greg
 */
public class OrderTabulator {
    //declare empty variables to accumulate order
    private static int numPSliders = 0;
    private static int numRBSliders = 0;
    
    public static void main(String[] args) {
        boolean run = true;
        //encapsulate code in a while statement to allow reorders
        while (run){
            // run menu
            menu();
            //declare variables / initiate scanner
            int userSelection;
            Scanner userScanner = new Scanner(System.in);
            userSelection = userScanner.nextInt();
            
            // switch to allow selection of food
            switch(userSelection){
                case 1:
                    orderPSliders();
                    displayOrderTotals();
                    break;
                case 2:
                    orderRBSliders();
                    displayOrderTotals();
                    break;
                case 3:
                    System.out.println("Thank for visiting the Pizza Factory!");
                    displayOrderTotals();
                    System.out.println("****Hope to see you again soon!****");
                    run = false;
                    break;
            
            } // end switch
           
        } // end while  
    } // end main
    
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
    
    public static void menu(){
        System.out.println("******* WELCOME TO THE PIZZA FACTORY********");
        System.out.println("*****  PLEASE ENTER A NUMBER TO ORDER  *****");
        System.out.println("***        1 - PIZZA SLIDERS             ***");
        System.out.println("***        2 - ROAST BEEF SLIDERS        ***");
        System.out.println("***        3 - LEAVE                     ***");
        System.out.println("********************************************");
        
    } // close menu()
     
}
