/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaGameThreads;

/**
 *
 * @author Menja
 */
public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new TheThread("Red"));
        Thread t2 = new Thread(new TheThread("Yellow"));
        Thread t3 = new Thread(new TheThread("Green"));
        
        t1.start();
        t2.start();
        t3.start();
        
    }
}
