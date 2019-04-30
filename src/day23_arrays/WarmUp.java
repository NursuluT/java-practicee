package day23_arrays;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		//Write a program that will verify if number is primer
		//Prime number is a whole number grater then 1 and cannot be made multiplying other numbers
		//Ask user to provide number if it's prime number display message "it is prime number" otherwise display message "not a prime number".
    Scanner scan = new Scanner(System.in);
    
    System.out.println("enter a number");
	
	int num = scan.nextInt();
	int count=0;
	for (int i = 2;  i<= num ;i ++) {
		
		if(num%i==0) {
			count++;
		}
		
		
	}if(count>1) {
		System.out.println("number is not prime");
	}else System.out.println(num +" is prime number");


	
}

}