package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _02 {

//	2. public static <T> String add(T t1, T t2) 제네릭 메소드를 정의하고 매개변수로 어떤 값이 들어오던 문자열 결합연산이 돼서 스트링값으로 리턴하도록 만드세요.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> intArr = new ArrayList<Integer>();
		
		intArr.add(1);
		intArr.add(2);
		intArr.add(3);
		intArr.add(4);
		intArr.add(5);
		intArr.add(7);
		
//		System.out.println(intArr);
		
		Map<String, String> map = new HashMap<>();
		
		map.put("1번", "부산");
		map.put("2번", "강릉");
		map.put("3번", "제주도");
		map.put("4번", "호주");
		map.put("5번", "대만");
		map.put("6번", "도쿄");
		map.put("7번", "쿄토");
		map.put("8번", "전주");
		
		Set<Boolean> boolSet = new HashSet<Boolean>();
		
		boolSet.add(false);
		boolSet.add(true);
		boolSet.add(true);
		boolSet.add(true);
		boolSet.add(true);
		boolSet.add(false);
		boolSet.add(true);
		
//		System.out.println(boolSet);
		
		
		System.out.println(add(intArr, map));
	}
	
	public static <T> String add(T t1, T t2) {
		return t1.toString() + t2.toString();
	}

}
