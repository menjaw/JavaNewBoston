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
public class Response_15 {

    public String halloMessage(String inputName) {
        System.out.println("Hallo " + inputName + "!");
        return inputName;
    }

    public int ageMessage(int age) {
        if (age <= 12) {
            System.out.println("You are to young and can't see this thriller");
        } else if (age > 12 && age <= 18) {
            System.out.println("Hope you are with your parents or at least with some friends");
        } else {
            System.out.println("Have a hoooaooaaarrible movie");
        }
        return age;
    }
}
