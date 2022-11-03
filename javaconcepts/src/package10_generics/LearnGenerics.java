package package10_generics;

import java.util.ArrayList;


class MyGenerics<T1, T2> {
	int value;
	private T1 t1;
	private T2 t2;
	
	public MyGenerics(int value, T1 t1, T2 t2) {
		this.value = value;
		this.t1 = t1;
		this.t2 = t2;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public T1 getT1() {
		return t1;
	}

	public void setT1(T1 t1) {
		this.t1 = t1;
	}

	public T2 getT2() {
		return t2;
	}

	public void setT2(T2 t2) {
		this.t2 = t2;
	}
}

public class LearnGenerics {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("Arpit");
		list.add(54);
		list.add(45);
		System.out.println(list);
		
		String a = (String)list.get(0);
		System.out.println(a);
		
		MyGenerics<String, Integer> g1 = new MyGenerics<String, Integer>(23, "My name is Arpit Kumar", 34);
		String str = g1.getT1();
		System.out.println(str);
		
		int age = g1.getT2();
		System.out.println(age);
	}
}
