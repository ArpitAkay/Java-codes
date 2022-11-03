//Single Inheritance and Multiple Level Inheritance
package apnacollege;

class Shape1 {
	public void area() {
		System.out.println("Displays Area");
	}
}

class Triangle1 extends Shape1 {
	public void area(int b,int h) {
		System.out.println(1/2*b*h);
	}
}

class EquilateralTraingle1 extends Triangle1 {
	public void area(int b,int h) {
		System.out.println((float)(0.5)*b*h);
	}
}


public class C50_singleandmultilevelinheritance {
	public static void main(String args[]) {
		EquilateralTraingle1 e1 = new EquilateralTraingle1();
		e1.area(4,8);
		e1.area();
	}
}