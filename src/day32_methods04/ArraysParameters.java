package day32_methods04;

import java.util.Arrays;

public class ArraysParameters {

	public static void main(String[] args) {
		int [] myArray = {44, 22, 66, 11};
		printArray(myArray);
		printArray(new int[] {33,22, 54, 12});
		printArray(new int[] {12, 45, 8, 365});
		
		int[] one = {10, 2, 3};
		int[] two = {3, 1};
		print2Array(one, two);
		
		print2ArrayV2(one, two);
		
		
		
		// Method: printArray
		// return type void
		// param: int[] nums
		// print values of the nums array
	}
	public static void printArray(int[]nums) {
		for(int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	public static void print2Array(int[]arrNums, int[]arrNums2) {
		for(int m : arrNums2) {
			if(arrNums.length > arrNums2.length) {
				System.out.print(Arrays.toString(arrNums));
				System.out.println(Arrays.toString(arrNums2));
			}else {
				System.out.println(Arrays.toString(arrNums));
				System.out.println(Arrays.toString(arrNums2));
			}
		}
	}
		public static void print2ArrayV2(int[]arrNums, int[]arrNums2) {
			for(int m : arrNums2) {
				if(arrNums.length > arrNums2.length) {
					printArray(arrNums);
					printArray(arrNums2);
					System.out.println(Arrays.toString(arrNums2));
				}else {
					printArray(arrNums);
					printArray(arrNums2);
				}
			}
	}

}
