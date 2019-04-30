package test_01nurs;

import java.util.Scanner;

public class NursuluWeight {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("How many kgs Nursulu?");
		 double nurSuluBefore = scan.nextDouble();
		 double nurSuluNow = 50;
		 while(nurSuluBefore>nurSuluNow) {
			  nurSuluNow++;
			 System.out.println("Almost there do not give up!");
		 }
	}

}
