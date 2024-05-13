package advance;

import java.util.Scanner;

public class _01 {
//	1. 12달을 상수로 만들어서 enum을 선언하고 첫 번째 값은 평년일 때 그 달의 일수 두 번째 값은 윤년일 때 그 달의 일수로 설정하고 
//	사용자가 년도를 입력하면 해당 년도의 1, 2, 3, 4, 5월의 일수의 총합을 출력하는 메소드를 구현하세요. sumDays(int year)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Year year = Year.JAN;
		
		System.out.println("확인하고 싶은 연도를 입력하세요.");
		year.sumDays(sc.nextInt());
	}

}
