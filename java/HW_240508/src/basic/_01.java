package basic;

import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사용자가 문자열 3개를 입력하고 그 문자열을 합쳐서 출력하세요(StringBuffer 사용).

		Scanner sc = new Scanner(System.in);
		
		StringBuffer sb = new StringBuffer("");
		
		System.out.println("문자열 3개를 입력하시오.");
		
		for(int i = 0; i < 3; i++) {
			sb.append(sc.nextLine());
		}
		
		System.out.println(sb);
		
		sc.close();
	}

}
