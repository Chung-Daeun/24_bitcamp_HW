package basic.with_sync;

public class _04 {
//	4. 3번 문제에서 첫 스레드의 공유객체 점유가 끝날때까지 두 번째 스레드를 실행하지 못하도록 잠금 상태로 만드세요.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberPrinterSync nps = new NumberPrinterSync();
		
		ShareSync01 ss1 = new ShareSync01();
		ShareSync02 ss2 = new ShareSync02();
		
		ss1.setNps(nps);
		ss2.setNps(nps);
		
		ss1.start();
		ss2.start();
	}

}
