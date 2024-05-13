package advance;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class _01 {
	
//	1. 사용자가 입력한 문자열에서 가장 많이 등장하는 문자와 그 개수를 출력하세요.
//    (Map<Character, Integer> 형태의 Map과 Entry 사용)

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		System.out.println("문자열을 입력하세요.");
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			if(!map.containsKey(str.charAt(i))) {
				 map.put(str.charAt(i), i);
			} else {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}
		}
		
		Entry<Character, Integer> answer = null;
		
		for(Entry entry : map.entrySet()) {
			if(answer == null || (int)entry.getValue() > (int)answer.getValue()) {
				answer = entry;
			}
		
		}
		
		System.out.println("가장 많이 나온 문자는 " + answer.getKey() + "이고, 총 " + answer.getValue() + "번 등장했습니다.");
	}

}
