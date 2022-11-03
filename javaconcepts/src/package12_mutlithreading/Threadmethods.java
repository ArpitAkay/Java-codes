package package12_mutlithreading;

class MythreadNew1 extends Thread {
	
	public void run() {
//		int i = 0;
//		while(i<40000) {
//			System.out.println("I am thread ");
//			i++;
//		}
		
		while(true) {
			System.out.println("I am thread");
			try {
				Thread.sleep(10000);		//milliseconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("hello");
		}
	}
}

class MythreadNew2 extends Thread {
	
	public void run() {
		while(true) {
			System.out.println("I am thread t2");
//			break;
		}
	}
}


public class Threadmethods {
	public static void main(String[] args) {
		MythreadNew1 t1 = new MythreadNew1();
		MythreadNew2 t2 = new MythreadNew2();
		t1.start();
//		try {
//			t1.join();		//t2 will run only when t1 is fully finished.
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}		
//		t2.start();
	}
}
