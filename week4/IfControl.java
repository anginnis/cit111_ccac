package week4;

import java.util.Scanner;
        
        
/** 
 * Compares a user-entered value against a pre-set purchase limit to model a banking training program for you to learn to manage money
 * @author Alyssa
 */
public class IfControl {
    // this is the entry point for our program
    
    public static void main(String[] args){
        
        //create a purchase limit as a final variable since it won't change
        final double PURCHASE_LIMIT = 200.00;
        
        // declare a double-type variable to store the user's purchase amount
        double purchaseAmount;
        
        //create a scanner object to get values from the keyboard
        Scanner userInputScanner = new Scanner(System.in);
        
        // prompt the user for a purchase amount
        System.out.println("Enter the anount of purchase (no $) and press enter:");
        
        //read whatever the user typed on the keyboard into the variable purchaseAmount
        purchaseAmount = userInputScanner.nextDouble();
        
        // compare the user-entered putschase amount against the purchase limit
        if(purchaseAmount > PURCHASE_LIMIT){
            // code to run if the comparison evaluates to true (purchase is too high)
            System.out.println("Ah Ah ah -- that's too expensive! Buy something else!");}
        
        else {
            // code to run if the comparison evaluates to false
            System.out.println("Okay, you can purchase this item for:" + purchaseAmount); 
            
        } //close if/else block
    } // close main method
} //close class IfControl
