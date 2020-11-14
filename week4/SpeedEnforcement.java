/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author Alyssa
 */
public class SpeedEnforcement {
    
    public static void main(String[] args){
    
    // speed values
    final int MIN_SPEED = 45;
    final int MAX_SPEED = 55;
    
    // variable
    int vehicleSpeed;
    
    // scanner object
    Scanner userInputScanner = new Scanner(System.in);
    
    // user prompt
    System.out.println("Please enter vehicle speed in MPH and press enter");
    
    // read int
    vehicleSpeed = userInputScanner.nextInt();
    
    //  if else if
    if(vehicleSpeed < MIN_SPEED){
        System.out.println("Vehicle is moving too slow");}
    
    else if (vehicleSpeed > MAX_SPEED){
        System.out.println("Vehicle is moving too fast");}
    
    else {
        System.out.println("Car is within speed range");
    }
    // close if else
    
} // close main method
} //close class