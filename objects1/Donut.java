/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects1;

/**
 *
 * @author Alyssa
 */
public class Donut {
    
    //member variables
    private int percRemaining = 100;
    public String name;
    
    //method: takes in integer representing the size of bite
    //being taken of this donut. Returns nothing.
    public void simulateEating(int percentEaten){
        //subtract the bite size from the existing donut % remaining
        percRemaining = percRemaining - percentEaten;  
    }//close method
    
    //method: takes no input parameters and returns percRemaining
    public int getPercRemaining(){
        //very simple guts: just send back the value of one of the object's
        //member variables to the calling method. This is called a "getter"
        return percRemaining;
    }//close method
    
    //there's no main() method in this class
    //we must make this object with the new keyboard inside another class
    //in order for this class to do anything
    
} //close class
