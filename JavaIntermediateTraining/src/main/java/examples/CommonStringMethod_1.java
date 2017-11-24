/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;



/**
 *
 * @author Menja
 */
public class CommonStringMethod_1 {
    
    public static void main(String[] args) {
        String[] words = {"funk","chunk","furry","baconator"};
                
        //for(variable, array to check) -> Loops the array through to check and save it in the variable
        for (String word : words) {
            if (word.startsWith("fu")) {
                System.out.println(word + " starts with fu");
            }
        }
        
        for (String word : words) {
            if (word.endsWith("k")) {
                System.out.println(word + " end with a k");
            }
        }
    }
    
}
