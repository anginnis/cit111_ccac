/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8project;
/**
 *
 * @author Alyssa
 */
public class OrderTabulator {
    
    private static int cPizza = 0;
    private static int pPizza = 0;
    private static int totalCheesePizzas = 0;
    private static int totalPepPizzas = 0;
    private static int totalPizzas = 0;

    
    private static int CHEESE_PIZZA = 100;
    private static int PEP_PIZZA = 100;
    
    //////////
    public static void main(String[] args){
        System.out.println("Let's see how many pizzas were sold today!");
        System.out.println("********************************");
        
        //call method and order totals
        System.out.println("NOON");
        cheesePizzaOrdered (5, 100);
        pepPizzaOrdered (5, 100);
        printTotalPizzasOrdered();

        System.out.println("BY 5 O'CLOCK");
        cheesePizzaOrdered (50, 100);
        pepPizzaOrdered (75, 100);
        printTotalPizzasOrdered();
        
        System.out.println(">>>END OF DAY TOTALS<<<");
        cheesePizzaOrdered(125, 100);
        pepPizzaOrdered (240, 100);
        printTotalPizzasOrdered();
        
    } //close main
    
    public static void cheesePizzaOrdered(int cPizza, int cOrders){
        if(cOrders >= CHEESE_PIZZA){
            totalCheesePizzas = totalCheesePizzas + cPizza;
            totalPizzas = totalPizzas + cPizza;}
            
        } //close cheesePizzaOrdered
    
        public static void pepPizzaOrdered(int pPizzas, int pOrders){
        if(pOrders >= PEP_PIZZA){
            totalPepPizzas = totalPepPizzas + pPizzas;
            totalPizzas = totalPizzas + pPizzas; }
        
    } //close pepPizzaOrdered
        
        public static void printTotalPizzasOrdered(){
            
            System.out.println("********************************");
            System.out.println("Total cheese pizzas ordered: " + totalCheesePizzas);
            System.out.println("Total pepperoni pizzas ordered: " + totalPepPizzas);
            System.out.println("Total pizzas ordered: " + totalPizzas);
            System.out.println("********************************");
            
        }//close printTotalPizzasOrdered
        
} //close class

    
   
