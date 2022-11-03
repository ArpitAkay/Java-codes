package package8_collectionframework;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private String name;
	private int rollno;
	
	public Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}

	@Override
	public int hashCode() {		//Hashcode is now generate on the basis of roll number
		return Objects.hash(rollno);
	}

	@Override
	public boolean equals(Object obj) {		//Behind the scene hashset uses equals method to check the element that is already present in the set or not
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollno == other.rollno;
	}

	@Override
	public int compareTo(Student that) {		//This is made for StudentList.java
		return this.rollno - that.rollno;		//sort on the basis of role number 
//		return this.name.compareTo(that.name);	//sort on the basis of name
	}
}
