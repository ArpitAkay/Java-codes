package package8_collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentList {
	public static void main(String[] args) {
		// For student class
		List<Student> studentlist = new ArrayList<Student>();
		studentlist.add(new Student("Arpit Kumar", 24));
		studentlist.add(new Student("Ayush Agarwal", 25));
		studentlist.add(new Student("Yashraj Anand", 26));
		studentlist.add(new Student("Ankit Kumar", 23));

		 System.out.println(studentlist);

		Collections.sort(studentlist); // will sort on the basis of what ever defined in compareTo in Student.java
		
		Collections.sort(studentlist, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.compareTo(o2);
			}
		});

		System.out.println(studentlist);

		Student s1 = new Student("Nishand Sheadge",27);
		Student s2 = new Student("Atul Kumar", 29 );

		System.out.println(s1.compareTo(s2));
	}
}
