package org.example;

import java.util.concurrent.Callable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        MyInterface myInterface1 = new MyInterfaceImpl();
        myInterface1.sayHello();

        MyInterface myInterface2 = new MyInterface() {      // anonymous class
            @Override
            public void sayHello() {
                System.out.println("This is first anonymous class");
            }
        };
        myInterface2.sayHello();


        // using our interface with the help of lambda
        MyInterface myInterface3 = () -> {
            System.out.println("This is first time i am using lambda");
        };
        myInterface3.sayHello();

        MyInterface myInterface4 = () -> System.out.println("This is second time i am using lambda");
        myInterface4.sayHello();

        SumInterface sumInterface1 = new SumInterfaceImpl();
        System.out.println(sumInterface1.sum(2,4));

        SumInterface sumInterface2 = new SumInterface() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };
        System.out.println(sumInterface2.sum(4,6));

        SumInterface sumInterface3 = (int a, int b) -> {
            return a+b;
        };
        System.out.println(sumInterface3.sum(6,8));

        SumInterface sumInterface4 = (a, b) -> {
            return a+b;
        };
        System.out.println(sumInterface4.sum(6,8));

        SumInterface sumInterface5 = (int a, int b) -> a+b;
        System.out.println(sumInterface5.sum(8,10));

        SumInterface sumInterface6 = (a, b) -> a+b;
        System.out.println(sumInterface6.sum(8,10));

    }
}
