package threads;

import java.util.Random;

/**
 * In this example we will build 3 different objects
 *
 * Each of these objects we gonna puts on 3 different threads
 *
 * Then run them all at once and see whats happend
 *
 * @author Menja
 */
public class DeclareThreadCode_26 implements Runnable {

    //Each object will contains
    String name;

    //constructor
    public DeclareThreadCode_26(String name) {
        this.name = name;
    }
    


    @Override
    public void run() {
        long start = System.currentTimeMillis();
        //The code that will run when the thread is started
        try {
            System.out.printf("This is %s %n", name);
            Thread.sleep(2500);
            System.out.printf("%s is done %n", name);
        } catch (Exception e) {

        }

        long end = System.currentTimeMillis();
        System.out.printf("The running time for %s was: " + (end - start) + " milliseconds  %n", name);
    }

}

/**
 * Threads is a way for your computer to do multiplie things at once
 *
 * Video example: in old days you had to wait for the whole film to download
 * before you could watch it
 *
 * Now: Loading and Watcing is two different things, but with threads it is
 * possible
 */
