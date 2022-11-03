package package9_exceptionhandling;

class DemoThrows {
	int i = 2, j = 0;
	public void checkmethod() throws ArithmeticException{
		System.out.println(i/j);
	}
}

public class LearnException9_throws {
	public static void main(String[] args) {
		DemoThrows dt = new DemoThrows();
		try {
			dt.checkmethod();			
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
