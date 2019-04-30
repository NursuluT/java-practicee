package day08_casting_conditionals;

import java.util.Scanner;

public class GradeCheck {
	public static void main(String[] args) {
		//A,B,C,D
		//char grade = scan.next().charAt(0);
		Scanner scan = new Scanner(System.in);
		System.out.println("what is your grade?");
		char grade = scan.next().charAt(0);
		
		if(grade=='A'){
			
			System.out.println("Good job, keep going");
		} else {
			System.out.println("How many points did you miss untill 'A'");
			int points = scan.nextInt();
			System.out.println("You could earn " +points+ " 10 more point if you study harder");
		}
	
		
	}
	

}
