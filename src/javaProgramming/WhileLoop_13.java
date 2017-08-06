/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Menja
 */
public class WhileLoop_13 {

    public static void main(String[] args) throws Exception {
        /**
         * BASIC WHILE LOOP
         */
        //Example 1
        int counter = 0;
        while (counter < 10) {
            System.out.println(counter);
            //If you don't add 1 (or more) to the counter after using the variable, you will get an infinty loop who never stops
            counter++;
        }

        //Example 2
        counter = 10;
        while (counter < 100) {
            System.out.println(counter);
            //Everytime the variable is used, 10 is added to the value
            counter += 10;
        }

        /**
         * WHILE-LOOP WITH SCANNER-INPUT
         */
        //INT
        Scanner intScanner = new Scanner(System.in);
        System.out.println("Write a number between 0-100");
        int counter2 = intScanner.nextInt();
        while (counter2 < 100) {
            System.out.println(counter2);
            counter2++;
        }

        //STRING - prints each character from the input-message on a seperate line
        Scanner stringScanner = new Scanner(System.in);
        System.out.println("Enter a message");
        String message = stringScanner.nextLine();
        int count = 0;

        while (count < message.length()) {
            System.out.println(message.charAt(count));
            count++;
        }

    }
}
