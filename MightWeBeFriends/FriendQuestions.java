/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MightWeBeFriends;

import java.util.Scanner;
/**
 *
 * @author Alyssa
 */
public class FriendQuestions {
    public static void main(String[] args){
        
        
       //variables
       int rMusic;
       int rPizza;
       int rCats;
       int rReading;
       int rTravel;
       
       //scanner object
       Scanner userInputScanner = new Scanner(System.in);
       
       //base score
       int totalScore = 0;
       
        //welcome
        System.out.println("Could we be friends? Play along to find out!");
        System.out.println("Answer questions with a '1' for 'yes' or a '0' for 'no'. Let's get started!");
        System.out.println("********************************************");
        
        //question1
        System.out.println("Do you like music?");
        //answer1
        rMusic = userInputScanner.nextInt();
          if(rMusic == 1){
            totalScore = totalScore + 1;
            System.out.println("Awesome! Who doesn't love music?");
            System.out.println("********************************************");}
            
        else{
            System.out.println("That's a little odd. Let's continue.");
            System.out.println("********************************************");}
                
        //question2
        System.out.println("Do you like pizza?");
        //answer2
        rPizza = userInputScanner.nextInt();
          if(rPizza == 1){
            totalScore = totalScore + 1;
            System.out.println("Pizza is my favorite food! What about you?");
            System.out.println("********************************************");}
            
        else{
            System.out.println("Different stroke for different folks I guess!");
            System.out.println("********************************************");}

         //question3
        System.out.println("Do you prefer cats over dogs?");
        //answer3
        rCats = userInputScanner.nextInt();
          if(rCats == 1){
            totalScore = totalScore + 1;
            System.out.println("Cats are my favorite. I have two of my own!");
            System.out.println("********************************************");}
          
          else{
            System.out.println("Don't worry, dogs are equally great!");
            System.out.println("********************************************");}
       
         //question4
        System.out.println("Do you like to read?");
        //answer4
        rReading = userInputScanner.nextInt();
          if(rReading == 1){
            totalScore = totalScore + 1;
            System.out.println("Yay! Reading is good for the soul.");
            System.out.println("********************************************");}
            
        else{
            System.out.println("Stop what you're doing and go read a book!");
            System.out.println("********************************************");}
          
         //question5
        System.out.println("Do you like to travel?");
        //answer5
        rTravel = userInputScanner.nextInt();
          if(rTravel == 1){
            totalScore = totalScore + 1;
            System.out.println("Me too! Where is your favorite place to travel to?");
            System.out.println("********************************************");}
            
        else{
            System.out.println("Sometimes our own backyards can be our biggest adventure!"
                    + "");
            System.out.println("********************************************");}
          
         //end questions
         
         //score calculations to see if we could be friend!
         if(totalScore >= 3){
             System.out.println("Yay! By my calculations, I think we could be friends!");}
             
         else {
              System.out.println("The results are in, and it doesn't look like we have much in common. Sadface. :( ");
                     }
         
         
         } //closemain
    }//close class

        
        
        
        
    
