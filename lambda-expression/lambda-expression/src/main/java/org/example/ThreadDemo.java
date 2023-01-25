package org.example;

import java.util.stream.IntStream;

public class ThreadDemo {
    public static void main(String[] args){

        //First Thread: Thread - thread1
        Runnable thread1 = () -> {
            //This is body of the thread
            IntStream.rangeClosed(1,10).forEach((i) -> {
                System.out.println("Value " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        };
        Thread t1 = new Thread(thread1);
        t1.setName("thread1");
        t1.start();

        Runnable thread2 = () -> {
            IntStream.rangeClosed(1,10).forEach((i) -> {
                System.out.println(5 + "*" + i + "=" + 5*i);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        };
        Thread t2 = new Thread(thread2);
        t2.setName("thread2");
        t2.start();

    }
}
