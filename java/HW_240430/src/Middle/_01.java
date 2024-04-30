package Middle;

import Basic._04;

public class _01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. int 배열 한 개를 매개변수로 받아서 역순으로 저장된 새로운 배열을 리턴하는 메소드를 구현하세요.  
//		실행클래스의 메인메소드 아래에 static 메소드로 선언하세요. static의 위치는 접근제어자와 리턴타입 사이입니다. 
//		(예시 public static void add(int a, int b) { return a + b; })

		int[] arr = {1, 2, 3, 4, 5};
		
		_04.printArr(reverseArr(arr));
		
		
	}
	
	public static int[] reverseArr(int[] intArr) {
		
		int[] ansArr = new int[intArr.length];
		
		int j;
		for(int i = intArr.length - 1; i >= 0; i--) {
			j = intArr.length - 1 - i;
			ansArr[j] = intArr[i];
		}
		
		return ansArr;
		
	}

}
