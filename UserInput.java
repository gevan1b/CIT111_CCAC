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

public class UserInput {
  public static void main(String[] args) {
    // this is a final variable to store the tax rate
    final double SALES_TAX = 0.07;

    // declare double-type variables
    double salePrice;
    double priceWithTax;

    // create a Scanner object using the imported Class library
    Scanner userInputScanner = new Scanner(System.in);

    // prompt the user
    System.out.println("Enter the sale price and press enter: ");
    // use the Scanner object to read a double value from the console
    salePrice= userInputScanner.nextDouble();
    // add the tax amount to original sale amount
    priceWithTax = salePrice * (1 + SALES_TAX);
    // print out results of the calculation to the console
    System.out.println("Your item price + 7% tax: $" + priceWithTax);


  } // close main() method
} // close class UserInput