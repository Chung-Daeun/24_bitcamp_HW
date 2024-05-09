package middle;

import java.util.Calendar;
//import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class _01 {
	
//	1. 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에 add 메소드로 3일뒤로 변경하고
//    yyyy-MM-dd 형식으로 출력하세요. (SimpleDateFormat 클래스 사용. SimpleDateFormat의
//    parse() 메소드를 이용하면 String -> Calendar로 변환가능)


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("날짜를 입력하시오.(yyyy-MM-dd)");
		String day = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = new GregorianCalendar();
		
		// throw된 상태로 작성되어 있어서 챙겨줘야함.
		try {
//			Date d = sdf.parse(day);
//			System.out.println(d);
			System.out.println(sdf.parse(day));
			cal.setTime(sdf.parse(day));	// parse로 date로 변환, setTime으로 Calendar 변환
//			System.out.println(cal);
			cal.add(Calendar.DATE, 3);
//			System.out.println(cal);
			System.out.println(sdf.format(cal.getTimeInMillis())); // .format(date) -> .getTimeInMillis() long으로 나오는데 .format에 넣으면 시간관련해서 바꿔서 리턴해줌.
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		sc.close();
	}

}
