/*
 *Simple program to calculate conversions from oz to g, lbs to kgs, and ft to meters
 */
package week7;

import java.util.Scanner;
/**
 *
 * @author Alyssa
 */
public class UnitConverter {
    
    public static void main(String[] args){
        
        //create scanner
        Scanner s = new Scanner(System.in);
        
        //welcome
        System.out.println("Let's do some conversions!");
        System.out.println("**************************");
        
        /////////////////////////
        //ounces to grams
        System.out.println("Enter the number of ounces (oz) you would like to convert to grams (g).");
        double inputOZ = s.nextDouble();
        double toGrams = ozToGrams (inputOZ);
        
        //oz to g result
        System.out.println(inputOZ + " ounces converts to " + toGrams + " grams");
        //////////////////////////
        
        System.out.println("**************************");
        
        /////////////////////////
        //lbs to kg
        System.out.println("Enter the number of pounds (lbs) you would like to convert to kilograms (kg).");
        double inputLBS;
        inputLBS = s.nextInt();
        double lbsToKg = lbsToKilograms (inputLBS);
        
        //lbs to kg result
        System.out.println(inputLBS + " pounds converts to " + lbsToKg + " kilograms");
        //////////////////////////
        
        System.out.println("**************************");
        
        /////////////////////////
        //ft to meters
        System.out.println("Enter the number of feet (ft) you would like to convert to meters (m).");
        double inputFT;
        inputFT = s.nextInt();
        double feetToM = feetToMeters (inputFT);
        
        //lbs to kg result
        System.out.println(inputFT + " feet converts to " + feetToM + " meters");
        //////////////////////////
        
        System.out.println("**************************");
        System.out.println("Thank you for converting some numbers. Have an awesome day!");

    }
    
    public static double ozToGrams(double inputOZ){ 
        final double CONVERSION_ONE = 28.35;
        double ozToG = inputOZ * CONVERSION_ONE;
        return ozToG;    
    }

    
    public static double lbsToKilograms(double inputLBS){ 
        final double CONVERSION_TWO = 2.205;
        double lbsToKg = inputLBS / CONVERSION_TWO;
        return lbsToKg;
    
    }

    public static double feetToMeters(double inputFT){ 
        final double CONVERSION_THREE = 3.281;
        double feetToM = inputFT / CONVERSION_THREE;
        return feetToM;
    
    }
}