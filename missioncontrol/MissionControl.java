/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missioncontrol;

import java.util.Scanner;
/**
 *
 * @author Alyssa
 */
public class MissionControl {
    
    //total personnel available for deployment
    final int totalStaff = 10;
    
    //the DisasterSite object is stored in a member variable
    //so all methods in MissionControl can access it
    private static DisasterSite mainSite;
    
    //program entry point -- create disasterSite and
    //transfers control to the commander
    
    public static void main(String[] args){
        //create DisasterSite object and store it in a class memeber variable
        mainSite = new DisasterSite();
        
        //transfer execution control to this method
        commanderControl();
    }//close main
    
    //utility class for writing notices to the console
    //uses a sleep method to simulate the communication process
    //@param event the text about the event to be logged
    
    public static void logEvent (String event){
        //spacing only
        System.out.println("");
        
        //we need this try/catch thing for reasons we don't understand yet
        try {
            //wait 1 sec
            Thread.sleep(1000);
            
            //print out whatever string was passed into the method
            System.out.println("log entry " + event);
            Thread.sleep(1000);
        }
        
        catch (InterruptedException ex){
            System.out.println(ex.toString());
        }//close try/catch
        System.out.println("");
        
        } //close method
    
    //cordinates all disaster recovery related events
    
    public static void commanderControl(){
        //stores user action for switch statement control
        int action = 0;
        
        //allow the commander to act until the exit signal is passed in
        while (action != -1){
            //transfer control to a method for gathering a single int
            //from the commander user and passing it back into this method
            action = getCommanderAction();
            
            //the commander's choice is now process by the switch statement
            //if the user enters 1, then case 1 is executed
            switch (action){
                //write current victims to the log
                case 1 int result =
                        mainSite.numTotalVictims - mainSite.numRescuedVictims;
                        logEvent ("Current Victims " + String.valueOf(result));
                        break;
                        
                //assemble and dispatch crew
                case 2: dispatchCrew();
                        break;
            } //end switch
        }//end while
    }//close method
    
    //utility method for gathering user input i.e. the commander actions
    //prints out the options for an action and prepares it for return
    //@ retun the user's selection
    
    public static int getCommanderAction(){
        System.out.println("**********************************");
        System.out.println("MISSION CONTROL: COMMANDER ACTIONS:");
        System.out.println("**********************************");
        System.out.println("1. Write current victim count to the log");
        System.out.println("2. Assemble and displatch rescue team");
        System.out.println("3. Check mission status");
        System.out.println("-1. Exit program");
        System.out.println("**********************************");
        System.out.println("Enter desired action number: ");
        Scanner scanner = new Scanner(System.in);
        
        //get input from the user
        int commanderChoice = scanner.nextInt();
        
       //send the choice back to the main calling method
       return commanderChoice;
    } //close method
    
    //simulated the formation and dispatching of the rescue crew
    //to the disasterSite. Handles crew creation.
    
    public static void dispatchCrew(){
    Scanner scanner = new Scanner(System.in);
    //prompt user and get size
    System.out.println("Enter a crew size to dispatch ");
    int crewSize = scanner.nextInt();
    
    //build a new rescue team object to send to the disaster site
    RescueTeam rescueTeam1 = new RescueTeam();
 // set the team size on the RescueTeam object
 rescueTeam1.setTeamSize(crewSize);
 // Send the rescue team to make an attempt. The returned
 // value from makeRescueAttempt() is num of rescued victims
int numRescued = mainSite.makeRescueAttempt(rescueTeam1);
System.out.println("Rescue underway...");
logEvent("Number vicitims rescued: " + numRescued);
    
    
}
    }
