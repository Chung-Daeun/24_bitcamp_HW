package basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _04 {
//	4. 어떤 배열이던지 받아서 인덱스가 3의 배수인 요소만 출력하는 메소드 void printArr을 구현하세요.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map = new HashMap<>();
		
		map.put("1번", "부산");
		map.put("2번", "강릉");
		map.put("3번", "제주도");
		map.put("4번", "호주");
		map.put("5번", "대만");
		map.put("6번", "도쿄");
		map.put("7번", "쿄토");
		map.put("8번", "전주");
		
		Entry<String, String>[] places = new Entry[8];
		
//		Set<Entry<String, String>> entrySet = map.entrySet();
		Iterator ite = map.entrySet().iterator();
		
		for(int i = 0; i < map.entrySet().size(); i++) {
			places[i] = (Entry<String, String>) ite.next();
		}
		
		for(Entry en : places) {
			System.out.println(en);
		}
		System.out.println();
		printArr(places);
		
		
	}

	public static <T> void printArr(T[] tArr) {
		for(int i = 3; i < tArr.length; i += 3) {
			System.out.print(tArr[i] + " ");
		}
	}
}
