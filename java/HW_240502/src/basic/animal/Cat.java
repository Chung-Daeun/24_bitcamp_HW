package basic.animal;

public class Cat extends Mammalia {
	
	String family = "cat";
	
	public void eat() {
		super.eat();
		System.out.println("대부분 육식동물이다.(잡식인 종도 존재는 함.)");
	}
	
	public void toenail() {
		System.out.println("날카로운 발톱을 가지고 있다. 발가락 사이에 수납되어 있으니 항상 조심해야한다.");
	}

}
