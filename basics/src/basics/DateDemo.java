package basics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("d/MM/yyyy");
		
		System.out.println(sdf.format(d));
		System.out.println(d);
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("hh:mm:ss");
	
		System.out.println(sd.format(cal.getTime()));
		System.out.println(cal.get(Calendar.AM_PM));

	}

}
