package middle;

import java.util.Scanner;

public class _03 {
//	3. 매개변수로 받아온 정수 배열에서 최대값, 최소값, 중간값을 구하는 static 메소드 
//	getMax, getMin, getMid를 갖는 클래스 IntArrUtils를 구현하고 
//	maxOrMinOrMid라는 메소드를 갖는 함수형 인터페이스 MaxMinMid를 만들고 람다식으로 IntArrUtils의 메소드를 참조하여 구현하세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start((arr, mode) -> {
			mode.equals("max")
				?
					
		})
	}
	
	public static void start(MaxMinMid maxMinMid) {
		int[] numArr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("다음 중 원하는 것을 고르시오.(max, min, mid): ");
		String mode = sc.next();
		
		sc.close();
	}

}
