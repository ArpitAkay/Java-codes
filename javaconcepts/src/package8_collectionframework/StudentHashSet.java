package package8_collectionframework;

import java.util.HashSet;
import java.util.Set;

public class StudentHashSet {
	public static void main(String args[]) {
		Set<Student> studentSet = new HashSet<Student>();
		
		studentSet.add(new Student("Arpit Kumar", 24));
		studentSet.add(new Student("Ayush Agarwal", 25));
		studentSet.add(new Student("Yashraj Anand", 26));
		studentSet.add(new Student("Ankit Kumar", 24));
		
		Student s1 = new Student("Arpit Kumar", 2);
		Student s2 = new Student("Aditya Kumar", 2);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(studentSet);
	}
}
