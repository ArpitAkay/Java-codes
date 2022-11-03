//Inheritance
package package4_OOPs_apnacollege;

class Shape {
	String color;
}

class Triangle extends Shape {
	public void getvalue() {
		System.out.println(color);
	}
}

public class Inheritance {
	public static void main(String args[]) {
		Triangle t1 = new Triangle();
		t1.color = "red";
		t1.getvalue();
	}
}
