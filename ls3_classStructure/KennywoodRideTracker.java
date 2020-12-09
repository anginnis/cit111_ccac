/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls3_classStructure;

import java.util.Random;
/**
 *
 * @author Alyssa
 */
public class KennywoodRideTracker {
    
    private static int totalRiders = 0;
    private static int totalFailedRideAttempts = 0;
    private static int totalSickRiders = 0;
    
    //constant values
    private static int THRILL_HEIGHT = 60;
    private static int THEME_HEIGHT = 50;
    
    public static void main (String[] args){
        System.out.println("Begin ride tracker");
        
        rideBlackWidow (8, 28);
        printRiderStats();
        rideBlackWidow (15, 89);
        printRiderStats();
        rideBlackWidow(30, 33);
        
        rideMerryGoRound(5, 42);
        printRiderStats();
        rideMerryGoRound(15, 40);
        printRiderStats();
        rideMerryGoRound(45, 66);
        
          

    }
    
    public static void rideBlackWidow(int riders, int avgHeight){
        if(avgHeight >= THRILL_HEIGHT){
            
            System.out.println("Riding the Black Widow...");
            System.out.println("OH NO, I JUST REMEMBERED I HATE SPIDERS");
            totalRiders = totalRiders + riders;
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders);
            totalSickRiders = totalSickRiders + numSickRiders;}
            
        else {
            System.out.println(riders + " turned away because they were too short!");
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
        }
      }  
    
    
    public static void rideMerryGoRound(int riders, int avgHeight){
        if(avgHeight >= THEME_HEIGHT){
            
            System.out.println("Riding Merry-Go-Round...");
            System.out.println("Round and round and round and round again");
            totalRiders = totalRiders + riders;
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders);
            totalSickRiders = totalSickRiders + numSickRiders;}
            
        else {
            System.out.println(riders + " turned away because they were too short!");
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
        }
        
    }
    public static void printRiderStats(){
        System.out.println("**********RIDER STATS**********");
        System.out.println("Total riders: " + totalRiders);
        System.out.println("Total failed ride attempts: " + totalFailedRideAttempts);
        System.out.println("Total sick riders: " + totalSickRiders);
        System.out.println("********************************");
        
        
    }
}
