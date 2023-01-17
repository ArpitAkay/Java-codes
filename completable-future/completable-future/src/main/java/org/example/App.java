package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ExecutionException, InterruptedException {
        System.out.println( "Hello World!" );

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        System.out.println("Thread -> " + Thread.currentThread().getName());
        //you are doing API call
        delay(1);
        Future<List<Integer>> future = executorService.submit(() -> {
            System.out.println("hello");
            return Arrays.asList(1,2,3,4);
        });

        List<Integer> list = future.get();
        System.out.println(list);

        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        completableFuture.get();     //synchronous
        completableFuture.complete("return some dummy data");

    }

    private static void delay(int min){
        try {
            TimeUnit.MINUTES.sleep(min);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
