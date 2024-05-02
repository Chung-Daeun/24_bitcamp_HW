package middle;

import java.util.Scanner;
// 3개의 정숫값을 입력하고 최댓값을 구합니다.

// 1. Max3.java의 코드를 채우세요


class Max3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값：");	
		int a = stdIn.nextInt();
		System.out.print("b의 값：");	
		int b = stdIn.nextInt();
		System.out.print("c의 값：");	
		int c = stdIn.nextInt();
		
		int max = a;
		
		max = max >= b 
				?
					max >= c
						?
							max
							:
							c
				:
					b >= c
						?
							b
							:
							c;

		System.out.println("최댓값은 " + max + "입니다.");
	}
}