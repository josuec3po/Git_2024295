/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simpleoutputca3;

import java.util.Scanner;

/**
 *
 * @author Acer Nitro 5
 */
public class SimpleOutputCA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //addeed a simple print
        System.out.println(" Josue - 2024295 ");
        
        //Create a scanner to read user inpute
        Scanner myKB = new Scanner(System.in);
        
        // Create a string called myName
        String myName;
        
            //Repeats this piece of code while the user input contains other than only letters
            do {
            System.out.println("Please, type your name: ");
            myName = myKB.nextLine().trim();

            // Verifies if there are numbers in the string myName in this case
            if (myName.matches(".*\\d.*") || !myName.matches("[a-zA-ZÀ-ÿ\\s]+")) {
                
                System.out.println("Invalid input! Numbers/special characters are not allowed in the name.");
                
            }

            // Make sure that the program continues ONLY IF the string contains only letters   
            } while(!myName.matches("[a-zA-Z]+"));
            
           
           //Output message and convert the string to Lowercase
            System.out.println("Name in LowerCase: " + myName.toLowerCase());
         
            //Output message and convert the string to Uppercase
           System.out.println("Name in UpperCase: " + myName.toUpperCase());
           
           //Output message and count how many characters the string has
           System.out.println("Name length: " + myName.length());
           
           
           //Output message and using basic RegEx replace vowels with a special character "*"
           System.out.println("Name with vowels replaced: " + myName.replaceAll("[AEIOUaeiou]", "*"));
            
    }
        
    }
    
