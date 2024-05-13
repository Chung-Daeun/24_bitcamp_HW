package middle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _02 {
//	2. 매개변수로 Map<Integer, Integer>이 주어졌을 때 key, value의 곱이 가장 큰 Entry를 리턴하는 메소드 getMaxMul을 구현하세요.
	
	public Entry<Integer, Integer> getMaxMul(Map<Integer, Integer> map) {
		
		System.out.println(map);
		
		Set<Entry<Integer, Integer>> mapEntrySet = map.entrySet();
		Iterator<Entry<Integer, Integer>> mapESIter = mapEntrySet.iterator();
		List<Integer> mul = new ArrayList<Integer>();
		
		
		while(mapESIter.hasNext()) {
			Entry<Integer, Integer> entry = mapESIter.next();
			mul.add(entry.getKey() * entry.getValue());
			System.out.println("next: " + entry);
		}
		
		System.out.println(mul);
		
		int max = mul.get(0);
		int idx = 0;
		
		for(int i = 0; i < mul.size(); i++) {
			if(max < mul.get(i)) {
				idx = i;
			}
		}
		
		for(int j = 0 ; j <= idx; j++) {
			mapESIter.next();
		}
		
		return entry;
		
		
	}

}
