/*
 This is a simple program that is modeled off of a virtual card catalogue for a library.
 Users can search for books by genre, and it will return the amount of books that are
 available for checkout as well as the titles.
 */
package finalproject;

import java.util.Scanner;
/**
 *
 * @author Alyssa
 */
public class MrRogersLibrary {
    
    public static void main(String[] args){

        //welcome messages and user selection options :)
        System.out.println("****** Welcome to Mr. Rogers' Memorial Library! ******");
        System.out.println("Thank you for accessing our virtual card catalogue.");
        System.out.println("Please select the genre of literature you would like to explore further "
                             + "and to see what is available to check out!");
        System.out.println("Or, if you'd rather explore at a later time, enter '4' to exit. Thank you!");
        System.out.println("");

        System.out.println(" Horror | Fantasy | Non-Fiction");
        System.out.println("--------------------------------");
        System.out.println("    1   |    2    |      3");
        
        //begin loop
        while (true) {
        
        //create scanner object
        Scanner keyboardScanner = new Scanner(System.in);
        
        //create user variable
        int pick = 0;
        
        //scanner
        pick = keyboardScanner.nextInt();

        switch (pick){            
            
            case 1: 
                Horror gHorror;
                gHorror = new Horror();
                gHorror.horror = "You have selected the horror genre!";
                printHorrorInfo(gHorror);
                break;
                
            case 2:
                Fantasy gFantasy;
                gFantasy = new Fantasy();
                gFantasy.fant = "You have selected the fantasy genre!";
                printFantasyInfo(gFantasy);
                break;
                
            case 3:
                NonFic gNonFic;
                gNonFic = new NonFic();
                gNonFic.fic = "You have selected the non-fiction genre!";
                printNonFicInfo(gNonFic);
                break;
            
            //end while loop    
            case 4:
                System.out.println("Thank you for visiting the Mr. Rogers' Memorial Library card catalogue. Have a great day!");
                return;
        }
     } 
    }
        public static void printHorrorInfo(Horror gHorror){
        System.out.println(gHorror.horror);
        System.out.println("We currently have " + gHorror.booksAvailable + " books available to check out.");
        System.out.println("Here are the titles of these masterpieces that await to be read by you!");
        System.out.println("**********");
        System.out.println(gHorror.hBookOne);
        System.out.println(gHorror.hBookTwo);
        System.out.println(gHorror.hBookThree);
        System.out.println("**********");
        System.out.println("Enter 2 to browse the fantasy section or 3 to see our non-fiction books! Enter '4' to exit. Thank you!");

        }
        
        public static void printFantasyInfo(Fantasy gFantasay){
        System.out.println(gFantasay.fant);
        System.out.println("We currently only have " + gFantasay.booksAvailable + " book available to check out.");
        System.out.println("**********");
        System.out.println(gFantasay.book);
        System.out.println("**********");
        System.out.println("Enter 1 to browse the spooky horror section or 3 to see our non-fiction books! Enter '4' to exit. Thank you!");
        }
        
        public static void printNonFicInfo(NonFic gNonFic){
        System.out.println(gNonFic.fic);
        System.out.println("We currently have " + gNonFic.booksAvailable + " books available to check out.");
        System.out.println("Here are the titles of these masterpieces that await to be read by you!");
        System.out.println("**********");
        System.out.println(gNonFic.nfBookOne);
        System.out.println(gNonFic.nfBookTwo);
        System.out.println("**********");
        System.out.println("Enter 1 to browse the hecka creepy horror section or 2 to see the whimsical fantasy section! Enter '4' to exit. Thank you!");
        
    }
}