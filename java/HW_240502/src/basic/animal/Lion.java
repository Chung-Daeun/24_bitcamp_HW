package basic.animal;

public class Lion extends Cat {
	String name;
	
	public Lion() {
		super();
		this.name = "lion";
	}
	
	public Lion(String name) {
		super();
		this.name = name;
	}
	
	public void male() {
		System.out.println("갈기를 가지고 있다.");
	}
	
	public void female() {
		System.out.println("갈기가 없다. 수컷보다 몸집도 작다. 하지만 종종 본인 짝을 이겨먹는 암컷이 있다. 사냥을 잘한다.");
	}
}
