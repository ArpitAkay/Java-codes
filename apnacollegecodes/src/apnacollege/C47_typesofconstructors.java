package apnacollege;
class Student {
	String name;
	int age;
	public Student(String name, int age) {		//parameterised constructor
		this.name = name;
		this.age = age;
	}
	
	public Student(Student s) {		//copy constructor
		this.name = s.name;
		this.age = s.age;
	}
	
	public Student() {		//default constructor
		
	}
	
	public void getvalue() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
	
}
public class C47_typesofconstructors {
	public static void main(String args[]) {
		Student s1 = new Student("Arpit Kumar",22);
		s1.getvalue();
		Student s2 = new Student(s1);
		s2.getvalue();
	}
}
