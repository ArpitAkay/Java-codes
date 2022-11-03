//Suppress Error
package package9_exceptionhandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LearnException5 {
	public static void main(String args[]) throws Exception
	{
		int i,j = 1,k = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		i = 8;
		System.out.print("Enter a number : ");
		j = Integer.parseInt(br.readLine());		//Checked Exception.
		k = i + j;		
		System.out.println("Output is : " + k);
	}
}
