package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierFunctionInterface {

    public static void main(String[] args){
        SupplierDemo supplierDemo = new SupplierDemo();
        System.out.println(supplierDemo.get());

        Supplier<Integer> supplier1 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 24;
            }
        };
        System.out.println(supplier1.get());

        Supplier<String> supplier2 = () -> {
            return "Hello World";
        };
        System.out.println(supplier2.get());

        List<Integer> list = Arrays.asList();
        Integer num = list.stream().findAny().orElseGet(() -> {
            return 24;
        });
        System.out.println(num);
    }
}
