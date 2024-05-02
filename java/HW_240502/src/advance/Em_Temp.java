package advance;

public class Em_Temp extends Employee {
	
	int workDay; 

	public Em_Temp() {
		super();
	}

	public Em_Temp(int eno, String name, int pay, int type, int workDay) {
		super(eno, name, pay, 3);
		this.workDay = workDay;
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return (double)this.pay * workDay;
	}

	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("급여: " + this.getMonthPay());
	}
	
}
