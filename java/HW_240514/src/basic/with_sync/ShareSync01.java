package basic.with_sync;

public class ShareSync01 extends Thread{

	private NumberPrinterSync nps;

	public NumberPrinterSync getNps() {
		return nps;
	}

	public void setNps(NumberPrinterSync nps) {
		this.nps = nps;
	}
	
	@Override
	public void run() {
		nps.numPrint1(10);
	}
}
