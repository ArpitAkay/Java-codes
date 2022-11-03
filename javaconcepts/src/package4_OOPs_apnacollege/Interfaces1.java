//Interfaces
package package4_OOPs_apnacollege;

interface Animals1 { 	// It cannot have constructor
						// It can have static methods
	void walk(); 		// It cannot have non-abstract methods
						// By default functions are abstract and public
						// All the fields in interfaces are public, static and final by default
	public static void func() {
		System.out.println("Hello World!");
	}
}

class Horse1 implements Animals1 {
	public void walk() {
		System.out.println("Horse walks on 4 legs");
	}
}

public class Interfaces1 {
	public static void main(String args[]) {
		Animals1.func();
	}
}
