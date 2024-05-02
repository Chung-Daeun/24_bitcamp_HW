package advance;

public class ArrayUtility2 {
//	1. 다음 두 개의 static 메소드를 갖는 ArrayUtility2클래스를 만들어보고 사용하세요
//	  static int[] concat(int[] s1, int[] s2);	// s1과 s2를 연결한 새로운 배열 리턴
//	  static int[] remove(int[] s1, int[] s2);	// s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴
	
	static int[] concat(int[] s1, int[] s2) {
		int len = s1.length + s2.length;
		int[] newArr = new int[len];
		
		for(int i = 0; i < s1.length; i++) {
			newArr[i] = s1[i];
		}
		for(int i = s1.length; i < len; i++) {
			newArr[i] = s2[i - s1.length];
		}
		
		return newArr;
	}
	
	static int[] remove(int[] s1, int[] s2) {
		int len = 0;
		for(int i = 0; i < s1.length; i++) {
			for(int j = 0; j < s2.length; j++ ) {
				if(s1[i]  == s2[j]) {
					s1[i] = 0;
					len++;
				}
			}
		}
		
		int[] newArr = new int[s1.length - len];
		
		int index = 0;
		for (int j = 0; j < newArr.length; j++) {
			if(s1[index] == 0) {
				index++;
				j--;
			} else {
				newArr[j] = s1[index++];
			}
		}
		return newArr;
	}
}
