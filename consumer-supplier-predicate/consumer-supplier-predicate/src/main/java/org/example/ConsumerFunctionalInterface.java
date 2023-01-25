package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Hello world!
 *
 */
public class ConsumerFunctionalInterface
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        ConsumerDemo consumerDemo = new ConsumerDemo();
        consumerDemo.accept(24);

        Consumer<Integer> consumer1 = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        consumer1.accept(24);

        Consumer<Integer> consumer2 = (integer) -> {
            System.out.println(integer);
        };
        consumer2.accept(24);
        
        //forEach method always accepts consumer functional interface
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.forEach((e) -> consumer2.accept(e));
    }
}
