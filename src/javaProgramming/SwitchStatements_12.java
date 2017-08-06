/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Menja
 */
public class SwitchStatements_12 {

    public static void main(String[] args) throws Exception{
        /**
         * CHECK THE AGE INT AND BUFFEREDREADER
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type in your weight");
        int weight = Integer.parseInt(br.readLine());
        switch (weight) {
            case 40:
                System.out.println("Your weight is: " + weight);
                break;
            case 45:
                System.out.println("Your weight is: " + weight);
                break;
            case 50:
                System.out.println("Your weight is: " + weight);
                break;
            case 55:
                System.out.println("Your weight is: " + weight);
                break;
            case 60:
                System.out.println("Your weight is: " + weight);
                break;
            case 65:
                System.out.println("Your weight is: " + weight);
                break;
            default:
                System.out.println("You don't fit in the box");
        }
        
        
        /**CHECK THE NAME WITH STRING AND SCANNER*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your name");
        String name = scanner.nextLine();
        
        switch (name) {
            case "User":
                System.out.println("Your name is to weak");
                break;
            case "User1234":
                System.out.println("Your name is to weak");
                break;
            case "NewUser":
                System.out.println("Your name is to weak");
                break;
            case "OldUser":
                System.out.println("Your name is to weak");
                break;
            default:
                System.out.println("We don't have an opinion of your name");
        }
    }
}
