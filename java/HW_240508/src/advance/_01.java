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
		
		for (int i = 1; i < sb.length(); i++) {
			for(int j = 0; j < i; j++) {
				if(sb.charAt(i) == sb.charAt(j)) {
					sb.deleteCharAt(i);
					i--;
				}
			}
		}
		
		System.out.println("중복제거!");
		System.out.println(sb);
		
		sc.close();
	}

}




