package day24_arrays;

import java.util.Arrays;

public class SumOfTheNumbers {

	public static void main(String[] args) {
		//let's create an  array of integers with length 3
		int[] numbers =new int[3];
		//first value in the array
		numbers[0] = 25;
		//second value in array
		numbers[1]=10;
		//third value of array
		numbers[2]=20;
		//[I@15db9742 this is a hash code
      System.out.println(numbers);
      //toString() method from arrays class can help as to print an arrays as string
      System.out.println(Arrays.toString(numbers));
		int sum = 0;
		//Please use for loop in order to loop through the array 
		//and calculate sum of all elements
		//numbers.length -->returns number of elements in the array
		//The final field array.length cannot be assigned
		//numbers.length=5;
		for(int i =0; i<numbers.length; i++) {
			sum = sum + numbers[i];
			}
		System.out.println("Sum: " +sum);
		//find largest value in the array
		int max = Integer.MIN_VALUE;
		for (int i =0; i<numbers.length; i++) {
			if(numbers[i] >max) {
				max = numbers[i];
			}
		}
   System.out.println("MAx value: "+max);
	
         int min = Integer.MAX_VALUE;
         for(int n =0; n<numbers.length; n++) {
        	 if(numbers[n]<min) {
        		 min = numbers[n];
        		 System.out.println("Min value: "+min);
        	 }
         }
}
}