package basic.with_sync;

public class NumberPrinterSync {
	private int num;
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public synchronized void numPrint1(int num){
		this.num = num;
		
		for(int i = num; i <= 50; i++) {
			if(i % 3 == 0 && i != 0) {
				System.out.println("1번" + i);
			}
		}
	}
	
	public void numPrint2(int num){
		synchronized(this) {
			for(int i = num; i <= 100; i++) {
				if((i % 5 == 0 || i % 7 == 0 )&& i != 0) {
					System.out.println("2번" + i);
				}
			}
		}
		
	}
}
