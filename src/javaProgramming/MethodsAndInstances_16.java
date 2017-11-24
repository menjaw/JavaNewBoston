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
public class MethodsAndInstances_16 {
    public static void main(String[] args) {
        Address_16 address = new Address_16();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter yor address");
        String inputAddress = input.nextLine();
        address.setAddress(inputAddress);
        
        System.out.println("Enter the zipcode?");
        String inputZipcode = input.nextLine();
        address.setZipcode(inputZipcode);
        
        System.out.println("The city you live is called?");
        String inputCity = input.nextLine();
        address.setCity(inputCity);
        
        System.out.println("Wich country are you living in?");
        String inputCountry = input.nextLine();
        address.setCountry(inputCountry);
        
        address.responseToUser();
    }
}
