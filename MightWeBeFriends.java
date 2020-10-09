/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;

/**
 * Program purpose is to ask series of questions to determine 
 * the compatibility of the user to me.
 * @author Greg
 */
public class MightWeBeFriends {
    public static void main(String[] args) {
        
        // declare variables
        int responseVG;
        int responseMusic;
        int responseMovies;
        int responseFood;
        int responseTravel;
        // intialize scanner
        Scanner userScanner = new Scanner(System.in);
        // compatiblity score determined by users input
        int compScore = 0;
        
        //Intro to program
        System.out.println("Welcome to the Friend Compatability Quiz");
        System.out.println("******************************************");
        
        //VG Q start
        System.out.println("Do you enjoy playing video games? (0 = no, 1 = yes)");
        responseVG = userScanner.nextInt();
        
        // response captured, implement decision logic
        
        if(responseVG == 1){
            compScore = compScore + 30;
            System.out.println("Awesome! It's always been a hobby of mine.");
        } else {
            compScore = compScore - 10;
            System.out.println("That's alright, this isn't something to base your personality around");
        } // close if/else() VG
        
        System.out.println("******************************************");
        
        //Music Q start
        System.out.println("Do you enjoy listening to music? (0 = no, 1 = yes)");
        responseMusic = userScanner.nextInt();
        
        if(responseMusic == 1) {
            compScore = compScore + 25;
            System.out.println("Music is a major passion of mine!" + 
                    " I've also been a musician for 17 years.");
        } else {
            compScore = compScore - 20;
            System.out.println("While not a deal breaker, I'm very surprised to say the least.");
        } // close if/else() MUSIC
        
        System.out.println("******************************************");
        
        //Movie Q start
        System.out.println("Do you miss going to the movies? (0 = no, 1 = yes)");
        responseMovies = userScanner.nextInt();
        
        if(responseMovies == 1) {
            compScore = compScore - 10;
            System.out.println("I love going to the movies with friends," +
                    " it's one of the things I miss doing most.");
        } else { 
            compScore = compScore - 5;
            System.out.println("Ah, yeah some people don't like the dark and big crowds," 
                    + " it's understandable.");
        } // close if/else() MOVIES
        
        System.out.println("******************************************");
                
        //Food Q start
        System.out.println("Do you miss going out to eat at restaurants? (0 = no, 1 = yes)");
        responseFood = userScanner.nextInt();
        
        if(responseFood == 1){
            compScore = compScore + 20;
            System.out.println("Going out to eat was great," + ""
                    + " I loved trying out new places with friends");
        } else {
            compScore = compScore - 10;
            System.out.println("Whaaaaaat, who doesn't like to try new food!");
        } // close if/else() FOOD
        
        System.out.println("******************************************");
        
        //Travel Q start
        System.out.println("Do you enjoy traveling to different places? (0 = no, 1 = yes)");
        responseTravel = userScanner.nextInt();
        
        if(responseTravel == 1){
            compScore = compScore + 15;
            System.out.println("Exactly! Traveling is a fantastic way to experience new things.");
        } else {
            compScore = compScore - 10;
            System.out.println("I can't say I don't enjoy hanging out at home, that's for sure.");
        } // close if/else() TRAVEL
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("******************************************");
        System.out.println("     ~~~FINAL FRIEND DETERMINATION~~~");
        System.out.println("******************************************");
        System.out.println("");
        
        // final compatibility score
        if(compScore > 70){
            System.out.println("Great, I think we might be able to be friends!");
        } else {
            System.out.println("According to my decision tree," + 
                    " I don't think we make compatible friends");
        } // close if/else() FINAL
        
        System.out.println("******************************************");
        
    } // close main
} // close class
