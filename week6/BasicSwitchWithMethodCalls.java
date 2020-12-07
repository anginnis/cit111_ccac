/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;
import java.math.BigInteger;
import java.util.Random;
/**
 *
 * @author Alyssa
 */
public class BasicSwitchWithMethodCalls {
    public static void main(String[] args){
        
        //scanner object creation
        Scanner keyboardScanner = new Scanner(System.in);
        //create user variable
        int userInput;
        
        System.out.println("Howdy. You got some options here!");
        System.out.println("1 - Choose this for a nice message.");
        System.out.println("2 - Choose this for a really big random number.");
        System.out.println("3 - Byes!");
        
        //read end-user input
        userInput = keyboardScanner.nextInt();
        
        //case selections
        switch(userInput){
            case 1:
                printStatement();
                break;
                
            case 2:
                generateBigNumber();
                break;
                
            case 3:
                break;
                
            default:
                System.out.println("Not a valid entry. Please try again later.");
                
        }//close switch
    }//close main
        
    public static void printStatement(){
        
        //quote
        System.out.println("No one is perfect - that’s why pencils have erasers.");}
    
    public static void generateBigNumber(){
        
        //random number generator
        Random r = new Random();
        
        //creating an object to do math w huge numbers
        BigInteger bigInt = new BigInteger(100, r);
        
        //display the randomly generated huge number
        System.out.println(bigInt);
    }
}        
        