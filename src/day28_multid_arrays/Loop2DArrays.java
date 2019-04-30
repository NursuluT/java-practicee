package day28_multid_arrays;

import java.util.Arrays;

public class Loop2DArrays {

	public static void main(String[] args) {
		String [][] pizzas = {
				             {"pineapple","pepperoni"},//0
				             {"anchovies","mashrooms","olives"},//1
				             {"4 cheese"},//2
				             {"chicken","tomatoes","jalapennios","onions"},//3
		                     {"green peppers", "zuccini","brocolli","spinach","shrimp"}};//4
		
		            //System.out.println(Arrays.toString(pizzas[0]));
		for(String []pizza:pizzas) {
			System.out.print(pizza.length+"-");
		 System.out.println(Arrays.toString(pizza));                      
		}
		
		System.out.println("##### FOR LOOP#####");
		for(int i =0; i<pizzas.length; i++) {
			System.out.print(pizzas[i].length+"-");
			System.out.println(Arrays.toString(pizzas[i]));
		}
		for(String topping: pizzas[4]) {
			System.out.println(topping);
		}
		int [][]students = {
				           {4,5,6},
				           {12,7,5}, 
				           {23,55,32,41,63}};
		//2 parts: outer loop and inner loop
		//outer loop will take each group
		//inner loop will take each value/students id
		for(int[]group : students) {
			for(int studentId: group) {
				System.out.print(studentId+", ");
			}
			System.out.println();
		}
		int[][]nums= {
				     {10,20},//0
				     {20,30,40,50},//1
				     {100,200,400},//2
				     {555,333,111,444},//3
		                 };
		for(int i =0; i< nums.length; i++) {
			for(int j =0; j< nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
