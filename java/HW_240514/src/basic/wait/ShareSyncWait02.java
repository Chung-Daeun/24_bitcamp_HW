package basic.wait;

public class ShareSyncWait02 extends Thread{

	private NumberPrinterSyncWait npsw;

	public NumberPrinterSyncWait getNpsw() {
		return npsw;
	}

	public void setNpsw(NumberPrinterSyncWait npsw) {
		this.npsw = npsw;
	}
	
	@Override
	public void run() {
		npsw.numPrint2(20);
	}
}
