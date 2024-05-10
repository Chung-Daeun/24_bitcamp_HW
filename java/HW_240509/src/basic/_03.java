package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03 {
	
//	3. 정수형 데이터를 저장할 수 있는 ArrayList를 생성하고 사용자가 입력한 5개의 정수를 저장하고 출력하세요.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> arrInt = new ArrayList<Integer>();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("정수를 입력하시오.");
			arrInt.add(sc.nextInt());
		}
		
		System.out.println(arrInt);
		sc.close();
	}

}
