/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects1;

/**
 *
 * @author Greg
 */
public class DonutLand_Refactored {
    
    final static int nibble = 7;
    final static int megaBite = 43;
    
    
    public static void main(String[] args) {
        
        // create a handle variable taht can store references to Donut objects
        Donut firstDonut;
        // create a new Donut (an instance of the Donut Class) and connect this
        // new object to our handle variable firstDonut
        firstDonut = new Donut();
        
        // access firstDonut's name property, which is type String, and
        // store the name "Michelle" in this particular Donut object's memory bin
        firstDonut.name = "Michelle";
        
        // print a test of Michelle's member variable values
        printObjectData(firstDonut);
        
        Donut secondDonut = new Donut();
        secondDonut.name = "Colin";
        
        printObjectData(secondDonut);
        
        System.out.println("Eating " + firstDonut.name);
        firstDonut.simulateEating(nibble);
        System.out.println("Nibble...");
        firstDonut.simulateEating(nibble);
        System.out.println("Nibble....");
        System.out.println("Taking a megaBite...");
        secondDonut.simulateEating(megaBite);
        printObjectData(firstDonut);
        
        System.out.println("Eating " + secondDonut.name);
        System.out.println("Taking lots of megaBites");
        int numCalls = 10;
        for(int i = 0; i < numCalls; i++){
            System.out.println("nom nom");
            secondDonut.simulateEating(megaBite);
        }
        printObjectData(secondDonut);
        
        
      
        
    } // close main
    
    private static void printDivider(){
        System.out.println(".........................................");
    }
    
    private static void printObjectData(Donut inputDonut){
        System.out.println("|-------STATS--------|");
        System.out.println("| Name: " + inputDonut.name);
        System.out.println("| PercRemaining: " + inputDonut.getPercRemaining());
        System.out.println("|--------------------|");
    } // close printObjectData method

} // close class
