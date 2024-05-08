package middle;

public class _01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//	    비어있는 바이트의 공간을 b, i, t가 반복되어 들어가도록 모두 채우세요.

		StringBuffer sb = new StringBuffer(30);
		sb.append("hello");
		
		System.out.println("변경 전: " + sb);
		
		
		int i = 0;
		while(sb.capacity() != sb.length()) {
			
			switch(i % 3) {
				case 0:
					sb.append('b');
					break;
				case 1:
					sb.append('i');
					break;
				case 2:
					sb.append('t');
					break;
			}
			
			i++;
			
		}
		
		System.out.println("변경 후: " + sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}

}
