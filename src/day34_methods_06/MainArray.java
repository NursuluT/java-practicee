package day34_methods_06;
import java.util.*;
public class MainArray {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(CountArray.getArray()));
		//store return value into array
	  int[]nums = CountArray.getArray();
	  System.out.println(Arrays.toString(nums));
	 // for(;;) {
	  System.out.println(Arrays.toString(CountArray.getRandomArray(20)));
	 // }
	  int[] randomNums = CountArray.getRandomArray(3);
	  System.out.println(Arrays.toString(randomNums));
	  
	  System.out.println(Arrays.toString(CountArray.getRandomArray(20)));
		//}
		int[] randomNums = CountArray.getRandomArray(3);
		System.out.println(Arrays.toString(randomNums));
	}
	

			
		
	}


