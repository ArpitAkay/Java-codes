package apnacollege;
import java.util.*;

public class C23_pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 4;
        // int m = 5;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                    System.out.print("*" + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}