package day34_methods_06;

import java.util.Arrays;

public class VarArgs {
	public static void main(String[] args) {
		printWords("grey", "blue", "red");
		printWords("yellow", "black");
		printWords("purple", "white");
		printWords();
		String [] myPets = {"horse","cat", "dog","sheep"};
		printWords(myPets);
		System.out.println(sum(20, 10, 30));
		System.out.println(sum(20, 10, 30, 87, 95, 65, 412, 65));
		int budget =200;
		if(sum(10, 45, 110, 30)<= budget) {
			System.out.println("Within budget");
		}else {
			System.out.println("Broke");
		}
		int total = sum(234, 43, 5, 97, 12, 34, 5);
				System.out.println("total: "+total);
				cook("Burrito Bowl", "Meat","Rice","Beans","Sour Cream","chicken");
	}
             
	public static void printWords(String... words) {
		//handle it like an Array
		for(String w : words) {
			System.out.println(w);
		}
	}
	public static int sum(int... nums) {
		int sum =0;
		for(int n: nums) {
			sum +=n;
			
		}
		return sum;
		
	}
	public static void cook(String name, String... ings) {
		System.out.println("Food: "+name);
		System.out.println("Ingridients: "+Arrays.toString(ings));
		
	 
		}
	

}
