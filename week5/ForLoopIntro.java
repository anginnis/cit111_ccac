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
public class ForLoopIntro {
    public static void main(String[] args){
        
        //declare variable for controlling number of loops
        int loopControl;
        
        //create scanner
        Scanner userScanner = new Scanner(System.in);
        
        //prompt user
        System.out.println("How many loops shall I print with for()?");
        
        //grab int from user and store in loopControl
        loopControl = userScanner.nextInt();
        
        //create for() loop that initializes numloops to zero etc
        for(int numLoops = 0; numLoops <= loopControl;  numLoops = numLoops +1){
            //same contents for our loop body
            System.out.println("The value of numLoops: " + numLoops);
            
        }
    }
}
