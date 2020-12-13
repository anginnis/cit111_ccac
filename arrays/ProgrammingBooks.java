/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Alyssa
 */
public class ProgrammingBooks {
    
    public static void main(String[] args){
        
        String[] books = new String [5];
        
        books[0] = "Perl Cookbook";
        books[1] = "PHP Cookbook";
        books[2] = "Python in a Nutshell";
        books[3] = "Javascript: The Definitive Guide";
        books[4] = "Java in a Nutshell";
    }
    
    public static void printArrayContents(String[] arrayInsideMethod){
        
        System.out.println("****** Extract array value and store it ******");
        
        //extract contents of each array bin then print it to the console
        
        String extractedArrayValue = arrayInsideMethod[0];
        System.out.println("Book at array at index 0: " + extractedArrayValue );
        
        extractedArrayValue = arrayInsideMethod[1];
        System.out.println("Book at array at index 1: " + extractedArrayValue );
        
        extractedArrayValue = arrayInsideMethod[2];
        System.out.println("Book at array at index 2: " + extractedArrayValue );
        
        extractedArrayValue = arrayInsideMethod[3];
        System.out.println("Book at array at index 3: " + extractedArrayValue );
        
        extractedArrayValue = arrayInsideMethod[4];
        System.out.println("Book at array at index 4: " + extractedArrayValue );
    }
}
