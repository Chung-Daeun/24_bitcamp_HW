package basic;

import java.util.ArrayList;
import java.util.List;

public class _03 {
//	3. public static Integer sum(List<?> list) 와일드 카드를 이용하여 리스트의 총합을 구하는 메소드를 구현하세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Double> dList = new ArrayList<>();
		
		dList.add(9.5);
		dList.add(3.14);
		dList.add(4.88);
		dList.add(9.2);
		dList.add(0.5);
		dList.add(0.775);
		
		System.out.println(sum(dList));
		
	}

	public static Integer sum(List<? extends Number> list) {
		int sum = 0;
		
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i).intValue();
		}
		
		return sum;
	}
}
