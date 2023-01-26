package org.example;

import java.util.stream.IntStream;

public class ParallelStreamDemo {
    public static void main(String[] args){
        long start = 0;
        long end = 0;

//        start = System.currentTimeMillis();
//        System.out.println(start);
//
//        IntStream.rangeClosed(1, 100).forEach((e) -> {
//            System.out.print(e + " ");
//        });
//        System.out.println();
//        end = System.currentTimeMillis();
//        System.out.println(end);
//
//        System.out.println("Plain stream time taken " + (end - start));
//
//        System.out.println("###################");
//
//        //There are 2 ways to create Parallel Stream
//        start = System.currentTimeMillis();
//        System.out.println(start);
//        IntStream.rangeClosed(1, 100).parallel().forEach((e) -> {
//            System.out.print(e + " ");
//        });
//        System.out.println();
//        end = System.currentTimeMillis();
//        System.out.println(end);
//
//        System.out.println("Parallel stream time taken " + (end - start));

        IntStream.rangeClosed(1, 10).forEach((e) -> {
            System.out.println("Thread : " + Thread.currentThread().getName() + " : " + e);
        });

        IntStream.rangeClosed(1, 10).parallel().forEach((e) -> {
            System.out.println("Thread : " + Thread.currentThread().getName() + " : " + e);
        });

    }
}
