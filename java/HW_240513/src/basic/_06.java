package basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _06 {
//	6. Map을 어떤형태로든 받아서 value를 String으로 변경했을 때 길이가 10이상되는 key를 출력하는 메소드 
//	void printOverTen을 구현하세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Long> map = new HashMap<>();
		
		map.put("1번", 12378956L);
		map.put("2번", 2435409860980299564L);
		map.put("3번", 12634785469L);
		map.put("4번", 3567985681208L);
		map.put("5번", 58760981679468L);
		map.put("6번", 13789657093L);
		map.put("7번", 609698729163876L);
		map.put("8번", 13160L);
		
		printOverTen(map);
	}
	
	public static <K, V> void printOverTen(Map<K, V> map) {
		System.out.print("value의 길이가 10이상인 key들: ");
		
		Set<Entry<K, V>> entrySet = map.entrySet();
		
		for(Entry<K, V> entry : entrySet) {
			if(entry.getValue().toString().length() >= 10) {
				System.out.print(entry.getKey() + " ");
			}
		}
	}

}
