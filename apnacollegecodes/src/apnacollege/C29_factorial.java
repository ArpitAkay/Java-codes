package apnacollege;
import java.util.*;

public class C29_factorial {
    public static int calculateFactorial(int num){
        int f = 1;
        for(int i=2; i<=num; i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any numbers : ");
        int num;
        num = sc.nextInt();
        int factorial;
        factorial = calculateFactorial(num);
        System.out.println("Factorial : " + factorial);
        sc.close();
    }
}