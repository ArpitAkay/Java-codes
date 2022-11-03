package apnacollege;
import java.util.*;

public class C11_elseif {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.print("Enter two numbers : ");
        x = sc.nextInt();
        y = sc.nextInt();
        if(x>y){
            System.out.println(x + " is greater than " + y);
        }
        else if(x<y){
            System.out.println(x + " is less than " + y);
        }
        else{
            System.out.println(x + " is equal to " + y);
        }
        sc.close();
    }
}