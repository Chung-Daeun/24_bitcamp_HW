package basic;

import java.util.HashMap;
import java.util.Map;

public class _01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<>();
		for(int i = 'A'; i <= 'Z'; i++) {
			map.put(Character.valueOf((char)i).toString(), i);
		}
		for(int i = 'a'; i <= 'z'; i++) {
			map.put(Character.valueOf((char)i).toString(), i);
		}
		
		System.out.println(map);
	}

}
