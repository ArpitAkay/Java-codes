package apnacollege;
import java.util.*;

public class C30_linearsearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of array : ");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array :");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number you want to search in array : ");
        int num;
        num = sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i] == num){
                System.out.println("index : " + i);
                System.out.println("number : " + arr[i]);
            }
        }
        sc.close();
    }
}