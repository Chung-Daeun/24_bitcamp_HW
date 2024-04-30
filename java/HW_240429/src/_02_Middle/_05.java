package _02_Middle;

public class _05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5. 20개 배열을 선언하세요.
//	    20개의 값을 난수를 이용해서 0 ~ 100까지의 값으로 채워넣고
//	    인덱스의 홀수번째는 앞에서부터 출력하고
//	    짝수번째는 뒤에서부터 출력하세요.

		int[] ranArr = new int[20];
		
		System.out.println("원래 배열");
		for(int i = 0; i < ranArr.length; i++) {
			ranArr[i] = (int)(Math.random() * 101);
			System.out.print(ranArr[i] + " ");
		}
		System.out.println();
		
		System.out.println("조건에 맞춰 출력");
		for(int i = 0; i < ranArr.length; i++) {
			if(i % 2 == 0)
				System.out.print(ranArr[ranArr.length - 2 - i] + " ");
			else
				System.out.print(ranArr[i] + " ");
		}
	}

}
