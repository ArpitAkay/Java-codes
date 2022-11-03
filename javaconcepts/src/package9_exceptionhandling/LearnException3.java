package package9_exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class LearnException3 {
	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i,j = 1,k = 0;
		i = 8;
		try {
			System.out.print("Enter a number : ");
			j = Integer.parseInt(br.readLine());		//Checked Exception.
			k = i/j;		
			System.out.println("Output is : " + k);
		}
		catch(IOException e) {
			System.out.println(" jhigv " + e);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero " + e);
		}
		catch(Exception e) {
			System.out.println("Unknown Exception");
		}
		finally {
			System.out.println("Byee!!");
		}
//		sc.close();
	}
}
