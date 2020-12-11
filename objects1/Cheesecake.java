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
public class Cheesecake {
    
    public int percRemaining = 100;
    public boolean addFruit;
    public String yum;
    
    
    public void eatCheesecake (int percentEaten){
        percRemaining = percRemaining - percentEaten;  
    }
    
    public void withFruit(){
        addFruit = true;
    }
    
    public int getPercRemaining(){
        return percRemaining;
    }
}
