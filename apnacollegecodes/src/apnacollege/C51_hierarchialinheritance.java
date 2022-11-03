//Hierarchial Inheritance
package apnacollege;

class Shape2 {
	public void area() {
		System.out.println("Displays Area");
	}
}

class Triangle2 extends Shape2 {
	public void area(int b,int h) {
		System.out.println(1/2*b*h);
	}
}

class Circle2 extends Shape2 {
	public void area(int r) {
		System.out.println((float)3.14*r*r);
	}
}


public class C51_hierarchialinheritance {
	public static void main(String args[]) {
		Circle2 c1 = new Circle2();
		c1.area(4);
		c1.area();
	}
}