package apnacollege;
import java.util.*;

public class C34_bubblesort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter size of array : ");
        size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter your array : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array : ");
        int temp;
        for(int i=0; i< arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}