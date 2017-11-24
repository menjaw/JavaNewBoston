/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Menja
 */
public class RunThreadCode_26 {

    public static void main(String[] args) {
        //Variables
       
        

        //Create a thread from the code in DeclareThreadCode_26 (Here we have 4 different objects)
        //It is required that you have implementet Runnable() in the DeclareThreadCode_26 class
        Thread t1 = new Thread(new DeclareThreadCode_26("Thread 1"));
        Thread t2 = new Thread(new DeclareThreadCode_26("Thread 2"));
        Thread t3 = new Thread(new DeclareThreadCode_26("Thread 3"));
        Thread t4 = new Thread(new DeclareThreadCode_26("Thread 4"));

        
        //Start the threads        
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
