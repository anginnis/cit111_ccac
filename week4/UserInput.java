
package week4;

import java.util.Scanner;
/**
 * Demonstrates the functionality of a Scanner object and how to use it to gather input from the user
 * @author Alyssa
 */
public class UserInput {
    public static void main(String[] args){
        // this is a "final variable" to store the tax rate
        final double SALES_TAX = 0.07;
        
        // declare double-type variables
        double salePrice;
        double priceWithTax;
        
        // create a Scanner object using the imported Class library
        Scanner userInputScanner = new Scanner(System.in);
        
        // prompt the user
        System.out.println("Enter the sale price (no $) and press enter:");
        // use the scanner object to read a double value from the consolea
        salePrice = userInputScanner.nextDouble();
        // add the tax amount to the original sale amount
        priceWithTax = salePrice * (1 + SALES_TAX);
        // print out results of the calculation to the console
        System.out.println("Your item price + 7% tax: $" + priceWithTax);
        
    } // close main method
    
} // close class UserInput
