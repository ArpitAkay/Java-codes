package apnacollege;

import java.util.Timer;
import java.util.TimerTask;

public class C66_settimeout {
	public static void main(String[] args) {
		setTimeout(() -> System.out.println("test"), 4000);
		
		setInterval();
	}
	
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
	
	public static void setInterval() {
		new Timer().scheduleAtFixedRate(new TimerTask(){
		    @Override
		    public void run(){
		       System.out.println("jjkbd");
		    }
		},3000,5000);
	}
}
