package test_01nurs;

import java.util.Arrays;

public class SmallestAndLargestNum {
  public static void main(String[] args) {
	    
	  int nums[]= {-10, 24, 50, 88, 987656};
	  int largest = nums[0];
	  int smallest = nums[0];
	  
	  for(int i =1; i<nums.length; i++) {
		  if(nums[i]>=largest) {
			  largest = nums[i];
			  
		  }else if(nums[i]<smallest) {
			  smallest =nums[i];
		  }
	  }
	  System.out.println("\ngiven array is:"+Arrays.toString(nums));
	  System.out.println("Largest numbers is: " +largest);
	  System.out.println("Smallest number is: "+smallest);
	  
}
}
