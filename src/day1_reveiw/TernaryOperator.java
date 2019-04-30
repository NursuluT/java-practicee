package day1_reveiw;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = 20;
		System.out.println(time < 18 ? "Good afternoon!": "Good evening!");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the score:");
		int score = scan.nextInt();
		System.out.println(score >= 64 ? "Passed" : score <0 ? "Invalid data": "Failed");
		
	}

	
	}


