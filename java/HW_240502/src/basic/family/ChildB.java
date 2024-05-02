package basic.family;

public class ChildB extends Parent {
	
	String fingerPrint;

	public ChildB() {
		super();
	}

	public ChildB(String familyName, String bloodType, double height, String skinColor, String fingerPrint) {
		super(familyName, bloodType, height, skinColor);
		this.fingerPrint = fingerPrint;
	}

	@Override
	public String toString() {
		return "ChildB [fingerPrint=" + fingerPrint + ", familyName=" + familyName + ", bloodType=" + bloodType
				+ ", height=" + height + ", skinColor=" + skinColor + "]";
	}
	

}
