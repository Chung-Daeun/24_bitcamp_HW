package basic;

public class _02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//	    비어있는 바이트의 공간을 a로 모두 채우시오.
		
		
		StringBuffer sb = new StringBuffer(30);
		
		sb.append("hello");
		
//		int remainBuffer = sb.capacity() - sb.length();
		
		for (int i = sb.length(); i < sb.capacity(); i++) {
			sb.append('a');
		}
		
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
	}

}
