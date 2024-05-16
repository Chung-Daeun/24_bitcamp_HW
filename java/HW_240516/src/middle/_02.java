package middle;

import java.util.Scanner;

public class _02 {
//	2. 2번 문제에서 StringBuilder 두 개를 합치는 메소드 appendSb와 역순으로 변경하는 메소드 reverseSb를 각각 선언하고 
//	StringBuilder의 메소드를 참조하여 combineStrBuilder 각각 구현하세요.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start((sb1, sb2) -> reverseSb(appendSb(sb1, sb2)));
	}
	
	public static void start(StringBuilderUtils sbu) {
		Scanner sc = new Scanner(System.in);
		
		// StringBuilder 2개 입력
		System.out.println("문장을 입력하시오.");
		StringBuilder sb1 = new StringBuilder(sc.nextLine());
		
		System.out.println("문장을 입력하시오.");
		StringBuilder sb2 = new StringBuilder(sc.nextLine());
		
		// 출력
		System.out.println(sbu.combineStrBuilder(sb1, sb2));
	}
	
	public static StringBuilder appendSb(StringBuilder sb1, StringBuilder sb2) {
		return sb1.append(sb2);
	}
	
	public static StringBuilder reverseSb(StringBuilder sb) {
		return sb.reverse();
	}

}
