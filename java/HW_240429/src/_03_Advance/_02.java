package _03_Advance;

import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. 369게임을 작성합니다.
//		   1~99까지의 정수를 입력받고
//		   3,6,9중 하나가 있으면 "박수짝"을 출력하고
//		   2개가 있으면 "박수짝짝"을 출력하세요
//		   예를 들어 13은 "박수짝"
//		   36인 경우는 "박수짝짝"을 출력하면 됩니다.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요.(0 입력시 종료.): ");
			
			int num = sc.nextInt();
			
			if(num == 0)
				break;
			
			if((num % 10) % 3 == 0 && (num / 10) % 3 == 0 && (num / 10) != 0 && (num % 10) != 0) {
				System.out.println("박수짝짝");
			}else if(((num % 10) % 3 == 0 && (num % 10) != 0 )|| ((num / 10) % 3 == 0) && (num / 10) != 0) {
				System.out.println("박수짝");
			}
		}
		sc.close();
		// switch문으로도 풀어보기
	}

}
