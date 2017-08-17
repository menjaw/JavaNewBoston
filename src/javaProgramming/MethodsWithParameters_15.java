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
public class MethodsWithParameters_15 {

    public static void main(String[] args) {
        //Create a scannerObject to user-input
        Scanner input = new Scanner(System.in);
        //Create a messageObject to reach the methods
        Response_15 message = new Response_15();

        //WELCOME
        System.out.println("Enter your name");
        String name = input.nextLine();//Save the user-input in a variable
        message.halloMessage(name);  //run the message method

        //HOW OLD ARE YOU?
        System.out.println("How old are you?");
        int age = input.nextInt();//Save the user-input in a variable
        message.ageMessage(age);//run the message method
    }
}
