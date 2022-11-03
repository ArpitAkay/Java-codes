package apnacollege;
import java.util.*;

public class C9_ifelse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter your age : "); 
        age = sc.nextInt();
        if(age>18){
            System.out.println("You're Adult");
        }
        else{
            System.out.println("You're not Adult");
        }
        sc.close();
    }
}