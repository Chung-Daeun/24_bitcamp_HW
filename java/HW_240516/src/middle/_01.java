package middle;

import java.util.Scanner;

public class _01 {
//	1. 두 개의 StringBuilder 값을 매개변수로 받아 두 개의 값을 합친 후 역순으로 바꿔서 리턴하는 
//	combineStrBuilder를 람다식으로 구현하세요.
//	StringBuilderUtils 함수형 인터페이스 선언, StringBuilder combineStrBuilder(StringBuilder sb1, 
//	StringBuilder sb2) 추상메소드 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start((sb1, sb2) -> sb1.append(sb2).reverse()); 
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

}
