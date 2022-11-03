package apnacollege;
import java.util.*;

public class C5_sumof2numbes {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter first number : ");
        a = sc.nextInt();
        System.out.print("Enter second number : ");
        b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of 2 numbers is = "+ sum);
        sc.close();
    }
}