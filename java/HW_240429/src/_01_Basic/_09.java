package _01_Basic;

public class _09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		9. int 10개짜리 배열 생성하여
//		 int배열에 3의 배수를 차례대로 저장하세요.
//		 그리고 거꾸로 출력하세요.

		int[] intArr = new int[10];
		
		for(int i = 1; i <= 10; i++)
			intArr[i - 1] = 3 * i;
		
		for(int i = 0; i < intArr.length; i++)
			System.out.println(intArr[intArr.length - 1 - i]);
		
	}

}
