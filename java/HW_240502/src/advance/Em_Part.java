package advance;

public class Em_Part extends Employee {
	
	int hireYear;
	

	public Em_Part() {
		super();
	}

	public Em_Part(int eno, String name, int pay, int type, int hireYear) {
		super(eno, name, pay, 2);
		this.hireYear = hireYear;
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return (double)this.pay / 12;
	}
	
	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("계약기간: " + this.hireYear);
		System.out.println("급여: " + this.getMonthPay());
	}

}
