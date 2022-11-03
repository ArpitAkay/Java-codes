package apnacollege;
import java.util.*;

public class C16_sumofnnaturalnumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int n;
        System.out.print("Enter any number : ");
        n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println();
        System.out.println("Sum of first n natural numbers : " + sum);
        sc.close();
    }
}