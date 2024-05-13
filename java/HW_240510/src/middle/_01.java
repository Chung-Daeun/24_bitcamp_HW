package middle;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _01 {

//	1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고
//  	4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.(이름 : 90)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> scores = new HashMap<String, Integer>();

		scores.put("김개똥", 90);
		scores.put("박소똥", 88);
		scores.put("이닭똥", 23);
		scores.put("최정상", 54);

		Set<Entry<String, Integer>> scoresEntrySet = scores.entrySet();
		Iterator<Entry<String, Integer>> scoreESIter = scoresEntrySet.iterator();
		
		String name = "";
		int high = 0;
		
		while(scoreESIter.hasNext()) {
			Entry<String, Integer> entry = scoreESIter.next();
			
			if (high < entry.getValue()) {
				high = entry.getValue();
				name = entry.getKey();
			}
		}
		
		System.out.println("최고점은 " + high + "이고, " + name + "(이)가 달성했습니다.");
		

	}

}
