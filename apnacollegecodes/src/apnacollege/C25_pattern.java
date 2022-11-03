package apnacollege;
import java.util.*;

public class C25_pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 4;
        // int m = 5;
        for(int i=0; i<n; i++){
            for(int j=n-1; j>=0; j--){
                if(j>i){
                    System.out.print("  ");
                }
                    // System.out.print("*" + " ");
            }
            for(int k=0; k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}