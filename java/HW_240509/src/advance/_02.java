package advance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class _02 {
//	2. 사용자가 두 개의 날짜(yyyy-MM-dd 형식)를 입력하고 입력받은
//    두 날짜 사이의 날짜를 모두 출력하세요. (Calendar 클래스를 사용하세요).
//    ex) 2023-01-29 2023-02-05 입력
//	출력       2023-01-29
//             2023-01-30
//             2023-01-31
//             2023-02-01
//             2023-02-02
//             2023-02-03
//             2023-02-04
//             2023-02-05

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal1 = new GregorianCalendar();
		Calendar cal2 = new GregorianCalendar();
		
		System.out.println("날짜를 2개 입력하시오.(yyyy-MM-dd)");
		
		try {
			cal1.setTime(sdf.parse(sc.nextLine()));
			cal2.setTime(sdf.parse(sc.nextLine()));
			
			long diff = cal1.getTimeInMillis() - cal2.getTimeInMillis();
			
			for(int i = 0; i <= Math.abs(diff / 1000 / 60 / 60 / 24); i++) {
				
				// 둘이 같을 수도 있다는 생각을 못했다!!!세상에나
				if(diff > 0) {
					System.out.println(sdf.format(cal2.getTimeInMillis()));	//format의 매개변수는 Date가 맞는데 Date가 long을 입력받아 생성되므로 long을 줘도 알아서 Date로 변환해줌.
					cal2.add(Calendar.DATE, 1);
				} else if(diff < 0 ){
					System.out.println(sdf.format(cal1.getTimeInMillis()));
					cal1.add(Calendar.DATE, 1);
				} else {
					System.out.println("같은날 입니다.");
				}
				
			}
			
			sc.close();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
