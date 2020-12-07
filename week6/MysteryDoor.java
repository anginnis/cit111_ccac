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
public class MysteryDoor {
    public static void main(String[] args){
        
        //welcone
        System.out.println("Come one, come all! Welcome to the Mystery Doors!");
        System.out.println("Choose a door to unlock an ancient secret guarenteed to change your life!");
        System.out.println("Or...something totally useless. The choice is yours and yours alone!");
        
        //fancy ascii (sorta) doors
        System.out.println("*****    *****    *****");
        System.out.println("*   *    *   *    *   *");
        System.out.println("* 1 *    * 2 *    * 3 *");
        System.out.println("*   *    *   *    *   *");
        System.out.println("*****    *****    *****");
    
         //scanner objects creation
        Scanner keyboardScanner = new Scanner(System.in);
        Scanner mult = new Scanner(System.in);
        
        //create user variable
        int userChoice;
        
        //read end-user input
        userChoice = keyboardScanner.nextInt();
        
        //case selections
        switch(userChoice){
            case 1:
                System.out.println("Congratulations! You have selected the door that gives secret knowledge.");
                System.out.println("Prepare to have your mind BLOWN!");
                System.out.println("********************************************************************************");
                System.out.println("OxiClean unleashes the power of oxygen without fading or bleeding the colors of your laundry!");
                break;
                
            case 2:
                System.out.println("Es tut mir leid, aber Falsche Tür. No fun secrets for you.");
                break;
                
            case 3:
                System.out.println("Please enter a random number.");
                timesTwo();
                break;
                
            default:
                System.out.println("Not a valid entry. Please try again.");
                
        }//close switch
    }//close main
    
    public static void timesTwo(){
        
        //scanner object
        Scanner mult = new Scanner(System.in);
        
        //variable
        int numberInput;
        
        //variable
        numberInput = mult.nextInt();
        int xxTwo = (numberInput * 2);

        //comment
        System.out.println("Congratulations. The number you have chosen, times two, is " + xxTwo +"!");
       
        }//close switch
    }//close main
    
 

