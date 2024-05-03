package basic;

public class HybridCar implements ElectronicCar, FuelCar {

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		System.out.println("속도를 높인다.");
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		System.out.println("속도를 낮춘다.");

	}

	@Override
	public void addFuel() {
		// TODO Auto-generated method stub
		System.out.println("주유중");
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("충전중");
	}

}
