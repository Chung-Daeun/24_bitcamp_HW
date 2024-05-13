package middle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _02 {
//	2. 매개변수로 Map<Integer, Integer>이 주어졌을 때 key, value의 곱이 가장 큰 Entry를 리턴하는 메소드 getMaxMul을 구현하세요.
	
	public Entry<Integer, Integer> getMaxMul(Map<Integer, Integer> map) {
		
		
		Set<Entry<Integer, Integer>> mapEntrySet = map.entrySet();
		Iterator<Entry<Integer, Integer>> mapESIter = mapEntrySet.iterator();
		List<Integer> mul = new ArrayList<Integer>();
		
		Entry<Integer, Integer> maxEntry = null;
		int max = 0;
		
		
		while(mapESIter.hasNext()) {
			Entry<Integer, Integer> entry = mapESIter.next();
			mul.add(entry.getKey() * entry.getValue());
			if (mul.size() == 1) {
				max = mul.get(0);
			} else {
				if (max < mul.get(mul.size() - 1)) {
					max = mul.get(mul.size() - 1);
					maxEntry = entry;
				}
			}
		}
//		System.out.println(mul);
		
		return maxEntry;
		
		
	}

}
