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
public class DonutLand_Refactored {

    final static int nibble = 5;
    final static int megaBite = 45;
    
    public static void main(String[] args){
        
        Donut firstDonut;
        firstDonut = new Donut();
        firstDonut.name = "Chloe";
        printObjectData(firstDonut);
       
        Donut secondDonut;
        secondDonut = new Donut();
        secondDonut.name = "Crusoe";
        printObjectData(secondDonut);
        
        //now eat some of each donut and print out the status
            System.out.println("Eating " + firstDonut.name);
            System.out.println("Nibble..."); 
        firstDonut.simulateEating(nibble);
             System.out.println("Nibble...");
        firstDonut.simulateEating(nibble);
             System.out.println("Taking megaBite...");
        firstDonut.simulateEating(megaBite);
        printObjectData(firstDonut);
        
        System.out.println("Eating " + secondDonut.name);
        System.out.println("Taking lots of megaBites");
        int numCalls = 10;
        for(int i = 0; i < numCalls; i++){
            System.out.println("gnam gnam");
            secondDonut.simulateEating(megaBite);}
            
        printObjectData(secondDonut);   
    }

        public static void printObjectData(Donut inputDonut){
            System.out.println("|-----STATS-----|");
            System.out.println("| Name: " + inputDonut.name);
            System.out.println("| PercRemaining: " + inputDonut.getPercRemaining());
            System.out.println("|---------------|");
        }
        
        
    }//close method
