package day34_methods_06;

import java.util.Random;

public class CountArray {

	public static void main(String[] args) {
		int[] nums = {2,3,4,5,5,6,6,6,7,5,5,12};
		//print return right away
		//assign value
	   
		System.out.println(findOccurences(nums,6));
		System.out.println(findOccurences(nums, 5));
		
		int fives = findOccurences(nums, 5);
		int sixes = findOccurences(nums,6);
		System.out.println(fives);
		System.out.println(sixes);
		if(fives >0) {
			System.out.println("We have 5s");
		}else {
			System.out.println("No 5s");
		}
		if(findOccurences(nums,2)>0) {
			System.out.println("We hve 2s");
		}else {
			System.out.println("no 2s");
		}
		//create array and pass to method
		int twenty = findOccurences(new int[] {10,20,20,30,55,22},20);
		System.out.println("twent: "+ twenty);
		
		
	}
	public static int findOccurences(int[]array, int value) {
		int counter =0;
		for(int num: array) {
			if(num==value) {
				counter++;
			}
		}
		return counter;
	}
	public static int [] getArray() {
		int [] retArray = {4, 5, 8, 9, 74};
		
			return retArray;
		
	}
	public static int [] getRandomArray(int size) {
		Random rand = new Random();
		int[] numArray = new int[size];
		for (int i = 0; i<size; i++) {		
		numArray[i] = rand.nextInt(101);
		i++;
		}
		return numArray;
	}

}
