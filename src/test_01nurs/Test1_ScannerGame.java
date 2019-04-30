package test_01nurs;

import java.util.Scanner;

public class Test1_ScannerGame {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("How old are you?");
		int myAge = num.nextInt();
		int currentYear = 2019;
		System.out.println( "right:");
		System.out.println("That means now: " + currentYear );
				
	}

}
