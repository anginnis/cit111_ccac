/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
import java.util.Scanner;
/**
 *
 * @author Alyssa
 */
//I did not necessairly copy directly from source code but DID make proper adjustments to my existing code

public class PurchaseCalculator {
    
    public static void main(String[] args){
        
        final double ITEM_PRICE = 100;
        double discount = 0.15;
        double purchaseLimit;
        
        //scanner object
        Scanner s = new Scanner(System.in);
        
        System.out.println("Hard-coded price value: $" + ITEM_PRICE);
        System.out.println("Enter your purcahse limit and press enter: ");
        
        purchaseLimit = s.nextDouble();
        
        //displays
        displayPriceWithTax(ITEM_PRICE);
        computePriceAfterDiscount(ITEM_PRICE, discount);
        displayPurchaseableNumber(ITEM_PRICE, purchaseLimit);
    }
    
    public static void displayPriceWithTax(double price){
        
        final double TAX_RATE = 0.075;
        //computer price + tax
        double totalPrice = price * (1 + TAX_RATE);
        System.out.println("Total price with tax: $" + totalPrice );
    }

    public static void computePriceAfterDiscount(double price, double discount){
        double finalPrice = price - (price * discount);
        System.out.println("Price after discount: $" + finalPrice);
    }

    public static void displayPurchaseableNumber(double price, double limit){
        int numPurchasable = (int) Math.floor(limit / price);
        System.out.println("Since you have $" + limit +", you can purchase " + numPurchasable + " items" );



}
}