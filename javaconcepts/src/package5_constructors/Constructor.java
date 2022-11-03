package package5_constructors;

public class Constructor {
	private String name;
	Constructor(){											//Default Constructor.
		System.out.println("This is default constructor");
		System.out.println();
	}
	
	Constructor(String name){								//Parameterized Constructor.
		this.name = name;
		System.out.println(this.name);
		System.out.println("This is parameterzied constructor");
		System.out.println();
	}
	
	Constructor(Constructor c){								//Copy Constructor.
		this.name = c.name;
		System.out.println(this.name);
		System.out.println("This is copy constructor");
	}
	
	public static void main(String[] args) {
		Constructor constructor1 = new Constructor();
		Constructor constructor2 = new Constructor("Arpit Kumar");
		Constructor constructor3 = new Constructor(constructor2);
	}
}
