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
public class RideHeight {
    
    // entry point for the program
    public static void main(String[] args) {
        
        // height minimum
        final int MIN_HEIGHT_CM = 80;
        
        // integer type
        int riderHeight;
        
        // object scanner
        Scanner userInputScanner = new Scanner(System.in);
        
        // prompt
        System.out.println("Welcome to the Phantom Train ride! Enter your height in CM:");
        
        // scanner reading
        riderHeight = userInputScanner .nextInt();
        
        // comparison
        if(riderHeight < MIN_HEIGHT_CM){
            // if rider is too short
            System.out.println("Sorry shorty -- come back after doing some growing!");
        }
        
        else {
            // comparison if ok height
            System.out.println("Your height of "+ riderHeight +"cm means you can ride!");
        } //close


    } //close main method
    
}//close class RideHeight
