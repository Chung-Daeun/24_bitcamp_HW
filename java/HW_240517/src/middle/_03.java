package middle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03 {
//	3. 사용자가 입력한 영문자 10개를 저장하는 List<Character> charList를 만들고 
//	스트림을 이용해서 영문자가 소문자면 대문자로 대문자면 소문자로 바꾼 스트림을 만들어서 출력하세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Character> charList = new ArrayList<>();
		
		System.out.println("영문자를 입력하시오.");
		for(int i = 0; i < 10; i++) {
			charList.add(sc.next().charAt(0));
		}
		
		
		charList.stream().map(ch -> {
										if (ch.toString().matches("[a-z]")) {
											return ch.toString().toUpperCase().charAt(0);
										} else if(ch.toString().matches("[A-Z]")){
											return ch.toString().toLowerCase().charAt(0);
										} else { 
											return ch;
										}
									})
							.forEach(ch -> System.out.print(ch + " "));
		
		// 뤼튼이 수정해 준 코드
//		charList.stream()
//        .map(ch -> {
//            if (Character.isLowerCase(ch)) {
//                return Character.toUpperCase(ch);
//            } else if (Character.isUpperCase(ch)) {
//                return Character.toLowerCase(ch);
//            } else {
//                return ch;
//            }
//        })
//        .forEach(ch -> System.out.print(ch + " "));

	}

}
