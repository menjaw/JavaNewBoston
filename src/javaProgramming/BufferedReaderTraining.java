/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Menja
 */
public class BufferedReaderTraining {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Write your name");
        String input = br.readLine();
        System.out.println("Hallo " + input + "! \n" + "Nice to see you");
    }
}
