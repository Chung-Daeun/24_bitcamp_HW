package middle;

import java.util.Arrays;

public class IntArrUtils {

	public static int getMax(int[] intArr) {
		int max = Integer.MIN_VALUE;
		for(int num : intArr) {
			max = Math.max(max, num);
		}
		return max;
	}
	
	public static int getMin(int[] intArr) {
		int min = Integer.MAX_VALUE;
		for(int num : intArr) {
			min = Math.min(min, num);
		}
		return min;
	}

	public static double getMid(int[] intArr) {
		Arrays.sort(intArr);
		
		if(intArr.length % 2 != 0) {
			return (double)intArr[intArr.length / 2];
		} else { 
			return (double)(intArr[intArr.length / 2] + intArr[intArr.length / 2 - 1]) / 2;
		}
	}
}
