package Basic;

import Method.ConcatString;

public class _03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 2번에서 만든 메소드를 오버로딩해서 String 타입의 값 2개와 int 타입의 값 1개를 매개변수로 받아서 문자열 결합을 진행하고 결합된 문자열을 리턴하는 메소드를 구현하세요.
		
		ConcatString cs = new ConcatString();
		
		System.out.println(cs.concat("Da", "eun", 129));
	}

}
