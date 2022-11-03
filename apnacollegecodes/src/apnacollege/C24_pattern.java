package apnacollege;
import java.util.*;

public class C24_pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 4;
        // int m = 5;
        for(int i=0; i<n; i++){
            for(int j=n-1; j>=i; j--){
                    System.out.print("*" + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}