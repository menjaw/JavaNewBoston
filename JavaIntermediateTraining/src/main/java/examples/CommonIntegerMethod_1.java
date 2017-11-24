/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Menja
 */
public class CommonIntegerMethod_1 {
    
    private static ArrayList<Integer> numbers = new ArrayList();

    public static void main(String[] args) {
        randNumList(numbers);
        checkIfListContainsAll(numbers);

    }

    public static ArrayList randNumList(ArrayList numbers) {
        Random rand = new Random();

        for (int i = 0; i < 35; i++) {
            int randomNumber = rand.nextInt(550);
            numbers.add(randomNumber);
        }
        System.out.println(numbers);
        return numbers;
    }

    public static void checkIfListContainsAll(ArrayList numbers) {
        if ((numbers.contains(5))) {
            System.out.println("It was there" + numbers);
        } else {
            System.out.println("It was not there" + numbers);
        }
    }

}
