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
public class RescueTeam {
    
    public static void dispatchCrew(){
        Scanner scanner = new Scanner(System.in);
        
        //promt user and get size
        System.out.println("Enter a crew size to dispatch: ");
        int crewSize = scanner.nextInt();
        
        //only rhe total available staff can be dispatched
        
        if(crewSize <= totalStaff){
            //build new rescue team object to send to the disaster site
            
            RescueTeam rescueTeam1 = new RescueTeam();
            
            rescueTeam1.setTeamSize(crewSize);
            
            int numRescued = mainSite.makeRescueAttempt (rescueTeam1);
            System.out.println("Rescue underway...");
            logEvent("Number victims rescued: " + numRescued);
        }
        else {
            logEvent ("No crew dispatched: not enough staff to dispatch");
        }
    }
    
}
