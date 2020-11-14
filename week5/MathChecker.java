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
public class MathChecker {
    public static void main(String [] args){

        //define int
        final int maxAttempts = 3;
        final int correct = 0;
        
        int answer;
        int attemptCount = 0;
        
        System.out.println("Math Check!");
        
        //create scanner
        Scanner userInputScanner = new Scanner(System.in);
         
        while(attemptCount < maxAttempts){
            
            //problem
            System.out.println("Please solve-> (5 * 10) * 0");
            //input
            answer = userInputScanner.nextInt();
            
            if(answer == correct){
                System.out.println("Great job! That is correct!");
                
                break;
                
            }else if(answer > correct){
                System.out.println("Sorry, that is incorrect.");
                System.out.println("Your answer is too high!");
                
                attemptCount = attemptCount + 1;
                System.out.println("Attempt " + attemptCount + " out of " + maxAttempts);
                System.out.println("----------------");

            }else if(answer < correct){
                System.out.println("Sorry, that is incorrect.");
                System.out.println("Answer is too low!");
                
                attemptCount = attemptCount + 1;
                System.out.println("Attempt " + attemptCount + " out of " + maxAttempts);
                System.out.println("----------------");
                
            }
            
         
        }
        System.out.println("The solution is: 0 ----    " +
                "5*10 = 50 * 0 = 0");
       
    }}