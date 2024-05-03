package middle;

public class Reverse {
	
	String reverseString(String str) {
		
		String revStr = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}
		return revStr;
	}
}
