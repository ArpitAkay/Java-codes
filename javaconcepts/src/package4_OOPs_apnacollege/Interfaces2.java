//Interfaces and Multiple Inheritance
package package4_OOPs_apnacollege;

interface Animals2 {
	public void walk(); 		// By default abstract and public
}

interface Herbivore {

}

class Horse2 implements Animals2, Herbivore {
	public void walk() {
		System.out.println("Horse walks on 4 legs");
	}
}

public class Interfaces2 {
	public static void main(String args[]) {

	}
}
