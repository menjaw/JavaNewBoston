/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaProgramming;

import com.sun.xml.internal.ws.api.message.saaj.SAAJFactory;
import java.util.Scanner;

/**
 *
 * @author Menja
 */
public class MathOperators_8 {

    public static void main(String[] args) {


        int size = 451;
        int age = 2333;
        double peopleAdd = size + age;
        double peopleSub = size - age;
        double peopleMul = size * age;
        double peopleDiv = size / age;

        /**2 WAYS OF PRINTING*/
        //print out each variable seperated
        System.out.println("PRINT OUT THE VARIABLES SEPERATED");
        System.out.println("Addition " + peopleAdd);
        System.out.println("Substraction " + peopleSub);
        System.out.println("Multiplication " + peopleMul);
        System.out.println( "Division " + peopleDiv + "\n");
        
        //print out the variables together
        System.out.println("PRINT OUT THE VARIABLES TOGETHER");
        System.out.println("Addition: " + peopleAdd + " Substraction: " + peopleSub + " Multiplication: " + peopleMul + " Division: " + peopleDiv + "\n");
        

        /**GIRLS: Modulus or Remainder operator [%] */
        // [%]-modulus returns the remainder of 2 numbers
        int girls = 45;
        int groups = 6;
        int remaind = girls % groups;
        
        System.out.println("\n" + "MODULUS OR REMAINDER OPERATOR");
        System.out.println( "There are " + girls + " girls");
        System.out.println("They need to make " + groups + " groups");
        System.out.println("There will be " + (girls/groups) + " girls in each group");
        System.out.println("There will be " + remaind + " girls left");
        
        
       
        /**BOYS: Modulus or Remainder operator [%] with scanner*/
        // [%]-modulus returns the remainder of 2 numbers
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "Type in the number of boys you see: ");
        int boys = scanner.nextInt();
        double remaindingBoys = boys % groups;
        
        System.out.println("\n" + "MODULUS OR REMAINDER OPERATOR");
        System.out.println( "There are " + boys + " boys");
        System.out.println("They need to make " + groups + " groups");
        System.out.println("There will be " + (boys/groups) + " boys in each group");
        System.out.println("There will be " + remaindingBoys + " boys left");
    }

}
