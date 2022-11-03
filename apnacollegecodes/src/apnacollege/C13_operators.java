package apnacollege;
import java.util.*;

public class C13_operators {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter first number : ");
        num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("Sum : " + sum);
        int diff = num1 - num2;
        System.out.println("Difference : " + diff);
        int mul = num1*num2;
        System.out.println("Multiplication : " + mul);
        float div = (float)num1/num2;
        System.out.println("Division : " + div);
        int rem = num1 % num2;
        System.out.println("Remainder : " + rem);
        sc.close();
    }
}