package Method;

import java.util.Random;
import java.util.Scanner;

public class RockScissPaper {
	private Scanner sc = new Scanner(System.in);

	private Random rd = new Random();

	

	private boolean isExit = false;

	

	private int gameCnt = 0;

	private int winCnt = 0;

	private int drawCnt = 0;

	private int loseCnt = 0;

	
	//게임을 시작하는 메소드
	public void start() {
		System.out.println("게임을 시작하지.");
		
		while(true) {
			
			// 사용자
			System.out.println("0(가위), 1(바위), 2(보), 3(종료) 중 입력하시오.");
			int user = sc.nextInt();
			
			//잘못된 입력과 종료
			if(user > 3) {
				System.out.println("잘못된 입력입니다.\n");
				continue;
			}else if(user == 3) {
				isExit = true;
				System.out.println("게임이 종료되었습니다.");
			}
			
			//종료
			if(isExit) {
				System.out.println("결과: " + gameCnt + "전 " + winCnt + "승 " + drawCnt + "무 " + loseCnt + "패");
				break;
			}
			
			// 컴퓨터
			int com = rd.nextInt(3);
			printCom(com);
			
			// 결과 알림
			judgeWDL(user, com);
			gameCnt++;
			
			
		}
	}
		

	

	//승무패 판단해주는 메소드

	public void judgeWDL(int user, int com) {
		
		switch(user - com) {
			// 비김
			case 0 :
				System.out.println("비겼습니다.\n");
				drawCnt++;
				break;
			// 이김
			case 1 :
				System.out.println("이겼습니다.\n");
				winCnt++;
				break;
			case -2:
				System.out.println("이겼습니다.\n");
				winCnt++;
				break;
			// 짐
			default:
				System.out.println("졌습니다.\n");
				loseCnt++;	
		}


	}

	

	//컴퓨터 가위, 바위, 보 출력해주는 메소드

	public void printCom(int com) {
		switch(com) {
			case 0:
				System.out.println("컴퓨터: 가위");
				break;
			case 1:
				System.out.println("컴퓨터: 바위");
				break;
			case 2:
				System.out.println("컴퓨터: 보");
				break;
		}
	}
}
