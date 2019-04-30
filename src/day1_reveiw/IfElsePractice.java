package day1_reveiw;

import java.util.Scanner;

public class IfElsePractice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = scan.nextInt();
		if(age>0 &&age<21) {
			//if it's true
			System.out.println("Underage!");
		}else if (age<1) {
			//if it's false
			System.out.println("You can buy cigarettes!");
		}

	}

}
