package middle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class _04 {

//	4. Map<Integer, Integer>을 매개변수로 받아서 List<Entry<K, V>>를 리턴하는 메소드 getOverHundr를 구현하세요. 
//	매개변수 Map에는 key는 50~60까지 value는 15~25까지 넣어주고 키와 밸류의 곱셈의 결과가 1000을 넘는 Entry만 List에 저장합니다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> map = new HashMap<>();
		
		Random ran = new Random();
		
		for(int i = 0; i < 25; i++) {
			map.put(ran.nextInt(11) + 50, ran.nextInt(11) + 15);
		}
		System.out.println(map);
		
		System.out.println(getOverHundr(map));
	}

	public static <K, V> List<Entry<K, V>> getOverHundr(Map<Integer, Integer> map){
		List<Entry<K, V>> entList = new ArrayList<>();
		
		for(Entry entry : map.entrySet()) {
			if(((Integer) entry.getKey()) * (Integer)entry.getValue() > 1000) {
				entList.add(entry);
			}
		}
		return entList;
	}
}
