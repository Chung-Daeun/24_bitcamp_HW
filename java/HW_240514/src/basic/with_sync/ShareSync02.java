package basic.with_sync;

public class ShareSync02 extends Thread{

	private NumberPrinterSync nps;

	public NumberPrinterSync getNps() {
		return nps;
	}

	public void setNps(NumberPrinterSync nps) {
		this.nps = nps;
	}
	
	@Override
	public void run() {
		nps.numPrint2(20);
	}
}
