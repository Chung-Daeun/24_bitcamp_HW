package advance;

public class Em_Full extends Employee {

	int bonus;	
	
	

	public Em_Full() {
		super();
	}

	public Em_Full(int eno, String name, int pay, int type, int bonus) {
		super(eno, name, pay, 1);
		this.bonus = bonus;
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return (double)this.pay / 12 + bonus / 12;
	}
	
	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("급여: " + this.getMonthPay());
	}

}
