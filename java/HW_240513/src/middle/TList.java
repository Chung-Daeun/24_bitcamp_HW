package middle;

import java.util.ArrayList;
import java.util.List;

public class TList<T> {
//	5. 제네릭 타입의 리스트를 멤버 변수로 갖는 TList라는 제네릭 클래스를 만들고 splitList라는 메소드를 만들고 멤버변수인 List를 반반씩 두개의 리스트로 나누는 기능을구현하세요.
//	(리스트의 요소 개수가 짝수면 반반 동일한 개수로, 홀수면 첫 번째 리스트의 요소가 한 개씩 많게)
	
	private List<T> tList;

	public TList() {
		
	}

	public TList(List<T> tList) {
		this.tList = tList;
	}

	public List<T> gettList() {
		return tList;
	}

	public void settList(List<T> tList) {
		this.tList = tList;
	}
	
	public List[] splitList() {
		
		List<T> tList1 = new ArrayList<>();
		List<T> tList2 = new ArrayList<>();
		
		for(int i = 0; i < this.tList.size() / 2; i++) {
			tList1.add(tList.get(i));
			tList2.add(tList.get(this.tList.size() - 1 - i));
			}
		if(tList.size() % 2 != 0) {
			tList1.add(tList.get(this.tList.size() / 2));
		}
		
		return new List[] {tList1, tList2};
		
	}

	@Override
	public String toString() {
		return "TList [tList=" + tList + "]";
	}
	
	
	
}
