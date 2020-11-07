/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

/**
 *
 * @author Greg
 */
public class ScopeBasics {
    /*
    * our first member variable: this named chunk of data can be read from abd
    * written to ANY code in this class -- meaning any method!
    */
    private static String classScopedVar = "All methods can access me!";
    
    /**
     * This method demonstrates which variable can be 
     * accessed in its local scope: only class-scoped variables and its own
     * local variables called localScope 2
     */
    
    public static void demonstrateScope(){
        System.out.println("Inside demonstrateScope");
        // declaaration and initialization of a local variable to demonstrateScope
        String localScope2 = "I'm local to demonstrateScope";
        boolean localScope1 = false;
        
        System.out.println(localScope1);
        /**
         * localSCope1 was declared in main and cannot be accessed by any other
         * method
         */
        System.out.println(classScopedVar);
        System.out.println(localScope2);
        
        // any method can change a class-scoped variable's value
        classScopedVar = "I can be changed in any method.";
    } // close demonstrateSCope
    
    /**
     * Remember: thje main method can be located anywhere you want 
     * method order within a class doesn't affect the execution of the code
     * @param args 
     */
    public static void main(String[] args) {
        System.out.println("Inside Main");
        // declaration and initilization  of a local variable to main
        String localScope1= "I'm loval to main";
       
        
        System.out.println(localScope1);
        System.out.println(classScopedVar);
        boolean localScope2 = false;
        System.out.println(localScope2);
         /**
         * localSCope 2 is only accessible in the method in which it is declared
         * which is demonstrateScope()
         */
        
        
        // call a method that will test variable scope concepts
        demonstrateScope();
    } // close main
} // close class
