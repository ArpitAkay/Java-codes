package package9_exceptionhandling;

public class LearnException2 {
	public static void main(String args[]) {
		int i, j, k = 0;
		i = 8;
		j = 2;
		
		int arr[] = new int[4];
		try {
			k = i / j; // Critical Statement and this exception is unchecked exception.
			for(int c=0; c<4; c++) {
				arr[c] = c+1;
			}
			
			for(int value : arr) {
				System.out.print(value + " ");
			}
			System.out.println();
		} 
		catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero " + e);
		}
		catch(ArrayIndexOutOfBoundsException e) {		//We can have multiple catch with one try.
			System.out.println("Maximum number of values an array can store is 4 " + e );
		}
		catch(Exception e) {
			System.out.println("Unknown Exception");
		}
		System.out.println(k);
	}
}
