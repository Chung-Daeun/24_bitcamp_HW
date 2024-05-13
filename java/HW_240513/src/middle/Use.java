package middle;

public class Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] intArr = new Integer[] {1, 2, 3, 4, 5};
		
		_02 cal = new _02(intArr);
		
		System.out.println(cal.add(intArr));
		System.out.println(cal.sub(intArr));
		System.out.println(cal.mul(intArr));
		System.out.println(cal.div(intArr));
	}

}
