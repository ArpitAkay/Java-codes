//Single Inheritance
package package4_OOPs_apnacollege;

class Shape1 {
	public void area() {
		System.out.println("Displays Area");
	}
}

class Triangle1 extends Shape1 {
	public void area(int b, int h) {
		System.out.println((float)1/2 * b * h);
	}
}
public class Inheritance_SingleLevel {
	public static void main(String args[]) {
		Triangle1 t1 = new Triangle1();
		t1.area(4, 8);
		t1.area();
	}
}
