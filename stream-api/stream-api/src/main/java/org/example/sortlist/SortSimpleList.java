package org.example.sortlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortSimpleList {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(3);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        list.stream().sorted().forEach((e) -> {
            System.out.println(e);
        });

        list.stream().sorted(Comparator.reverseOrder()).forEach((e) -> {
            System.out.println(e);
        });
    }
}
