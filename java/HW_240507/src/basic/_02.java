package basic;

import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		String str = sc.nextLine();
		
		System.out.println("모음제거!");
		System.out.println(removeVowel(str));
	}
	
	public static String removeVowel(String str) {
		String ans = "";
		
		for(int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
			 	case 'a': case 'e': case 'i': case 'o': case 'u':
			 	case 'A': case 'E': case 'I': case 'O': case 'U':
			 		break;
			 	default:
			 		ans += str.charAt(i);
			}
		}
		return ans;
	}

}
