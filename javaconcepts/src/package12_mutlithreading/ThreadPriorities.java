package package12_mutlithreading;

class MythreadPriority extends Thread {
	public MythreadPriority(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("I am thread " + this.getName());
//			System.out.println("I am thread");
		}
	}
}
public class ThreadPriorities {
	public static void main(String[] args) {
		MythreadPriority t1 = new MythreadPriority("Arpit Kumar");
		MythreadPriority t2 = new MythreadPriority("Aditya Kumar");
		MythreadPriority t3 = new MythreadPriority("Ayush Agarwal");
		MythreadPriority t4 = new MythreadPriority("Atul Patel");
		MythreadPriority t5 = new MythreadPriority("Yashraj Anand (Most important)");
		t5.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t4.setPriority(Thread.MIN_PRIORITY);		//There is also NORM_PRIORITY = 5, MIN_PRIORITY = 1, MAX_PRIORITY = 10, default priority is NORM_PRIORITY 
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
