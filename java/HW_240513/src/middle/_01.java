package middle;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class _01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		map.put(1, 2);
		map.put(-1, -2);
		map.put(16, 29);
		map.put(-51, -72);
		map.put(-61, 72);
		map.put(19, 27);
		map.put(-71, 24);
		map.put(16, 32);
		map.put(16, -92);
		
		System.out.println(getMaxMul(map));
		
	}

	public static <K extends Number, V extends Number> Entry<K, V> getMaxMul(Map<K ,V> map) {
		
		double max = 0;
		Entry<K, V> maxEnt = null;
		
		for(Entry<K, V> entry : map.entrySet()) {
			if(maxEnt == null || max < entry.getValue().doubleValue() * entry.getKey().doubleValue()) {
				max = entry.getValue().doubleValue() * entry.getKey().doubleValue();
				maxEnt = entry;
			}
		}
		
		return maxEnt;
	}
}
