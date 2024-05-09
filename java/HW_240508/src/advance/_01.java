package advance;

import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자 입력한 문자열에서 연속된 동일한 문자를 찾고
//	     연속된 동일한 문자를 발견했을 때 하나빼고 다 제거하여
//	     출력하세요. (단, 대소문자 구분함. StringBuilder를 사용하세요.)
//	     ex) aabbcdeffaaaaynguuuuuu -> abcdefayngu

		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		StringBuilder sb = new StringBuilder(sc.nextLine());
		
		for (int i = 0; i < sb.length() - 1; i++) {
			if(sb.charAt(i + 1) == sb.charAt(i)) {
				sb.deleteCharAt(i + 1);
				i--;
			}
		}
		
		System.out.println("연속된 중복제거!");
		System.out.println(sb);
		
		sc.close();
	}

}




