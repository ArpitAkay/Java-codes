package apnacollege;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C65_simpleDateFormat {
	public static void main(String[] args) throws ParseException {
		String date_s = "Dec 2, 2022, 6:22:00 PM"; 
		SimpleDateFormat dt = new SimpleDateFormat("MMM dd, yyyy, hh:mm:ss a");
		System.out.println("Hello");
		Date date = dt.parse(date_s); 
		SimpleDateFormat dt1 = new SimpleDateFormat("dd-MM-yyyy hh:mm a");
		System.out.println(dt1.format(date));
	}
}
