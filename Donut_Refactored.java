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
public class Donut_Refactored {
    
    // member variables
    private int percRemaining = 100;
    public String name;
    
    //method: takes in an integer representing the size of bite
    // being taken of this donut. returns nothing
    public void simulateEating(int percentEaten){
        System.out.println("Inside simulateEating method");
        // subtract te bite size from the existing donut percent remaining
        percRemaining = percRemaining - percentEaten;
    } //close method
    
    // method: takes no input parameters and returns percRemaining
    public int getPercRemaining(){
        System.out.println("Inside getPercRemaining method");
        //very simple guts: just send back the value of one of the object's
        //member variables to the calling method. this is called a getter
        return percRemaining;
    } // close getPercRemaining()
    
    // there is no main method in this class
    // we must make this object with the new keyword inside another class
    // in order for this class to do anything
}
