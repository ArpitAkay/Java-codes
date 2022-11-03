package apnacollege;
import java.util.*;

public class C19_ifelsequestion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            int n;
            System.out.print("Enter a number 0 or 1 : ");
            n = sc.nextInt();
            if(n == 0){
                break;
            }
            else if(n == 1){
                int marks;
                System.out.print("Enter your marks : ");
                marks = sc.nextInt();
                if(marks >= 90){
                    System.out.println("This is good");
                }
                else if(marks<=89 && marks>=60){
                    System.out.println("This is also good");
                }
                else if(marks<=59 && marks>=0){
                    System.out.println("This is good as well");
                }
                else{
                    System.out.println("Please enter valid marks");
                }
            }
            else{
                System.out.println("Please enter a number 0 or 1");
            }
        }while(true);
        sc.close();
    }
}