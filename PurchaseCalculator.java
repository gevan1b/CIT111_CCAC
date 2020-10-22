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
public class PurchaseCalculator {
    public static void main(String[] args) {
        final double ITEM_PRICE = 100.00;
        double discount = 0.15;
        double purchaseLimit;
        
        System.out.println("Hard-coded price value: $" + ITEM_PRICE);
        System.out.println("Enter your purchase limit and press enter:");
        //create a scanner
        Scanner userScanner = new Scanner(System.in);
        // read in a double value from user and store in purchaseLimit
        purchaseLimit = userScanner.nextDouble();
        
        //call method and pass in a double value as the declaration
        displayPriceWithTax(ITEM_PRICE);
        
        double perc = discount * 100;
        System.out.println("Hard-coded discount of %" + perc);
        
        computePriceAfterDiscount(ITEM_PRICE, discount);
        
        displayPurchasableNumber(ITEM_PRICE, purchaseLimit);
        
    } // close main method
    
    /**
     * Computes and displays the inputted price with the tax rate added
     * @param price the initial purchase price
     */
    
    public static void displayPriceWithTax(double price){
        // this would normally be in class scope
        final double TAX_RATE = 0.075;
        // compute price + tax
        double totalPrice = price * (1 + TAX_RATE);
        System.out.println("Total price with tax: $" + totalPrice);
    } // close method displayPriceWithTax
    
    /**
     * Computes the final sale price given an initial sale price and a discount
     * @param price the price of item before discount
     * @param discount the discount percent as a decimal value
     */
    public static void computePriceAfterDiscount(double price, double discount){
        double finalPrice = price - (price * discount);
        System.out.println("Price after discount: $" + finalPrice);
    } // close method computPriceAfterDiscount
    
    /**
     * Computes total # of unites that can be purchased within a given
     * spending limit. Uses Math.floor() to round down to the nearest
     * complete unit that can be purchased and displays the result
     * @param price the price of the item to be purchased in x quantity
     * @param limit the amount of money to be spent on x units of item
     */
    public static void displayPurchasableNumber(double price, double limit){
        int numPurchasable = (int) Math.floor(limit / price);
        System.out.println("With $" + limit
        + ", you can buy " + numPurchasable + " units");
    }
}
