package hw_240611;

import java.util.Scanner;

import hw_240611.account.BankApplication;

public class BankMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 필요한 변수 선언
		int menu;
		String accountNumber;
		String name;
		int money;
		BankApplication bank = new BankApplication();
		
		while(true) {
			// 메뉴바
			System.out.println("-----------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-----------------------------------------------");
			
			// 선택
			System.out.print("선택> ");
			menu = sc.nextInt();
			sc.nextLine();
			System.out.println("----------------");
			
			// menu 값에 따라 다른 결과 실행
			switch(menu) {
			case 1:
				System.out.println("계좌생성");
				System.out.println("----------------");
				System.out.print("계좌 번호: ");
				accountNumber =sc.nextLine();
				System.out.print("계좌주: ");
				name = sc.nextLine();
				System.out.print("초기입금액: ");
				money = sc.nextInt();
				bank.makeAccount(accountNumber, name, money);
				break;
			case 2:
				System.out.println("계좌목록");
				System.out.println("----------------");
				bank.printAccount();
				break;
			case 3:
				System.out.println("예금");
				System.out.println("----------------");
				System.out.print("계좌 번호: ");
				accountNumber =sc.nextLine();
				System.out.print("예금액: ");
				money = sc.nextInt();
				bank.deposit(accountNumber, money);
				break;
			case 4:
				System.out.println("출금");
				System.out.println("----------------");
				System.out.print("계좌 번호: ");
				accountNumber =sc.nextLine();
				System.out.print("출금액: ");
				money = sc.nextInt();
				bank.withdraw(accountNumber, money);
				break;
			case 5:
				System.out.println("프로그램 종료");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("다시 입력하세요.");
			}
		}

	}

}
