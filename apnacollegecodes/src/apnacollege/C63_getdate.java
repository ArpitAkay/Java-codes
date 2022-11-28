package apnacollege;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class C63_getdate {
	public static void main(String[] args) throws ParseException {
		DateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
	    Date date = dateFormatter.parse("2022-11-26 22:23:50.0");
		
		System.out.println(date);
		
		Calendar cal = Calendar.getInstance();
		// remove next line if you're always using the current time.
		cal.setTime(date);
		cal.add(Calendar.MINUTE, -30);
		Date oneHourBack = cal.getTime();
		
		System.out.println(oneHourBack);
	}
}
