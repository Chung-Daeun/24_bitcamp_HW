package middle;

import java.util.HashMap;
import java.util.Map;
import middle._02;

public class Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		_02 method = new _02();
		
		map.put(1, 2);
		map.put(-1, -2);
		map.put(16, 29);
		map.put(-51, -72);
		map.put(-61, 72);
		map.put(19, 27);
		map.put(-71, 24);
		map.put(16, 32);
		map.put(16, -92);
		
		System.out.println(method.getMaxMul(map));
	}

}
