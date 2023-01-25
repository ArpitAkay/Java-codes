package org.example;

import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<Integer> {

    public void accept(Integer integer) {
        System.out.println(integer);
    }
}
