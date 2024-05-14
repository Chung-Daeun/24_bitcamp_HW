package basic;

public class _01 {
//	1. 메인스레드는 1~20까지 3과 4의 공배수를 출력하는 작업을 하고 1~20까지의 숫자중 30의 약수를 출력하는 서브 스레드를 하나 갖는다. 
//	각각의 스레드를 실행하십시오.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1 ; i <= 20; i++) {
			if(i % 3 == 0 && i % 4 == 0) {
				System.out.println(i);
			}
		}
		
		Thread thread = new Thread(new Runnable(){
			@Override
			public void run() {
				for(int i = 1 ; i <= 20; i++) {
					if(30 % i == 0) {
						System.out.println(i);
					}
				}
			}
		});
		
		thread.start();
	}

}
