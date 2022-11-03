//Abstraction 
package apnacollege;

abstract class Animals {
	public Animals(){
		System.out.println("You have created animals contructor");
	}
	abstract void walk();
	public void eat() {
		System.out.println("Animal Eats");
	}
}

class Horse extends Animals {
	public Horse(){
		System.out.println("You have created new horse");
	}
	public void walk() {
		System.out.println("Walks on 4 legs");
	}
}

class Chicken extends Animals {
	public void walk() {
		System.out.println("Walks on 2 legs");
	}
}


public class C53_abstraction {
	public static void main(String args[]) {
		Horse h = new Horse();
		h.walk();
		h.eat();
	}
}
