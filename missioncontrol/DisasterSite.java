/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missioncontrol;

import java.util.Random;
/**
 *
 * @author Alyssa
 */
public class DisasterSite {
    
    private int numTotalVictims;
    private int numRescuedvictims;
    
    final int MAX_VICTIMS = 100;
    
    //constructor for the DisasterSite object -- this gets called when we
    //use the keyword "new" to create an instance of this object
    
    public DisasterSite(){
        
        Random random = new Random();
        
        //load up the site with a random number of victims
        numTotalVictims = random.nextInt (MAX_VICTIMS +1);
        numRescuedvictims = 0;
}//close constructor
    
    //simulates a rescue of a number of victims from the disastersite
    //@param team a rescue team object
    //@retun the number of victims rescued
    
    public int makeRescueAttempt(RescueTeam team){
        //calculate the remaining victims from the member variable values
        int remainingVictims = numTotalVictims - numRescuedvictims;
        int numRescued;
        Random random = new Random();
        
       
        int couldBeRescued = random.nextInt(team.getTeamSize () + 1);
        
        //we can't rescue more victims than are on site
        if (couldBeRescued <= remainingVictims){
            numRescued = couldBeRescued;}

        else {
            //if the random # of rescued victims based on this attempt
            
            //ship back the # that were rescued
            numRescued = remainingVictims;
        }//close method
        
                    numRescuedvictims = numRescuedvictims + 1;
                    return numRescued;

        
        //accessor method for our current victim count
        //@retun the # of victims remaining on site
    
        public int getCurrentVictimCount(){
            return (numTotalVictims - numRescuedvictims);
            
        }
        
        //method to develop
        
        public void siteAccident(){
            numTotalVictims = numTotalVictims + 0;}
        }
            
 
    }

