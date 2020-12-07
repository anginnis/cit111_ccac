/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.math.BigInteger;
import java.util.Random;
/**
 *
 * @author Alyssa
 */
public class SimpleMethod {
    public static void main(String[] args){
        
        System.out.println("This code is inside a method: main");
        
        //call the mentho printStatement, transferring execution to that block
        printStatement();
        
        System.out.println("...back in main");
        
        //call the same method again
        printStatement();
        
    } //close main method
    
    //illustration method that takes no parameters and returns nothing to the caller
    public static void printStatement(){
        System.out.println("*****INSIDE printStatement*****");
        System.out.println("Statement: where's there a will, there's a way");
        System.out.println("******************************");
        
        generateBigNumber();
    } //close method printSpecialStatement
    
    public static void generateBigNumber(){
        
        //creating a random number generator!
        Random r = new Random();
        //creating an object to do math w huge numbers
        BigInteger bigInt = new BigInteger(100, r);
        //display the randomly generated huge number
        System.out.println(bigInt);
        System.out.println("*********************************");
    
} //close class
}