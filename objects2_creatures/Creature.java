/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects2_creatures;

/**
 *
 * @author Alyssa
 */
public class Creature {
    
    //public member variables
    public String name;
    public String species;
    
    //private member variable
    private int biteSizeInPercent;
    
    //method to simulate eating donut
    public void eatDonut(SizedDonut donutToEat){
        
        //we'll program the guts here
    }
    
    //getter method for biteSizeInPercent
    public int getBiteSizeInPercent(){
        return biteSizeInPercent;
    }
    
    public void setBiteSizeInPercent(int biteSizeInPercent){
        //we neet guts to check bite size
        this.biteSizeInPercent = biteSizeInPercent;
    }
}
