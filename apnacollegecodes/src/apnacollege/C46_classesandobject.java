package apnacollege;
class Pen {
	String color;
	String type;
	
	public void write() {
		System.out.println("Writing Something....");
	}
	
	public void getvalue() {
		System.out.println("Color : " + color);
		System.out.println("Type : " + type);
	}
}

public class C46_classesandobject {
	public static void main(String args[]) {
		Pen pen1 = new Pen();
		pen1.color = "blue";
		pen1.type = "gel pen";
		Pen pen2 = new Pen();
		pen2.color = "black";
		pen2.type = "ballpoint";
		pen1.getvalue();
		pen2.getvalue();
		
	}
}