/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 * 
 * @author Alyssa
 */
public class BasicSwitch {
    public static void main(String[] args){
        
        //hard coded value to test if else
        final int SELECTOR = 78;
        
        
        if(SELECTOR == 1){
                System.out.println("First case selected");}
        
          else if (SELECTOR == 2){
                System.out.println("Second case selected");}

          else if (SELECTOR == 3){
                System.out.println("Third case selected");}
                
        else {
    System.out.println("Default case");}
                
        } //close if else
}//close main
