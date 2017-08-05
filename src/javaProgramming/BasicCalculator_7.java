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
public class BasicCalculator_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //variables
        double num1;
        double num2;
        double result;
        
        System.out.println("Enter first number: ");
        num1 = scanner.nextDouble();
        
        System.out.println("Enter second number: ");
        num2 = scanner.nextDouble();

        result = num1 + num2;
        System.out.println(result);
    }
}
