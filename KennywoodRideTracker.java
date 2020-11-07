/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls3_classStructure;

import java.util.Random;

/**
 *
 * @author Greg
 */
public class KennywoodRideTracker {
    
    private static int totalRiders = 0;
    private static int totalFailedRiders = 0;
    private static int totalSickRiders = 0;
    
    final static int MIN_HEIGHT_THRILL = 55;
    final static int MIN_HEIGHT_THEME = 36;
    
    public static void main(String[] args) {
        System.out.println("Begin Ride Simulation");
        
        
        rideBlackWidow(randomRiders(), randomHeight());
        printRiderStats();
        
        rideMerryGoRound(randomRiders(), randomHeight());
        printRiderStats();
        
        rideBlackWidow(randomRiders(), randomHeight());
        printRiderStats();
        
        rideMerryGoRound(randomRiders(), randomHeight());
        printRiderStats();
        
    } //close main
    
     public static void rideBlackWidow(int riders, int avgHeight){
        if(avgHeight >= MIN_HEIGHT_THRILL){
            
            System.out.println("Riding Black Widow...");
            totalRiders = totalRiders + riders;
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders);
            totalSickRiders = totalSickRiders + numSickRiders;
            
        } else {
            System.out.println(riders + " riders turned away: too short!\n");
            totalFailedRiders = totalFailedRiders + riders;
        } // end if/else
        
    } // close rideBlackWidow()
    
    
    public static void rideMerryGoRound(int riders, int avgHeight){
        if(avgHeight >= MIN_HEIGHT_THEME){
            
            System.out.println("Riding Merry-Go-Round");
            totalRiders = totalRiders + riders;
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders);
            totalSickRiders = totalSickRiders + numSickRiders;
            
        } else {
            System.out.println(riders + " riders turned away: too short!\n");
            totalFailedRiders = totalFailedRiders + riders;
        } // end if/else
        
    } // close rideMerryGoRound
    
    public static void printRiderStats(){
        
        System.out.println("*******RIDER STATS*********");
        System.out.println("Total Riders: " + totalRiders);
        System.out.println("Total Failed Ride Attempts: " + totalFailedRiders);
        System.out.println("Total sick riders: " + totalSickRiders);
        System.out.println("***************************\n");
        
    } // close printRiderStats()
    
    public static int randomHeight(){
        Random rand = new Random();
        int avgHeight = rand.nextInt(72 - 10);
        return avgHeight;
    } // close randomHeight()
    
    public static int randomRiders(){
        Random rand = new Random();
        int riders = rand.nextInt(100 - 1);
        return riders;
    } //close randomRiders
}
