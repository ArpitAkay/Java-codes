package apnacollege;
import java.util.*;

public class C20_primenumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        int flag = 0;
        System.out.print("Enter any number : ");
        n = sc.nextInt();
        for(int i=2; i<=n/2; i++){
            if(n%2==0){
                flag =1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
        sc.close();
    }
}