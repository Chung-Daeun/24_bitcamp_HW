package _01_Basic;

import java.util.Scanner;

public class _12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		12. 정수 10개를 입력받아 배열에 저장하고, 
//	    이 정수 중에서 2의 배수와 3의 배수를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		int[] intArr = new int[10];
		
		for(int i = 0; i < intArr.length; i++)
			intArr[i] = sc.nextInt();
		
		for(int i = 0; i < intArr.length; i++) { 
			if((intArr[i] % 2 == 0) || (intArr[i] % 3 == 0))
				System.out.print(intArr[i] + " ");
		}
		sc.close();
	}

}
