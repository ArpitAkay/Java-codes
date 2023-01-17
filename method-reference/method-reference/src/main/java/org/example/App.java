package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public void m1(){
        System.out.println("m1() instance/non-static method");
    }
    public static void m2(){
        System.out.println("m2() static method");
    }

    public static void main( String[] args ) {

            System.out.println( "Hello World!" );

            //reference :: method name
//            Test::m2();    //static method reference

            App.m2();
            m2();

            App app = new App();
            app.m1();
//            app::m1() ;    //instance method reference

            //constructor method reference
    }
}
