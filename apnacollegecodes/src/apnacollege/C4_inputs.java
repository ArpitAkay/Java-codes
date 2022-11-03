package apnacollege;
import java.util.*;

public class C4_inputs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        // String name = sc.next();     //takes only one word.
        String name = sc.nextLine();
        System.out.println("Your string is : " + name);
        System.out.print("Enter a integer number : ");
        int a = sc.nextInt();
        System.out.println("Your integer number is : " + a);
        System.out.print("Enter a float number : ");
        float f = sc.nextFloat();
        System.out.println("Your float number is  : " + f);
        System.out.print("Enter a double number : ");
        double d = sc.nextDouble();
        System.out.println("Your double number is : " + d);
        sc.close();
    }
}