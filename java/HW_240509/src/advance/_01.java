package advance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class _01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = new GregorianCalendar();
		
		try {
			cal.setTime(sdf.parse("2001-12-19"));
			for (int i = 2001; i < 2022; i++) {
				if(leapYear(i)) {
					cal.add(Calendar.DATE, 1);
				}
				cal.add(Calendar.YEAR, 1);
			}
			System.out.println(sdf.format(cal.getTimeInMillis()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	static boolean leapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}
