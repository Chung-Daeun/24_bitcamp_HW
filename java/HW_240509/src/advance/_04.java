package advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class _04 {
//	4. 사용자가 입력한 6개의 정수를 저장하는 List<Integer>를 생성하고
//    두 수의 합이 유일한 값이 되는 개수를 출력하세요.(중복 숫자 사용불가)
//    ex) [1, 2, 3, 4, 5, 6] => 총 4개(3, 4, 10, 11)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 정수 6개 리스트 만들기
		List<Integer> arrInt = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 6개를 입력하시오");
		
		for(int i = 0; i < 6; i++) {
			arrInt.add(sc.nextInt());
			//중복제거 -> 문제 조건을 좀 읽읍시다!
			for(int j = 0; j < i; j++) {
				if(arrInt.get(i) == arrInt.get(j)) {
					System.out.println("중복입니다 다시 입력하세요!");
					arrInt.remove(i);
					arrInt.add(sc.nextInt());
				}
			}
		}
		System.out.println(arrInt);
		
		// 모든 합을 저장한 List만들기
		List<Integer> arrIntSum = new ArrayList<Integer>();
		
		for(int i = 0; i < arrInt.size() - 1; i++) {
			for(int j = i + 1; j < arrInt.size(); j++) {
				arrIntSum.add(arrInt.get(i) + arrInt.get(j));
			}
		}
		int numOfSum = arrIntSum.size();
//		System.out.println(arrIntSum);
		Collections.sort(arrIntSum);
//		System.out.println(arrIntSum);
		
		// 중복된 값의 인덱스 저장
		for(int i = 0; i < numOfSum - 1; i++) {
			for(int j = i + 1; j < numOfSum; j++) {
				if(arrIntSum.get(i) == arrIntSum.get(j)) {
					arrIntSum.add(i);
					arrIntSum.add(j);
				}
			}
		}
		
		// 인덱스를 Set으로 복사
		Set<Integer> setIndex = new HashSet<Integer>(arrIntSum.subList(numOfSum, arrIntSum.size()));
//		System.out.println(setIndex);
		
		// 결과 출력
		int ans = numOfSum - setIndex.size();
		
		if(ans < 0) {
			System.out.println("Somthing's wrong...");
		} else {
			System.out.print("총 " + ans + "개");
			
			if(ans != 0) {
				System.out.print("( ");
				for(int i = 0; i < numOfSum; i++) {
					if(!setIndex.contains(i)) {
						System.out.print(arrIntSum.get(i) + " ");
					}
				}
				System.out.print(")");
			}		
		}
		
		sc.close();
	}

}
