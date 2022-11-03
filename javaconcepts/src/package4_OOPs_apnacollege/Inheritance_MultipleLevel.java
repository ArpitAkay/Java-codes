//Multiple Level Inheritance
package package4_OOPs_apnacollege;

class Shape2 {
	public void area() {
		System.out.println("Displays Area");
	}
}

class Triangle2 extends Shape2 {
	public void area(int b, int h) {
		System.out.println((float) 1 / 2 * b * h);
	}
}

class EquilateralTraingle2 extends Triangle2 {
	public void area(int b, int h) {
		System.out.println((float) 1 / 2 * b * h);
	}
}

public class Inheritance_MultipleLevel {
	public static void main(String args[]) {
		EquilateralTraingle2 e1 = new EquilateralTraingle2();
		e1.area(4, 8);
		e1.area();
	}
}
