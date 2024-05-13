package middle;

import java.util.ArrayList;
import java.util.List;

public class _05 {
//	5. 제네릭 타입의 리스트를 멤버 변수로 갖는 TList라는 제네릭 클래스를 만들고 splitList라는 메소드를 만들고 멤버변수인 List를 반반씩 두개의 리스트로 나누는 기능을구현하세요.
//	(리스트의 요소 개수가 짝수면 반반 동일한 개수로, 홀수면 첫 번째 리스트의 요소가 한 개씩 많게)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			list.add((int)(Math.random() * 20 + 1));
		}
		
		TList<Integer> tList = new TList<Integer>(list);
		
		System.out.println(tList);
		System.out.println("1번: " + tList.splitList()[0]);
		System.out.println("2번: " + tList.splitList()[1]);
	}

}
