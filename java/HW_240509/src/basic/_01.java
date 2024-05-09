package basic;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class _01 {
	
//	1. Calendar 객체를 오늘날짜로 생성하세요.
//	   객체의 날짜를 2020년 4월 8일로 변경하고 출력하세요.
//	   위의 객체의 날짜를 add 메소드를 이용해서 5년뒤 2달뒤 3일뒤(동시에)로 변경하고 출력하세요.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = new GregorianCalendar();
//		System.out.println("결과: " + 
//				cal.get(Calendar.YEAR) + "년 " + 
//				(cal.get(Calendar.MONTH) + 1) + "월 " +
//				cal.get(Calendar.DATE) + "일"
//					);
		
		cal.set(2020, 3, 8);
//		System.out.println("결과: " + 
//				cal.get(Calendar.YEAR) + "년 " + 
//				(cal.get(Calendar.MONTH) + 1) + "월 " +
//				cal.get(Calendar.DATE) + "일"
//					);
		
		cal.add(Calendar.YEAR, 5);
		cal.add(Calendar.MONTH, 2);
		cal.add(Calendar.DATE, 3);
		
		System.out.println("결과: " + 
				 cal.get(Calendar.YEAR) + "년 " + 
				(cal.get(Calendar.MONTH) + 1) + "월 " +
				cal.get(Calendar.DATE) + "일"
							);
		
	}

}
