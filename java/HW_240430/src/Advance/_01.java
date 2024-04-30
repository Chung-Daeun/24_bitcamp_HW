package Advance;

import Method.RockScissPaper;

public class _01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 가위, 바위, 보 게임을 RockScissPaper 클래스로 만드세요.
//		   컴퓨터가 0(가위), 1(바위), 2(보) 중 랜덤값을 하나 선택하고
//		   사용자가 가위, 바위, 보를 입력해서 사용자가 이기면 이겼습니다. 지면 졌습니다. 비기면 비겼습니다.를 출력하세요.
//		   사용자가 3을 입력하면 게임이 종료되면서 몇전 몇승 몇무 몇패인지 출력하세요.
		
		RockScissPaper rsp = new RockScissPaper();
		
		rsp.start();
	}

}
