package _02_Middle;

public class _06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. 중첩 for문을 이용해서 아래와 같이 출력하세요.
//		6-1)  
//		*
//		**
//		***
//		****
//		*****
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		
//		6-2)
//		    *
//		   **
//		  ***
//		 ****
//		*****
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(j <= (5 - i)) {
					System.out.print(" ");
					continue;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		
//		6-3)
//		*****
//		****
//		***
//		**
//		*
		
		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		
//		6-4)
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <= 5; j++) {
				if(j <= (5 - i)) {
					System.out.print(" ");
					continue;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		
	}

}
