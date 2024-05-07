package basic;

import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		String str = sc.next();
		
		int coutG = 0;
		int coutB = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '가') {
				coutG++;
			} else if(str.charAt(i) == '바') {
				coutB++;
			}
		}
		
		if (coutB == 0 && coutG == 0) {
			System.out.println("'가, 바가 존재하지 않습니다.");
		} else {
			System.out.println("'가': " + coutG + "개, '바': " + coutB + "개");
		}
		
		sc.close();
	}

}
