/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import java.util.Scanner;



/**
 *
 * @author Greg
 */
public class GeometricShapes {
    public static void main(String[] args) {
        //initialize scanner
        Scanner userScanner = new Scanner(System.in);
        
        //gather parameters
        System.out.println("Enter the side length of the cube to calculate its volume: ");
        double userSideLength = userScanner.nextDouble();
        
        // call calcVolumeofCube Here
        double returnedVolume = calcVolumeOfCube(userSideLength);
        
        // print results for Cube
        System.out.println("The volume of a cube with side length " + userSideLength +
                " is " + returnedVolume);
        System.out.println("---------------------------------------------------");
        
        //gather parameters for cylinder
        System.out.println("Enter the radius of the cylinder:");
        double userRadius = userScanner.nextDouble();
        System.out.println("Enter the height of the cylinder");
        double userHeight = userScanner.nextDouble();
        
        // call calcVolumeofCylinder() with user input radius/height
        double returnedCylVolume = calcVolumeOfCylinder(userRadius, userHeight);
        
        //print results for cylinder
        System.out.println("The volume of a cylinder with radius " + userRadius +
                "\nand height " + userHeight + " is " + returnedCylVolume);
        System.out.println("---------------------------------------------------");
         
        //gather parameters for cone
        System.out.println("Enter the radius of the base of the cone:");
        double userRadiusCone = userScanner.nextDouble();
        System.out.println("Enter the height of the cone:");
        double userHeightCone = userScanner.nextDouble();
        
        //call calcVolumeOfCone() with user input radius/height
        double returnedConeVolume = calcVolumeOfCone(userRadiusCone, userHeightCone);
        //print results for cone
        System.out.println("The volume of a cone with base radius " + userRadiusCone 
                + "\nand height " +userHeightCone + " is " + returnedConeVolume);
        
        //gather parameters for temp
        System.out.println("Enter the temperature you want converted from fahrenheit:");
        double userTemp = userScanner.nextDouble();
        
        //call convertTemp
        double convertedTemp = convertTemp(userTemp);
        
        //print results for Temp
        System.out.println("The temperature " + userTemp 
                + " in fahrenheit is converted to " + convertedTemp + " in celsius." );
        
        //gather parameters for miles
        System.out.println("Enter the amount of miles you want converted to kilometers:");
        double userMiles = userScanner.nextDouble();
        
        //call convertMiles() with user input
        double convertedMiles = convertMiles(userMiles);
        
        //print results for Miles
        System.out.println(userMiles + " is converted to " + convertedMiles +
                " in kilometers.");
        
        //gather parameters for square miles
        System.out.println("Enter the amount of acres you want converted to square miles:");
        double userAcres = userScanner.nextDouble();
        
        //call convertAcres() with user input
        double convertedSqMiles = convertAcres(userAcres);
        
        //print results for Acres
        System.out.println(userAcres + " is converted to " + convertedSqMiles +
                " in square miles");
    }
    
    public static double calcVolumeOfCube(double sideLength){
        // raise side length to 3 and return the result
        double cubeVolume = Math.pow(sideLength, 3);
        return cubeVolume;
    } // close calcVolumeofCube()
    
    public static double calcVolumeOfCylinder (double radius, double height){
        final double PI = 3.1416;
        //implement cylinder formula
        double cylVol = PI * (radius * radius) * height;
        //send volume back
        return cylVol;
    } // close calcVolumeOfCylinder
    
    public static double calcVolumeOfCone (double radius, double height){
        final double PI = 3.1416;
        //implement cone formula
        double area = PI * (radius * radius);
        double coneVol = (area * height)/3;
        //send volume back
        return coneVol;
    } // close calcVolumeOfCone
    
    public static double convertTemp(double fahrenheit){
        //implement forumula
        double celsius = (fahrenheit - 32) * 5 / 9; 
        //send temp back
        return celsius;
    } // close convertTemp
    
    public static double convertMiles(double miles){
        //implement formula
        double kilometers = miles * 1.609344;
        //send miles back
        return kilometers;
    } // close convertMiles
    
    public static double convertAcres(double acres){
        //implement formula
        double sqMiles = acres * 0.0015625;
        // send sq miles back
        return sqMiles;
    }
} // close main
