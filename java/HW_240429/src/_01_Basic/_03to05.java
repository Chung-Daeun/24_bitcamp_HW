package _01_Basic;

public class _03to05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 10 ~ 1까지 거꾸로 while문으로 출력
		
		int i = 10;
		while(i > 0) {
			System.out.println(i--);
		}
		System.out.println("-----------------------------------------");
		
//		4. 10 ~ 1까지 거꾸로 do ~ while문으로 출력
		i = 10;
		do {
			System.out.println(i--);
		}while(i > 0);
		System.out.println("-----------------------------------------");
		
//		5. 10 ~ 1까지 거꾸로 for문으로 출력
		for(i = 10; i > 0; i--)
			System.out.println(i);


	}

}
