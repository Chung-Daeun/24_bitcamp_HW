package middle;

public class _03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrInt = {1, 2, 3, 4, 5};
		double[] arrDouble = {1.0, 2.0, 3.0, 4.0, 5.0};
		
		int[] newArrInt = ArrayUtility.doubleToInt(arrDouble);
		double[] newArrDouble = ArrayUtility.intToDouble(arrInt);
		
		System.out.println("int to double");
		for(double num : newArrDouble)
			System.out.print(num + " ");
		System.out.println();
		
		System.out.println("double to int");
		for(int num : newArrInt)
			System.out.print(num + " ");
		System.out.println();
		
		
	}

}
