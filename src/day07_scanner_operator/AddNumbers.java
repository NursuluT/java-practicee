package day07_scanner_operator;

import java.util.Scanner;

public class AddNumbers {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num1 , num2, num3, sum;
		 
	 
		System.out.println("Enter 3 numbers: " );
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		sum = num1 + num2 + num3;
		
		System.out.println("Sum of numbers: " +sum);
		
		
	}

	}
