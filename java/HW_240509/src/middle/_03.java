package middle;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class _03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String time1 = "2023-03-15 20:31:45";
		String time2 = "2021-07-08 11:58:04";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			long diff = sdf.parse(time1).getTime() - sdf.parse(time2).getTime();	// getTime(): Date -> long
			
			long hour = diff / 1000 / 60 / 60;
			diff %= (1000 * 60 * 60);
			long min = diff / 1000 / 60;
			diff %= (1000 * 60);
			long sec = diff / 1000;
			
			System.out.println(hour + "시간 " + min + "분 " + sec + "초");
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
