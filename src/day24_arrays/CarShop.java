package day24_arrays;

import java.util.Arrays;

public class CarShop {

	public static void main(String[] args) {
		// Step1: Create an arraymof strings, and store these cars inside that array
		//Step2;Print car name that starts with "M"
		String[] cars = {"BMW", "Audi","Ford","Honda","Mercedes","Mercury", "Rolls-Royce", "Tesla"};
		 for(String c: cars) {
	         if(!c.startsWith("M")) {
	             continue;
	         }
	         System.out.println(c);
		 }
	         System.out.println("**********************");
	         //Step3: Print all cars that have letter "r" somewhere in the name
	         //Please make a search case insensitive
	         for(String b: cars) {
	        	 if(b.toLowerCase().contains("r")) {
	        		  System.out.println(b);
	        	 }
	         }
	     
		 //Print car name that ends with a
		 System.out.println("**********************");
		 for(String end: cars) {
			 if(end.endsWith("a")) {
				 System.out.println(end);
			 }
		 }
		 System.out.println("**********************");
		 //Print all cars that have at least 6 letters
		 for(String let:cars) {
			 if(let.length()>5) {
				 System.out.println(let);
				 //for(int i = 0; i< cars.length; i++){
				 //if(cars[i].length()>=6{
				 //System.out.println(cars[i]);
			 }
		 }
		 //step 6: swap first and last value in the array
		 //create a temp variable, that will get a value of first
		 System.out.println("*************************");
		 String temp = cars[0];
		 //we swap values of first and last element
		 cars[0] =cars[cars.length-1];
		 //since temp variable has value of first element of array
		 //we assign this value to the last element in the array
		 cars[cars.length-1]=temp;
		 System.out.println("Before sorting");
		 System.out.println(Arrays.toString(cars));
		 Arrays.sort(cars);
		 System.out.println("After sorting");
		 System.out.println(Arrays.toString(cars));
		 System.out.println("Position: "+Arrays.binarySearch(cars, "Ford"));
		 int num =
		 System.out.println("Position: "+Arrays.binarySearch(cars, num+1, cars.length-1,"Ford"));
		 
		}
	}


