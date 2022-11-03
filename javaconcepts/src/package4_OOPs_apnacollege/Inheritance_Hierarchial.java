//Hierarchial Inheritance
package package4_OOPs_apnacollege;

class Shape3 {
	public void area() {
		System.out.println("Displays Area");
	}
}

class Triangle3 extends Shape3 {
	public void area(int b, int h) {
		System.out.println(1 / 2 * b * h);
	}
}

class Circle3 extends Shape3 { 
	public void area(int r) {
		System.out.println((float) 3.14 * r * r);
	}
}

public class Inheritance_Hierarchial {
	public static void main(String args[]) {
		Circle3 c1 = new Circle3();
		c1.area(4);
		c1.area();
	}
}
