package _01_Basic;

public class _01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. int num = 10;을 선언하고 증감연산자를 통해 다음과 같이 출력하세요. 출력된 값은 모두 증감연산자가 포함된 상태입니다.
//	    11
//	    12
//	    12
//	    10
//	    10
//	     8
		
		int num = 10;
		System.out.println(++num); 	// num: 11, 출력: 11
		System.out.println(++num); 	// num: 12, 출력: 12
		System.out.println(num--); 	// num: 11, 출력: 12
		System.out.println(--num); 	// num: 10, 출력: 10
		System.out.println(num--); 	// num: 9, 출력: 10
		System.out.println(--num); 	// num: 8, 출력: 8

	}

}
