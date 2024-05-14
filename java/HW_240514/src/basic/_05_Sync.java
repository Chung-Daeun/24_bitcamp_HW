package basic;

import basic.wait.NumberPrinterSyncWait;
import basic.wait.ShareSyncWait01;
import basic.wait.ShareSyncWait02;

public class _05_Sync {
//	5. 3, 4번 문제에서 wait와 notify를 이용하여 스레드 두개가 각각 한 번씩 출력하도록 수정하세요.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberPrinterSyncWait npsw = new NumberPrinterSyncWait();
		
		ShareSyncWait01 ss1 = new ShareSyncWait01();
		ShareSyncWait02 ss2 = new ShareSyncWait02();
		
		ss1.setNpsw(npsw);
		ss2.setNpsw(npsw);
		
		ss1.start();
		ss2.start();
	}

}
