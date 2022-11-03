package package12_mutlithreading;

class Mythreadrunnable3 implements Runnable {
	public void run() {
		System.out.println("I am thread");
	}
}

class Mythreadrunnable4 implements Runnable {
	public void run() {
		System.out.println("I am thread");
	}
}

public class MutliThreadingusingvariousrunnableconstructors {
	public static void main(String[] args) {
		Mythreadrunnable3 t1 = new Mythreadrunnable3();
		Thread t11 = new Thread(t1, "Arpit Kumar");
		t11.start();
		System.out.println("The id of thread is : " + t11.getId());
		System.out.println("The name of thread is : " + t11.getName());
		
		Mythreadrunnable4 t2 = new Mythreadrunnable4();
		Thread t22 = new Thread(t2, "Aditya Kumar");
		t22.start();
		System.out.println("The id of thread is : " + t22.getId());
		System.out.println("The name of thread is : " + t22.getName());
		
		
	}
}
