package apnacollege;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class C64_TimerTask {
	public static void main(String[] args) {
		//Timer -> A facility for threads to schedule tasks for future execution in a background thread
		//TimerTask -> A task that can be scheduled for one time or repeated execution by a Timer
		
		String value = "arpit";
		
		Timer timer = new Timer();
		
		TimerTask timerTask = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("Task is completed");
				System.out.println(value);
			}
		};
		
//		timer.schedule(timerTask, 0);
//		timer.schedule(timerTask, 3000);		// 3000 is in milliseconds 3000 = 3seconds
		
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 2022);
		date.set(Calendar.MONTH, Calendar.NOVEMBER);
		System.out.println(Calendar.NOVEMBER);
		date.set(Calendar.DAY_OF_MONTH, 28);
		date.set(Calendar.MINUTE, 26);
		date.set(Calendar.SECOND, 0);
		date.set(Calendar.MILLISECOND, 0);
		
//		timer.schedule(timerTask, date.getTime());
		
//		timer.scheduleAtFixedRate(timerTask, 0, 2000);
		
		timer.scheduleAtFixedRate(timerTask, date.getTime(), 2000);
		
	}
}
