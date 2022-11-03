package apnacollege;
//For-each statement

import java.util.*;

public class C44_forEachloop {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size;
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Your array : ");
		for(int num : arr) {
			System.out.print(num + " ");
		}
		sc.close();
	}
}