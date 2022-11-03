//interfaces
package apnacollege;

interface Animals2 {
	public void walk();		//by default abstract and public
}

interface Herbivore {
	
}

class Horse2 implements Animals2,Herbivore{
	public void walk() {
		System.out.println("Horse walks on 4 legs");
	}
}

public class C55_interfaces {
	public static void main(String args[]) {
		
	}
}
