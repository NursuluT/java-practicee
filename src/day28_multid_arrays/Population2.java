package day28_multid_arrays;

import java.util.Arrays;

public class Population2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] nums = new int[3][4];
		nums[0][0]=100;
		nums[0][1]=34534;
		nums[0][2]=3433242;
		nums[0][3]=46545;
		
		nums[1][0]=256;
		nums[1][1]=78965;
		nums[1][2]=6342;
		nums[1][3]=457599;
		
		nums[2][0]=14286;
		nums[2][1]=12965;
		nums[2][2]=6542;
		nums[2][3]=88759;
		
		System.out.println(Arrays.deepToString(nums));
		
		System.out.println(Arrays.toString(nums[0]));
		System.out.println(Arrays.toString(nums[1]));
		System.out.println(Arrays.toString(nums[2]));     
		
		int[][]scores = { {3,5,10},{6,4,2,10} };
		
		System.out.println("Days played/ number of arrays:"+scores.length);
		System.out.println("Number of values in 1: "+scores[0].length);
		System.out.println("Number of values in 2: "+scores[1].length);
		
		int values [][]= new int[4][];
		values[0] = new int[]{34,23,5};
		values[1]=new int[]{25,45,23,2,4,5,6,8,9,7,};
		
		values[2]=new int[2];
		values[2][0] =55;
		values[2][1]= 88;
		
		values[3]=new int[] {5,8,12,55,78};
		
		System.out.println(Arrays.deepToString(values));
		

	}

}
