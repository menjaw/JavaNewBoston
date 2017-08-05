/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaProgramming;

import java.util.Scanner;

/**
 *
 * @author Menja
 */
public class IncrementOperators_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int horses = 5; 
        int cows = 15;
        int ducks = 128;
        
        /**HORSES: Pre increment adds 1 to the variable before it is using the variables value*/
        System.out.println("There are " + horses + " horses");
        ++horses;
        System.out.println("With pre increment (++horses) it adds 1 before it use the variable value.");
        System.out.println("So there are now " + horses + " horses" + "\n");
        
        /**COWS: Increment the operator after the variable*/
        System.out.println("There are " + cows + " cows");
        System.out.println("With increment (cows++) it adds 1 after it use the variable value.");
        System.out.println("So it will use the variable and then add 1 to it ");
        System.out.println("There are now: "  + cows++ +  " cows");
        System.out.println("Second time you print it, there are: " + cows + " cows" + "\n");
        
        
        /**ASSIGNMENT OPARETOR*/
        /**Add more than 1 to the variable*/
        System.out.println("There are " + ducks + " ducks");
        System.out.println("We buy 53 new ducks, how many are there now?");
        
        //one way to do it
        ducks = ducks + 53;
        System.out.println("With the new ducks we now have: " + ducks + " ducks" + "\n");
        
        //second way to do it
        System.out.println("Again we buy new ducks, this time 77 ducks.");
        ducks += 77;
        System.out.println("Now we have: " + ducks + " ducks");
        
        
        
        
    }
}
