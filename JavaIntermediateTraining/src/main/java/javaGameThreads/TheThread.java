/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaGameThreads;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Menja
 */
public class TheThread implements Runnable {

    //Variable
    String name;
    Random rand = new Random();
    int time;

    //Constructor
    public TheThread() {
    }

    public TheThread(String name) {
        this.name = name;
        time = rand.nextInt(999);
    }

    @Override
    public void run() {
        try {
            long start = System.currentTimeMillis();

            System.out.printf("Team %s got a sleppingtime at: %d" + " milliseconds %n", name, time);
            Thread.sleep(time);

            long end = System.currentTimeMillis();
            System.out.printf("%n Team %s runningtime was: " + (end - start) + " milliseconds. %n", name);

        } catch (InterruptedException ex) {
            Logger.getLogger(TheThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
