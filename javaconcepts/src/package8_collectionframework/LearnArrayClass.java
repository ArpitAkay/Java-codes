//This class help to manipulate simple array.
package package8_collectionframework;

import java.util.Arrays;
import java.util.Scanner;

public class LearnArrayClass {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter the Size of the array : ");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter your array : ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		Arrays.fill(arr, 12);	//Fills 12 everywhere in the array.

		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.print("Enter the number you want to search in the array : ");
		int num = sc.nextInt();
		
		
		int index = Arrays.binarySearch(arr, num);		//binary search works only sorted arrays.
		System.out.println("The index " + num + " is " + index);
		sc.close();
		
	}
}
