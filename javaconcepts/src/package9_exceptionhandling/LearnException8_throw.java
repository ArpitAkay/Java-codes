package package9_exceptionhandling;

class DemoThrow {
	String content;
	
	public void driving(String c) {
		this.content = "";
		if(this.content.isEmpty()) {
			throw new NullPointerException("Content is empty");
		}
		else {
			System.out.println("Content : " + content);
		}
	}
}
public class LearnException8_throw {
	public static void main(String[] args) {
		DemoThrow dt = new DemoThrow();
		dt.driving("Yes");
		
	}
}
