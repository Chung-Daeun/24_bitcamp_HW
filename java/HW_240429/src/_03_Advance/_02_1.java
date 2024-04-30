package _03_Advance;

import java.util.Scanner;

public class _02_1 {

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
			System.out.print("숫자를 입력하세요.(1~99까지만/ 0 입력시 종료): ");
			int num = sc.nextInt();
			
			if(num == 0)
				break;
			
			else if(num < 1 || num > 99) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			
			int clap = 0;
			
			switch(num % 10) {
				case 3:
					clap++;
					break;
				case 6:
					clap++;
					break;
				case 9:
					clap++;
					break;
			}
			
			switch(num / 10) {
			case 3:
				clap++;
				break;
			case 6:
				clap++;
				break;
			case 9:
				clap++;
				break;
			}
			
			if(clap == 1)
				System.out.println("박수짝");
			else if(clap == 2)
				System.out.println("박수짝짝");
			
			System.out.println();
			
		}
		sc.close();
	}

}
