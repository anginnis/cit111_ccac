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
public class UsernameAndPassword {
    public static void main(String[] args){
        
        // set values
        final String CORRECT_NAME = "javaghost";
        final String CORRECT_PASS = "ic0d3";
        
        // scanner object
        Scanner userInputScanner = new Scanner(System.in);
        
        //stored variables
        String enterUsername;
        String enterPassword;
        
        //prompt username and password
        System.out.println("Enter your username and press enter");
        enterUsername = userInputScanner.next();
        
        System.out.println("Enter your password and press enter");
        enterPassword = userInputScanner.next();
        
        //check credentials
        if (enterUsername.equals(CORRECT_NAME) && enterPassword.equals(CORRECT_PASS)){
            System.out.println("Success! You have logged into absolutely nothing!");}
        
        //failed credentials
        else {
            System.out.println("Authentication failed");
        } //end if else
            
        } //close main method
        
        
    } //close class

