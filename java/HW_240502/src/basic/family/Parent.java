package basic.family;

public class Parent {
	
	String familyName;
	String bloodType;
	double height;
	String skinColor;
	
	
	public Parent() {
	
	}


	public Parent(String familyName, String bloodType, double height, String skinColor) {
		this.familyName = familyName;
		this.bloodType = bloodType;
		this.height = height;
		this.skinColor = skinColor;
	}


	@Override
	public String toString() {
		return "Parent [familyName=" + familyName + ", bloodType=" + bloodType + ", height=" + height + ", skinColor="
				+ skinColor + "]";
	}
	
	
	
	
	
	
}
