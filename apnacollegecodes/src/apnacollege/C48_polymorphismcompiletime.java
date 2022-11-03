//function overloading(compile time polymorphism)
package apnacollege;
public class C48_polymorphismcompiletime {
	String name;
	int age;
	
	public void getvalue(int age) {
		System.out.println("Age is : " + age);
	}
	
	public void getvalue(String name) {
		System.out.println("Name is : " + name);
	}
	
	public void getvalue(int age, String name) {
		System.out.println("Age is : " + age);
		System.out.println("Name is : " + name);
	}
	public static void main(String[] args) {
		C48_polymorphismcompiletime obj1 = new C48_polymorphismcompiletime();
		obj1.name = "Arpit Kumar";
		obj1.age = 22;
		obj1.getvalue(obj1.age);
		obj1.getvalue(obj1.name);
		obj1.getvalue(obj1.age, obj1.name);
	}

}
