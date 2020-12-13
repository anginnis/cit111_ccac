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
public class CreatureLand {
    
    public static void main(String[] args){
        Creature penguin;
        penguin = new Creature();
        
        //writing member variable values
        penguin.name = "Pablo";
        penguin.species = "Emperor Penguin";
        //NOT: no sizelimit meember var or setter method
        //on simplified Creatire object
        
        penguin.setBiteSizeInPercent(5);
        
        SizedDonut donutForPenguin = new SizedDonut ();
        donutForPenguin.name = "Chole";
        donutForPenguin.sizeInmm = 32;
        
        //paa an instance of a SizedDonut object into the 
        //eatDonut method on our Creature object
        penguin.eatDonut(donutForPenguin);        
    }
    public static void displayCreatureStats(Creature creatureToPrint){
        System.out.println("Displaying Creature Information");
        System.out.println("Name :" + creatureToPrint.name);
        System.out.println("Species: " + creatureToPrint.species);
        System.out.println("Bite Size: " + creatureToPrint.getBiteSizeInPercent() 
                           + "% of a donut.");
    }
}
