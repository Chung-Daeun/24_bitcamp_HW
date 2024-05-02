package advance;

public class _01 {
	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {6, 8, 9, 3, 2};
		
		for(int num : ArrayUtility2.concat(arr1, arr2)) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		for(int num : ArrayUtility2.remove(arr1, arr2)) {
			System.out.print(num + " ");
		}
		
			
	}
}
