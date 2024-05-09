package advance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03 {
//	3. 사용자가 입력한 5개의 정수를 저장하는 List<Integer>를 생성하고
//    연속된 두 수의 합이 가장 커지는 구간의 두 수를 출력하세요.
//    ex) [1, 2, 3, 4, 5] => 4, 5 출력

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrInt = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 5개를 입력하시오");
		
		for(int i = 0; i < 5; i++) {
			arrInt.add(sc.nextInt());
		}
		
		int max = arrInt.get(0) + arrInt.get(1);
		int ans = 0;
		
		for(int i = 1; i < arrInt.size() - 1; i++) {
			
			if(max < arrInt.get(i) + arrInt.get(i + 1)) {
				max = arrInt.get(i) + arrInt.get(i + 1);
				ans = i;
			}
			
		}
		
		System.out.println(ans + ", " + (ans + 1));
		
		
		sc.close();
	}

}
