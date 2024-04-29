package _01_Basic;

public class _06to08 {
	
	public static void main(String[] args) {
		
//		6. 1 ~ 100까지 합을 while문으로 출력
		int i = 1;
		int sum = 0;
		
		while(i <= 100) {
			sum += i++;
		}
		System.out.println(sum);

//		7. 1 ~ 100까지 합을 do ~ while문으로 출력
		i = 1;
		sum = 0;
		
		do {
			sum += i++;
		}while(i <= 100);
		System.out.println(sum);

//		8. 1 ~ 100까지 합을 for문으로 출력
		sum = 0;
		for(i = 1; i <= 100; i++)
			sum += i;
		System.out.println(sum);
	}

}
