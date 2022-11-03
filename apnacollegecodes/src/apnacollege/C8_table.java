package apnacollege;
import java.util.*;

public class C8_table {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
        sc.close();
    }
}