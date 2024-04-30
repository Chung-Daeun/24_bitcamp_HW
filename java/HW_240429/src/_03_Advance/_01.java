package _03_Advance;

import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. . 사용자가 입력한 금액을 오만원권, 만원권, 오천원권, 천원권, 500원동전, 100원동전, 50원동전, 10원동전, 1원동전 각 몇개로 변환되는지 출력하세요.
//		   출력 개수는 단위가 큰 것 순서로 계산합니다
//		   예를 들어 78670원이면 <오만원 1매, 만원 2매, 오천원 1매, 천원 3매, 500원 1개, 100원 1개, 50원 1개, 10원 2개> 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가진 돈: ");
		int money = sc.nextInt();
		System.out.println();
		
		int[] std = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		int[] cash = new int[std.length];
		
		for(int i = 0; i < std.length; i++) {
			cash[i] = money / std[i];
			money %= std[i];
			
			if(cash[i] == 0)
				continue;
			
			System.out.println(std[i] + "원: " + cash[i] + "개");
		}
		sc.close();
	}

}
