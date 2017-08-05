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
public class IfStatement_10 {

    public static void main(String[] args) {
        Scanner ageScanner = new Scanner(System.in);

        /**
         * Check the age
         */
        System.out.println("How old are you?");
        int age = ageScanner.nextInt();
        if (age >= 18) {
            System.out.println("You are old enough to wipe your own nose");
        } else {
            System.out.println("Sorry you still need your parents to wipe your nose");
        }

        /**
         * Check the word
         */
        Scanner messageScan = new Scanner(System.in);
        System.out.println("Write a message");
        String message = messageScan.nextLine();

        if (message.contains("shit")) {
            System.out.println("You typed: " + message);
            System.out.println("Watch your language");
        } 
        else if (message.contains("fuck")){
        System.out.println("You typed: " + message);
            System.out.println("Fuck yourself");
        }
        else {
            System.out.println("Good job");
        }

    }

}
