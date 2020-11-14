/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Random;
/**
 *
 * @author Alyssa
 */
public class Playground {
    public static void main(String[] args){
        
       final int UPPER_END_OF_RANGE = 100;
       
       Random randGenerator = new Random();
       //generate the random number with a call to nextInt()
       //store the random number in randNum
       
       int randNum = randGenerator.nextInt(UPPER_END_OF_RANGE);
       
       System.out.println("Random number: " + randNum);
    }
}
