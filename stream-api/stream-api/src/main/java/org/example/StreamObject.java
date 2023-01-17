package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        //stream API - collection process
        //collection, group of object

        //Blank stream
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach((e) -> {
            System.out.println(e);
        });

        //object, collection
        String names[] = {"Durgesh", "Uttam", "Ankit", "Divya"};
        Stream<String> stream = Stream.of(names);
        stream.forEach((e) ->{
            System.out.println(e);
        });

        Stream<Object> streamBuilder = Stream.builder().build();

        IntStream stream1 = Arrays.stream(new int[]{2, 4, 65, 3, 564});
        stream1.forEach((e)->{
            System.out.println(e);
        });

        List<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(2);
        numbers2.add(4);
        numbers2.add(50);
        numbers2.add(21);
        numbers2.add(22);
        numbers2.add(67);

        Stream<Integer> stream2 = numbers2.stream();
        stream2.forEach((e) -> {
            System.out.println(e);
        });

    }
}
