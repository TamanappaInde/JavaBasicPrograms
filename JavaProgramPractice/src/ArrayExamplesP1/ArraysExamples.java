package ArrayExamplesP1;

import java.util.Arrays;

public class ArraysExamples {

	public static void main(String[] args) {
		
		// Seperate Positive and Negative values from array
		int[] arr = {1,2,-2,3,4,-4,5,6,-7,8};
		
		int[] positives = new int[arr.length];
		int[] negatives = new int[arr.length];
		
		int posIndex = 0;
		int negIndex = 0;
		
		for (int num : arr) {
			if (num > 0) {
				positives[posIndex++] = num;
			} else {
				negatives[negIndex++] = num;
			}
		}
		
	    positives = Arrays.copyOf(positives, posIndex);
		negatives = Arrays.copyOf(negatives, negIndex);
		
		System.out.println(Arrays.toString(positives));
		System.out.println(Arrays.toString(negatives));

	}

}
