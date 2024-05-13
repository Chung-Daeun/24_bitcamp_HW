package basic;

public class _05 {


//	5. Number를 상속받은 클래스타입의 배열만 받아서 배열의 최소값을 구해서 리턴하는 메소드 getMin을 구현하세요.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getMin(new Integer[] {1,2,3,4,5}));
	}

	public static <T extends Number> int getMin(T[] tArr) {
		int min = (int)tArr[0];
		
		for(T num : tArr) {
			min = Math.min(min, (int) num);
		}
		
		return min;
	}
	
}
