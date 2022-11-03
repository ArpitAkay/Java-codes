package package12_mutlithreading;

class Mythread extends Thread {
	public Mythread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println("I am thread");
//		while(true) {
//			System.out.println("I am thread");
//		}
	}
}
public class MutliThreadingusingvariousconstructors {
	public static void main(String[] args) {
		Mythread t1 = new Mythread("Arpit Kumar");
		Mythread t2 = new Mythread("Aditya Kumar");
		t1.start();
		System.out.println("The id of thread is : " + t1.getId());
		System.out.println("The name of thread is : " + t1.getName());
		t2.start();
		System.out.println("The id of thread is : " + t2.getId());
		System.out.println("The name of thread is : " + t2.getName());
	}
}
