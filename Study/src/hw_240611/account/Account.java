package hw_240611.account;

public class Account {

	// 데이터
	private String accountNumber;
	private String name;
	private int money;
	
	// 생성자
	public Account() {
		
	}
	
	public Account(String accountNumber, String name, int money) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.money = money;
	}

	// getter & setter
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
