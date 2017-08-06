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
public class LogicalOperators_11 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
        
        int boy, girl;
        
        System.out.println("How old is the boy?");
        boy = Integer.parseInt(bf.readLine());
        System.out.println(boy);
        
        System.out.println("How old is the girl?");
        girl = Integer.parseInt(bf.readLine());
        System.out.println(girl);
        
        
        if (boy >= 15 && girl < 15 || boy < 15 && girl < 15) {
            System.out.println("Sorry you are not allowed");
        }
        else if (boy < 15 && girl >= 15) {
            System.out.println("Uh, you got a good story boy");
        }
        else {
            System.out.println("Don't even ask, you are old enough");
        }
   
    }
    
}
