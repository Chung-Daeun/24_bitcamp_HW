package _03_Advance;

public class _03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 다음과 같이 출력하세요.
//	    *
//	   ***
//	  *****
//	 *******
//	*********
		
		int n = 5;
		
		for (int i = 0; i < n; i++) {
			for(int j = 1; j <= 2 * n - 1; j++) {
				if(j < n - i || j > n + i) {
					System.out.print(" ");
					continue;
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
