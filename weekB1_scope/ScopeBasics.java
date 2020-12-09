/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekB1_scope;

/**
 *
 * @author Alyssa
 */
public class ScopeBasics {
    //first member variable: this named chunk of data can be read from and
    //writen to by ANY code in this class - meaning any method.
    private static String classScopedVar = "All methods can access me!";
    
    //This method demonstrates which variables can be accessed in its
    //local scope: only class-scoped variables and its own local variable called local scope2
    public static void demonstrateScope(){
        System.out.println("Inside demonstrationSccope");
        
        //declaration and initialization of a local variable to demonstrateScope
        String localScope2 = "I'm local to a demonstrateScope";
        
        System.out.println(localScope1); //localScope1 was sdeclared in main
                                         //and cannot be accessed by any other method
                                         
        System.out.println(classScopedVar);
        System.out.println(localScope2);
        
        //any method can change a class-scoped variable's value
        classScopedVar = "I can be changed in any method";
        
} //clpse demonstrateScope
    
    public static void main(String[] args){
        System.out.println("Inside Main");
        
        //declaration and initialization of a local variable to main
        String localScope1 = "I'm local to main";
        
        System.out.println(localScope1);
        System.out.println(classScopedVar);
        System.out.println(localScope2);     //localScope2 is only accessible
                                            //in the method in which it is declared
                                            //which is demonstrateScope
                                            
        //call a method to will test variable scope concepts
        demonstrateScope();
        
    } //close main
}//close class