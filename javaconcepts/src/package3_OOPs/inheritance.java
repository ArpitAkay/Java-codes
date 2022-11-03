package package3_OOPs;

//Textual representation how an object will look like in the memory. 
//Whatever we write in class is in actual the property of object as we are describing the object.
class Product {
	Product(){
		System.out.println("Product object constructor");
	}
	
	int pid;
	String name;
	int price;
	
	void setProductDetails(int pid, String name, int price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
	
	void showProductDetails() {
		System.out.println("Product ID    : " + this.pid);
		System.out.println("Product Name  : " + this.name);
		System.out.println("Product Price : " + this.price + "Rs");
	}
}

class Mobile extends Product {
	Mobile(){
		System.out.println("Mobile object constructor");
	}
	
	String os;
	int ram;
	int sdCardSize;
	
	
	//Method Overloading : Same method name with different inputs.
	void setProductDetails(int pid, String name, int price, String os, int ram, int sdCardSize) {
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.os = os;
		this.ram = ram;
		this.sdCardSize = sdCardSize;
	}
	
	//Method Overriding : Same method name with same inputs in parent child relationship.
	void showProductDetails() {
		System.out.println("Product ID               : " + this.pid);
		System.out.println("Product Name             : " + this.name);
		System.out.println("Product Price            : " + this.price + "Rs");
		System.out.println("Product Operating System : " + this.os);
		System.out.println("Product                  : " + this.ram + "GB");
		System.out.println("SD Card Size             : " + this.sdCardSize + "GB");
	}
	
}


public class inheritance {
	public static void main(String args[]) {
//		p is not an object its a reference variable which holds the hashcode of the object in hexadecimal notation.
		Product p1 = new Product();
		p1.setProductDetails(1, "Mobile", 2000);
		p1.showProductDetails();
		Product p2 = new Product();
		p2.pid = 2;
		p2.name = "Iphone XR";
		p2.price = 72000;
		p2.showProductDetails();
		
		Mobile m1 = new Mobile();
		m1.setProductDetails(3, "Iphone 13", 83000, "Ios", 4, 16);
		m1.showProductDetails();
		
		
	}
}
