package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        int[] nums = new int[10];
//        System.out.println(Thread.currentThread());
//        Thread.ofPlatform().start(() -> System.out.println("Platform Thread : " + Thread.currentThread()));
//        System.out.println("-----------------");
//        Thread.ofVirtual().start(() -> System.out.println("Virtual Thread : " + Thread.currentThread()));

//        var threads = IntStream.range(0, totalThread).mapToObj(index -> {
//            return Thread.ofVirtual().unstarted(() -> {
////                System.out.println("Virtual Thread : " + Thread.currentThread());
//                if(index == 0) {
//                    System.out.println("Virtual Thread : " + Thread.currentThread());
//                }
//
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//
//                if(index == 0) {
//                    System.out.println("Virtual Thread : " + Thread.currentThread());
//                }
//            });
//        }).toList();
//
//        threads.forEach(Thread::start);
//        for(Thread thread : threads) {
//            thread.join();
//        }

        Map<Integer, Integer> map = new HashMap<>();
        map.get(1);
        map.forEach(new BiConsumer<Integer, Integer>() {
            @Override
            public void accept(Integer integer, Integer integer2) {
                System.out.println(integer + " : " + integer2);
            }
        });


        var start = System.currentTimeMillis();
        var totalThread = 100000;

        var threads = IntStream.range(0, totalThread).mapToObj(index -> Thread.ofPlatform().unstarted(() -> {
        })).toList();

        threads.forEach(Thread::start);
        for(Thread thread : threads) {
            thread.join();
        }

        var end = System.currentTimeMillis();
        System.out.println("millis used to launch " + totalThread + " vthreads : " + (end - start) + "ms");
    }
}
