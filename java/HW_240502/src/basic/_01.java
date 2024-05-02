package basic;

import basic.animal.Cat;
import basic.animal.Lion;
import basic.animal.Mammalia;
import basic.animal.Tiger;

public class _01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		   1. 포유류 클래스 ->  고양이과 클래스 -> 호랑이, 사자 클래스를 제작하고 상속관계로 연결하세요.
//		   각 클래스 마다 기본생성자 하나와 2개의 메서드를 알아서 구현하면 됩니다.
		
		System.out.println("Mammalia");
		Mammalia mam = new Mammalia();
		mam.birth();
		mam.eat();
		System.out.println("------------------------------");
		
		System.out.println("Cat");
		mam = new Cat();
		mam.birth();
		mam.eat();
		((Cat) mam).toenail();
		System.out.println("------------------------------");
		
		System.out.println("Tiger");
		mam = new Tiger();
		mam.birth();
		mam.eat();
		((Tiger)mam).eat();
		((Tiger)mam).toenail();
		((Tiger)mam).live();
		((Tiger)mam).voice();
		System.out.println("------------------------------");
		
		System.out.println("Lion");
		mam = new Lion();
		mam.birth();
		mam.eat();
		((Lion)mam).eat();
		((Lion)mam).toenail();
		((Lion)mam).male();
		((Lion)mam).female();
		
		
	}

}
