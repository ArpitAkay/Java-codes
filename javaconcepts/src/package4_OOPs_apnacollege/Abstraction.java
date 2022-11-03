//Abstraction 
package package4_OOPs_apnacollege;

abstract class Animals {		// It can have both abstract and non-abstract methods
	abstract void walk();		// This method can be public or protected.
								// It can have constructor as well as static methods
								// It can have final method also
	public Animals() {
		System.out.println("You have created animals contructor");
	}

	public void eat() {
		System.out.println("Animal Eats");
	}
}

class Horse extends Animals {
	public Horse() {
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

public class Abstraction {
	public static void main(String args[]) {
		Horse h = new Horse();
		h.walk();
		h.eat();
	}
}
