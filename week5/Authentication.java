/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;
/**
 *
 * @author Alyssa
 */
public class Authentication {
    
       private final static String PASSWORD = "serpounce";
    private final static String SECRET = "Do or do not. There is no try. - Master Yoda";
    private final static int NUM_ATTEMPTS = 5;
    
    public static void main(String[] args){
        
        //welcome
        System.out.println("Welcome! Please enter in the password.");
        
        //scann obj
        Scanner scanner = new Scanner(System.in);
        
        //attempts int
        int attempts = 0;
        
        while(attempts < NUM_ATTEMPTS){
            String userPassword = scanner.next();
            
            if(userPassword.equals(PASSWORD)){
                System.out.println("Access granted! Here's some special life advice: " + SECRET);
                System.out.println("Thank you for participating!");
                
                // break;
                break;
                
                
            } else {
                System.out.println("Wrong password. Please try again.");
                
                //attempts notification
                attempts = attempts + 1;
                System.out.println("Number of attempts: " + attempts);
                System.out.println("Number of remaining attempts: " + NUM_ATTEMPTS);
                
             //maxed attempts        
             if(attempts == NUM_ATTEMPTS){
                 System.out.println("Maximum attempts reached. Please try again later.");   
                    
                    
                } 
            } 
        } 
    }}