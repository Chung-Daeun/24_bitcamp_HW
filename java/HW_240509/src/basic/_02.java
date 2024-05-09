package basic;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class _02 {
	
//	2. Calendar 객체를 오늘날짜로 생성하세요.
//	   오늘날짜를 2023-03-24 형식으로 출력하세요.
//	   오늘날짜를 2023년 03월 24일 xx시 xx분 xx초 형식으로 출력하세요.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = new GregorianCalendar();
		
		System.out.println("결과: " + 
				 cal.get(Calendar.YEAR) + "-" + 
				((cal.get(Calendar.MONTH) + 1) < 10
						? "0" + (cal.get(Calendar.MONTH) + 1)
							: (cal.get(Calendar.MONTH) + 1)) + "-" +
						(cal.get(Calendar.DATE) < 10
							? "0" + cal.get(Calendar.DATE)
								: cal.get(Calendar.DATE))
							);
		
		System.out.println("결과: " + 
				 cal.get(Calendar.YEAR) + "년 " + 
				((cal.get(Calendar.MONTH) + 1) < 10
						? "0" + (cal.get(Calendar.MONTH) + 1)
							: (cal.get(Calendar.MONTH) + 1)) + "월 " +
					(cal.get(Calendar.DATE) < 10
						? "0" + cal.get(Calendar.DATE)
							: cal.get(Calendar.DATE)) + "일 " +
					 cal.get(Calendar.HOUR_OF_DAY) + "시 " +
					 cal.get(Calendar.MINUTE) + "분 " + 
					 cal.get(Calendar.SECOND) + "초"
							);
	}

}
