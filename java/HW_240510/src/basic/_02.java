package basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> telephoneBook = new HashMap<String, String>();
		
//		telephoneBook.put("김개똥", "010-1111-1111");
//		telephoneBook.put("최소똥", "010-2222-2222");
//		telephoneBook.put("이말똥", "010-3333-3333");
//		telephoneBook.put("박닭똥", "010-4444-4444");
//		telephoneBook.put("신양똥", "010-5555-5555");
		
		System.out.println("[전화번호부]");
		
		while(true) {
		selectMode(linkTelephoneBook(), telephoneBook);
		}
				
	}

	public static void searchPhoneNumber(Map<String, String> telephoneBook) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		
		StringBuffer name = new StringBuffer(sc.nextLine());
		
		if(telephoneBook.isEmpty()) {
			System.out.println("비어있는 전화번호부 입니다.");
		} else if(telephoneBook.containsKey(name)){
			System.out.println(telephoneBook.get(name));
		} else {
			System.out.println("모르는 사람입니다.");
		}
	}
	
	public static int linkTelephoneBook() {
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----- 메뉴 -----");
		System.out.println("1. 전화번호 추가");
		System.out.println("2. 전체확인");
		System.out.println("3. 전화번호 검색");
		System.out.println("4. 나가기");
		System.out.println("---------------");
		
		return sc.nextInt();
	}
	
	public static void selectMode(int num, Map<String, String> telephoneBook) {
		switch(num) {
			case 1:
				addPhoneNumber(telephoneBook);
				break;
			case 2:
				printAllPhoneNumber(telephoneBook);
				break;
			case 3:
				searchPhoneNumber(telephoneBook);
				break;
			case 4:
				System.exit(0);
		}
	}
	
	public static void addPhoneNumber(Map<String, String> telephoneBook) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		StringBuffer name = new StringBuffer(sc.nextLine());
		
		System.out.print("전화번호: ");
		StringBuffer phoneNumber = new StringBuffer(sc.nextLine());
		
		telephoneBook.put(name.toString(), phoneNumber.toString());
		
	}
	
	public static void printAllPhoneNumber(Map<String, String> telephoneBook) {
		System.out.println(telephoneBook);
	}
}
