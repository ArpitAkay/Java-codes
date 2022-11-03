package apnacollege;

import java.util.Date;

public class C60_test {
	
	public static void setTimeout(Runnable runnable, int delay){
	    new Thread(() -> {
	        try {
	            Thread.sleep(delay);
	            runnable.run();
	        }
	        catch (Exception e){
	            System.err.println(e);
	        }
	    }).start();
	}
	
	public static void main(String[] args) {
		setTimeout(() -> System.out.println("test"), 10000);
		
		System.out.println(new Date());
	}
}
