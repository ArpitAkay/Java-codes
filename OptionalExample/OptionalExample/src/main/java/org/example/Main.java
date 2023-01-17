package org.example;

import java.util.Optional;

public class Main {
    public static Optional<String> getName(){
        String name = "Arpit Kumar";
        Optional<String> optional = Optional.ofNullable(name);
        return optional;
    }

    public static void main(String[] args) {

        String str = null;
        Optional<String> optional = Optional.ofNullable(str);

        System.out.println(optional.isPresent());
//        System.out.println(optional.get());
        System.out.println(optional.orElse("No value present"));

        Optional<String> name = getName();

        System.out.println(name.orElse("No value present"));
    }
}