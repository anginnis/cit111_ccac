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
public class FoodLand {
    
    final static int nibble = 5;
    final static int bigBite = 25;
    final static int drink = 10;
    final static int bigGulp = 75;
    
    public static void main(String[] args){
        
 System.out.println("Hey there! I heard that you were hungry. How about some sweet treats today?");
 System.out.println("");
 
        Donut aDonut;
        aDonut = new Donut();
        aDonut.name = "Chocolate Donut";
        printDonutStats(aDonut);
        
        System.out.println("Eating a " + aDonut.name);
        System.out.println("Nibble..."); 
            aDonut.simulateEating(nibble);
        System.out.println("Another nibble...");
            aDonut.simulateEating(nibble);
        System.out.println("Taking a big bite...");
            aDonut.simulateEating(bigBite);
        printDonutStats(aDonut);
        System.out.println("");
        
        //////////////////
        
        Cheesecake cCake;
        cCake = new Cheesecake();
        cCake.yum = "Raspberry Cheesecake";
        printCheesecakeStats(cCake);
        
        System.out.println("Eating a " + cCake.yum);
        System.out.println("Nibble..."); 
            cCake.eatCheesecake(nibble);
        System.out.println("Another nibble...");
            cCake.eatCheesecake(nibble);
        System.out.println("Taking a big bite...");
            cCake.eatCheesecake(bigBite);
        printCheesecakeStats(cCake);
        System.out.println("");
        
        //////////////////
        
        Milkshake aShake;
        aShake = new Milkshake();
        aShake.shake = "Strawberry Milkshake";
        printShakeStats(aShake);
        
        System.out.println("Drinking a " + aShake.shake);
        System.out.println("Sip..."); 
            aShake.drinkShake(drink);
        System.out.println("Another sippy sip...");
            aShake.drinkShake(drink);
        System.out.println("BIG GULP!");
            aShake.drinkShake(bigGulp);
        printShakeStats(aShake);
        
        //////////////////
    }
    public static void printDonutStats(Donut aDonut){
        System.out.println("******DONUT STATS******");
        System.out.println(aDonut.name);
        System.out.println("Percent Remaining: " + "%"+aDonut.getPercRemaining());
        System.out.println("************************");
    }
     
    public static void printCheesecakeStats(Cheesecake cCake){
        System.out.println("******CHEESECAKE STATS******");
        System.out.println(cCake.yum);
        System.out.println("Percent Remaining: " + "%"+cCake.getPercRemaining());
        System.out.println("************************");
    }
    
    public static void printShakeStats(Milkshake aShake){
        System.out.println("******MILKSHAKE STATS******");
        System.out.println(aShake.shake);
        System.out.println("Percent Remaining: " + "%"+aShake.getPercRemaining());
        System.out.println("************************");
    }
}
