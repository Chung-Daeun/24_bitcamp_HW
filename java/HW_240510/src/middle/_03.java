package middle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class _03 {

//	3. Map<Integer, Integer>을 매개변수로 받아서 key는 정순 출력, value는 역순 출력하는 printKVDesc라는 메소드를 구현하세요. 
//	{1: 3, 2: 4, 3: 5}
//	1 : 5
//	2 : 4
//	3 : 3
	
	// 내코드
//	public void printkDesc(Map<Integer, Integer> map) {
//		List<Integer> keyList = new ArrayList<Integer>();
//		keyList = keyList(map);
//		List<Integer> valueList = new ArrayList<Integer>();
//		valueList = valueList(map);
//		
//		for (int i = 0; i < keyList.size(); i++) {
//			map.put(keyList.get(i), valueList.get(valueList.size() - 1 - i));
//		}
//		
//		System.out.println(map);
//		
//	}
//	
//	public List valueList(Map<Integer, Integer> map) {
//		
//		List<Integer> valueList = new ArrayList<Integer>();
//		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
//		
//		for(Entry<Integer, Integer> entry : entrySet) {
//			valueList.add(entry.getValue());
//		}
//		
//		return valueList;
//	}
//	
//	
//	public List keyList(Map<Integer, Integer> map) {
//		List<Integer> keyList = new ArrayList<Integer>();
//		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
//		
//		for(Entry<Integer, Integer> entry : entrySet) {
//			keyList.add(entry.getKey());
//		}
//		
//		return keyList;
//	}
	
	// 강사님 코드
	public static void printKVDesc(Map<Integer, Integer> map) {
		List<Entry<Integer, Integer>> entList = 
					new ArrayList<Entry<Integer, Integer>>();
		
		for(Entry<Integer, Integer> ent : map.entrySet()) {		// entrySet을 향상된 for문으로 돌리면서 나온 entry를 List에 바로 집어넣다니!
			entList.add(ent);
		}
		
		for(int i = 0; i < entList.size(); i++) {
			System.out.println(
					entList.get(i).getKey() 
					+ " : " 
					+ entList.get(entList.size() - (i + 1)).getValue());
		}
	}
}
