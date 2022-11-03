package apnacollege;
import java.util.*;

public class C17_printevennumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter any number : ");
        n = sc.nextInt();
        for(int i=0;i<=n;i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        sc.close();   
    }
}