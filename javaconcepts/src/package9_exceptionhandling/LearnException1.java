package package9_exceptionhandling;

public class LearnException1 {
	public static void main(String args[]) {
		int i,j,k = 0;
		i = 8;
		j = 0;
		try {
//			k = i/j;		//Critical Statement and this exception is unchecked exception.
			if(j>1) {
				System.out.println("business logic");
			}
			else {
				throw new Exception("J should be greater than 1");
			}
			
		}
		catch(Exception e) {
//			System.out.println("Cannot divide by zero " + e);
			e.printStackTrace();
		}
		System.out.println(k);
	}
}
