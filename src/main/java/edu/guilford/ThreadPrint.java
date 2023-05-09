package edu.guilford;

import java.util.Random;

//runnable interface allows us to instantiate a thread object
public class ThreadPrint implements Runnable {

    private String name;
    private Random rand = new Random();
    //each thread will sleep between 1 and 6 seconds
    private int sleepTime = rand.nextInt(5000) + 1000;
    //constructor
    public ThreadPrint(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'run'");

        //run is what thread will do when the driver program call start() 
        //this is where we put the code that we want to run in parralel

        System.out.printf("Thread " + name +" is starting\n");
        System.out.println("Thread "+ name + " will sleep for " + sleepTime + " milliseconds");
        try {
            //try to sleep, but we must deal with the interrup exception

            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            System.out.println("Thread " + name + " was interrupted");
            e.printStackTrace();
        }

        System.out.printf("Thread " + name + " is done\n");

    }
    
}
