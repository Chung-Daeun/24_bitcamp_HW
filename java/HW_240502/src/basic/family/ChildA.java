package basic.family;

public class ChildA extends Parent {
	
	String name;
	
	public ChildA() {
		super();
	}

	public ChildA(String familyName, String bloodType, double height, String skinColor, String name) {
		super(familyName, bloodType, height, skinColor);
		this.name = name;
	}

	@Override
	public String toString() {
		return "ChildA [name=" + name + ", familyName=" + familyName + ", bloodType=" + bloodType + ", height=" + height
				+ ", skinColor=" + skinColor + "]";
	}
	
	
}
