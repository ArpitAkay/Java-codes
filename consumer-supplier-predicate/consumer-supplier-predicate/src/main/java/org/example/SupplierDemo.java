package org.example;

import java.util.function.Supplier;

public class SupplierDemo implements Supplier<Integer> {
    @Override
    public Integer get() {
        return 24;
    }
}
