package middle;

import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("문자열을 입력하세요.");
		String str = sc.nextLine();

		if (str.length() % 2 == 0) {
			System.out.println(str.charAt(str.length() / 2 - 1) + str.charAt(str.length() / 2));
		} else {
			System.out.println(str.charAt(str.length() / 2));

			sc.close();
		}

	}
}
