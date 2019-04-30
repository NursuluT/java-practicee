package day27_arrays05;
import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = {4, 5, 7, 8, 10};
		System.out.println(Arrays.binarySearch(nums, 7));
		System.out.println(Arrays.binarySearch(nums, 10));
		System.out.println(Arrays.binarySearch(nums, 4));
		System.out.println(Arrays.binarySearch(nums, 5));
		System.out.println(Arrays.binarySearch(nums, 3));
		System.out.println(Arrays.binarySearch(nums, 2));
		
		int i = Arrays.binarySearch(nums, 10);
		System.out.println(i);
		int[] nums1 = {4, 98, 55, 8, 10};
		System.out.println(Arrays.binarySearch(nums1, 98));
		System.out.println(Arrays.binarySearch(nums1, 40));
		System.out.println(Arrays.binarySearch(nums1, 55));
		System.out.println(Arrays.binarySearch(nums1, 8));
		
		
		
		

	}

}
