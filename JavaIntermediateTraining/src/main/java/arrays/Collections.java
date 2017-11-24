/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Menja
 */
public class Collections {

    public static void main(String[] args) {
        //Collection: hold an object to other references
        /*------------------------------------------------------------------------------------*/
        int countNames = 0;
        String[] names = {"Tom", "Cedric", "Sofie", "Adrian", "Kristin", "Steve", "Angelica", "Lisa", "Joy"};
        List<String> nameList = new ArrayList();

        for (String stringName : names) {
            nameList.add(stringName);
            countNames++;
        }
        System.out.println("There was " + countNames + " items in the array with names");
        System.out.println("Names: " + nameList.toString() + "\n");

        /*------------------------------------------------------------------------------------*/
        int countAdults = 0;
        int countChildren = 0;
        int[] ages = {2, 43, 12, 77, 65, 24, 90, 30, 22, 55, 21, 7, 17, 19, 26, 38, 42, 13, 51, 28, 33, 35, 31, 30, 40 , 50, 60, 2, 6, 8, 1};
        List<Integer> children = new ArrayList();
        List<Integer> adults = new ArrayList();
        for (int age : ages) {
            if (age < 18) {
                children.add(age);
                countChildren++;
            } else if (age >= 18) {
                adults.add(age);
                countAdults++;
            }
        }
        //Print out all ages of children
        System.out.println("There was " + countChildren + " items in the array with children");
        System.out.println("Children ages: " + children.toString());
        System.out.println("Age at index 5 is: " + children.get(5) + "\n");
        
        //Print out all ages of adults
        System.out.println("There was " + countAdults + " items in the array with adults");
        System.out.println("Adults ages: " + adults.toString());
        System.out.println("Age at index 5 is: " + adults.get(5));

        /*-----------------------------------------------------------------------------------*/
    }
}
