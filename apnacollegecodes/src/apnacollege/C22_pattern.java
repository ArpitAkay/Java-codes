package apnacollege;
import java.util.*;

public class C22_pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int m = 5;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i == 0 || i == n-1 || j == 0 || j == m-1){
                    System.out.print("*" + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}