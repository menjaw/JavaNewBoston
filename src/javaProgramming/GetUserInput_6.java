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
public class GetUserInput_6 {

    /*Tutorial 6 - Get User Input*/
    public static void main(String[] args) {
        //First implement Scanner
        //Scanner tager informationen som brugeren taster ind (fra keyboardet), og gemmer den i en variabel
        //Dette er en variabel som er det samme som hvad end der måtte komme af input fra keyboardet
        //Når programmet kører, kan man i output indtaste et input, og tryk enter 
        
        Scanner scanner = new Scanner(System.in);//system.in er der scanneren modtager input fra keyboardet
        System.out.println(scanner.nextLine());     
    }

}
