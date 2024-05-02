package basic.work;

public class Programmer extends Worker {

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("개발자 " + this.name + "님이 출근합니다.");
	}

	@Override
	public void getOff() {
		// TODO Auto-generated method stub
		System.out.println("개발자 " + this.name + "님이 퇴근합니다.");

	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("개발자 " + this.name + "님이 근무 중입니다.");

	}

}
