package org.example;

import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        if(integer == 2){
            return true;
        }
        else{
            return false;
        }
    }
}
