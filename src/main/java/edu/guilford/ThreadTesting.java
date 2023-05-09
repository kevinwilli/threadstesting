package edu.guilford;

public class ThreadTesting {
    public static void main(String[] args) {
        // we build some threada objects using the ThreadPrint class
        Thread thread1 = new Thread(new ThreadPrint("one"));
        Thread thread2 = new Thread(new ThreadPrint("two"));
        Thread thread3 = new Thread(new ThreadPrint("three"));
        Thread thread4 = new Thread(new ThreadPrint("four"));


        //we start the threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        //let's thread 3 interrupted
        thread3.interrupt();

    }

}
