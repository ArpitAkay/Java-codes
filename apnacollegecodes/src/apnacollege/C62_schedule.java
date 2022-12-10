package apnacollege;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class C62_schedule {
	private static class MyTimeTask extends TimerTask
	{
		private String fcm;
		private Timer timer;
		
		public MyTimeTask(String fcm, Timer timer) {
			this.fcm = fcm;
			this.timer = timer;
		}
		
	    public void run()
	    {
	        System.out.println("Hello World");
	        System.out.println(fcm);
	        timer.cancel();
	    }
	    
	}

	public static void main(String[] args) throws ParseException {
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//	    Date date = dateFormatter.parse("2022-Nov-28 11:58:00.0");
	    Date date = dateFormatter.parse("2022-11-30 19:32:00.000000");
		
		System.out.println(date);
		
		Calendar cal = Calendar.getInstance();
		// remove next line if you're always using the current time.
		cal.setTime(date);
		cal.add(Calendar.MINUTE, -30);
		Date oneHourBack = cal.getTime();
		
		System.out.println(oneHourBack);
		
		
	    //the Date and time at which you want to execute
//	    DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
//	    Date date = dateFormatter.parse("2022-11-26 10:00:00 am");

	    //Now create the time and schedule it
	    Timer timer = new Timer();

	    //Use this if you want to execute it once
	    timer.schedule(new MyTimeTask("fbxksdjbf", timer), oneHourBack);
	    
	    System.out.println("---------");

	    //Use this if you want to execute it repeatedly
	    //int period = 10000;//10secs
	    //timer.schedule(new MyTimeTask(), date, period );
	}
}
