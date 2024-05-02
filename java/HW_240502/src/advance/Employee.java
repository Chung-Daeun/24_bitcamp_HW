package advance;

public abstract class Employee {

	int eno;
	String name;
	int pay;
	int type; //1: 정규직, 2: 계약직, 3. 임시직
	
	
	public Employee() {
	}


	public Employee(int eno, String name, int pay, int type) {
		this.eno = eno;
		this.name = name;
		this.pay = pay;
		this.type = type;
	}
	
	public String emType(int type) {
		
		if(type == 1) {
			return "정규직";
		} else if(type == 2) {
			return "계약직";
		} else if(type == 3) {
			return "임시직";
		} else
			return "Somethings wrong...";
	}
	
	public abstract double getMonthPay();
	
	public void showEmployeeInfo() {
		System.out.println("사번: " + this.eno);
		System.out.println("이름: " + this.name);
		System.out.println("근무형태: " + emType(this.type));
	}
	
	
			
}
