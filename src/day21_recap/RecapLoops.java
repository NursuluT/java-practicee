package day21_recap;
import java.util.Scanner;
public class RecapLoops {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  int sum = 0;
		 do {
			 System.out.println("Enter 2 numbers");
		 int num1 = scan.nextInt();
		 int num2 = scan.nextInt();		
		 sum = num1+num2;
		 }while(sum<=100);
			 System.out.println("Good numbers");
		 }
	}


