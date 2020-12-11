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
public class Milkshake {
    
    public int percRemaining = 100;
    public boolean addCherries;
    public String shake;
    
    
    public void drinkShake (int percentEaten){
        percRemaining = percRemaining - percentEaten;  
    }
    
    public void withCherries(){
        addCherries = true;
    }
    
    public int getPercRemaining(){
        return percRemaining;
    }
}
