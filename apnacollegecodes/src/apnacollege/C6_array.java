package apnacollege;
import java.util.*;

public class C6_array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        //Strings
        String name1 = new String("Arpit Kumar");
        // name1 = sc.nextLine();
        String name2 = "Arpit Kumar";
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name1.equals(name2));

        //Arrays
        int[] marks = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        sc.close();


        final float pi = 3.14f;     //const variable.
        System.out.println(pi);

    }
}