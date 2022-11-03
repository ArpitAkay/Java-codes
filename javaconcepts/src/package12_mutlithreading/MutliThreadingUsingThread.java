package package12_mutlithreading;

class MyThread1 extends Thread {
	@Override
	public void run() {
		int i = 0;
		while(i<40000) {
			System.out.println("My thread1 is running");
			System.out.println("I am happy");
			i++;
		}
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		int i = 0;
		while(i<40000) {
			System.out.println("My thread2 is running");
			System.out.println("I am sad");
			i++; 
		}
	}
}

public class MutliThreadingUsingThread {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.start();		//To start we have to use start() and start() method internally calls run() method.
		t2.start();		//To start we have to use start() and start() method internally calls run() method.
		

	}
}
