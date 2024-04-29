package _01_Basic;

public class _11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		11. int 배열로 10개의 공간을 생성하세요.
//		  1 ~ 10까지의 임의의 수를 저장하고
//		  홀수만 골라서 출력하세요.

		int[] intArr = {5, 8, 9, 2, 3, 7, 5, 2, 1, 8};
		
		for (int i = 0; i < intArr.length; i++) {
			if(intArr[i] % 2 == 1)
				System.out.println(intArr[i]);
		}
	}

}
