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
public class EnoughGas {
    public static void main(String[] args){
        
        double gasLeft;
        double nextStation;
        
        Scanner userInputScanner = new Scanner(System.in);
        
        //question
        System.out.println("How many gallons of gas remain in your car?");   
        //answer
        gasLeft = userInputScanner.nextDouble();
        
        //question2
        System.out.println("How many miles away is the next gas station?");
        //answer2
        nextStation = userInputScanner.nextDouble();
        
        //caluclations
        double distance = (gasLeft * 28);
        
        //can the driver make it?
        if(distance < nextStation){
            System.out.println("Sorry, you're stranded bud!");
        }else{
            System.out.println("Whew! You know how to plan. You're able to make it to the next station!");
            
            
        }
        
    }//close main   
    
}//close class