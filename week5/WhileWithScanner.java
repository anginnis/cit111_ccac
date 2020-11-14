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
public class WhileWithScanner {
    public static void main(String[] args){
        int numLoops = 0;
        int loopControl;
        
        //build a scanner object
        Scanner scanner = new Scanner(System.in);
        
         //prompt user and get an int from them
         System.out.println("How many loops shall I print?");
         loopControl = scanner.nextInt();
         
         //loop as long as numLoops is less than or equal to our loop control
         //which was gathered from the user
         while(numLoops <= loopControl){
             System.out.println("The value of numLoops: " + numLoops);
             
             //add one to numLoops each time we cycyle so we only
             //loop the number of times the user inputed
             numLoops = numLoops + 1;
         } //clo
        
        
        while(numLoops < 11){
            System.out.println("The value of numLoops: " + numLoops);
            numLoops = numLoops + 1;
        } // close while
    
     System.out.println("...After the while loop");
    
    }
}
                
    
        
    

