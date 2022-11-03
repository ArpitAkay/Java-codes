//User Defined Exception
package package9_exceptionhandling;

public class LearnException7 {
	public static void main(String[] args) {
		int i = 5;
		try {
			if(i<10) {
				throw new MyException("Error");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

class MyException extends Exception {
	public MyException(String str) {
		super(str);
	}
}