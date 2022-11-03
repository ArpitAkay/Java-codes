//interfaces
package apnacollege;

interface Animals1 {
	public void walk();		//by default abstract and public
}

class Horse1 implements Animals1{
	public void walk() {
		System.out.println("Horse walks on 4 legs");
	}
}

public class C54_interfaces {
	public static void main(String args[]) {
		Animals1 animals1 = new Horse1();
		animals1.walk();
	}
}
