package assignment1;

public class Test {
	public String name = "Geekyants123";
	private Test() {
		// private constructor
		System.out.println(name);
	}
	
	public static Test instance() {
		return new Test();
	}
	
	public void getname() {
		System.out.println("Arpit Kumar");
	}
}
