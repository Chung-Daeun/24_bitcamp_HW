package hw_240611.account;

public class BankApplication {
	
	// 데이터
	public Account[] accountArr = new Account[100];
	private int index;
	
	// 생성자
	public BankApplication() {
		this.index = 0;
	}
	
	// 메소드
	// 계좌생성
	public void makeAccount(String accountNumber, String name, int money) {
		if(index >= 100)
			System.out.println("계좌를 추가할 수 없습니다.");
		else {
			this.accountArr[this.index] = new Account(accountNumber, name, money);
			this.index++;
			System.out.println("결과: 계좌가 생성되었습니다.");
		}
	}
	// 계좌목록
	public void printAccount() {
		for(Account acc : accountArr) {
			if(!acc.getAccountNumber().equals(null)) {
				System.out.println(acc.getAccountNumber() + "\t" + acc.getName() + "\t" + acc.getMoney());				
			}
		}
	}
	// 예금
	public void deposit(String accountNumber, int money) {
		for(Account acc : accountArr) {
			if(accountNumber.equals(acc.getAccountNumber())) {
				int newMoney = acc.getMoney() + money;
				if(newMoney > 50000000) {
					acc.setMoney(50000000);
					System.out.println("예금 가능 금액을 초과했습니다.");
					System.out.println("반환 금액: " + (newMoney - 50000000));
				} else {
					acc.setMoney(newMoney);
				}
			}
		}
	}
	// 출금
	public void withdraw(String accountNumber, int money) {
		for(Account acc : accountArr) {
			if(accountNumber.equals(acc.getAccountNumber())) {
				int newMoney = acc.getMoney() - money;
				if(newMoney < 0) {
					System.out.println("잔고가 부족합니다.");
				} else {
					acc.setMoney(newMoney);
					System.out.println("결과: 출금이 성공되었습니다.");
				}
			}
		}
	}
}
