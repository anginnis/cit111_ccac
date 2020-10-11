package week3;

/**
 *
 * @author Alyssa
 */
public class OperatorsChallenge {
    
    public static void main(String[] args){
        
        int a = 100;
        int b = 2000;
        double d = 10.5;
        
        String line1 = "Go ask Alice";
        String line2 = "I think she'll know";
        
        int r = b / a;
        System.out.println("R is " + r);
        
        int mod = b % a;
        System.out.println("B % a is " + mod);
        
        double rd = mod * d;
        System.out.println("Value of operation is " + rd);
        
        a = a + 5;
        System.out.println("I'm going to compute " + b + " mod " + a);
        
        rd = b % a;
        System.out.println ("Operater divides and gives a remainder of " + rd);
        
        
        System.out.println(" " + line2 + " " + line1);
        System.out.println(" " + line1 + " " + line2);
        
           } // end class
    
} // end main
