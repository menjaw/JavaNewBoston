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
public class Person_14 {

    public void gender() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in your cpr-number");
        int cpr = scanner.nextInt();
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        if ((cpr % 2) == 0 && age < 15) {
            System.out.println("Hi! You are a girl");
        } else if ((cpr % 2) == 1 && age < 15) {
            System.out.println("Hi! You are a boy");
        } else if ((cpr % 2) == 0 && age >= 15) {
            System.out.println("Hi! You are a woman");
        } else if ((cpr % 2) == 1 && age >= 15) {
            System.out.println("Hi! You are a man");
        }
    }
}


