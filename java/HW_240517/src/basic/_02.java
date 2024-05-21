package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _02 {
//	2. 사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여 문자열의 길이가 5이상인 문자열만 출력하세요.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<String> strList = new ArrayList<>();
		
		System.out.println("문자열을 입력하세요.");
		for(int i = 0; i < 10; i++){
			strList.add(sc.nextLine());
		}
		
		strList.stream().filter(str -> str.length() >= 5).forEach(str -> System.out.println(str));
		
		sc.close();
	}

}
