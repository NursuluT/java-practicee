package day1_reveiw;
import java.util.Scanner;
public class Seasons {

	public static void main(String[] args) {
		// Please write a program that will print season name
		//BASED ON the int value
		// value will print provided though the scanner
		//1
		// Winter
		//6
		//Summer
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int month = scan.nextInt();
		String message = "";
//		
//		if(month>=1 && month<=2 || month==12) {
//		System.out.println("Winter");
//		}else if(month>=3 && month <=5) {
//			System.out.println("Spring");
//		}else if(month>=6 && month <=8) {
//			System.out.println("Summer");
//		}else if(month>=9 && month <= 11) {
//			System.out.println("Fall");
//		}else {
//			System.out.println("Invalid month");
//		}
		switch(month) {
		case 1:
			message ="Winter";
			break;
		case 2:
			message ="Spring";
			break;
		case 3:
			message ="Summer";
			break;
		case 4:
			message ="Fall";
			break;
			default:
				System.out.println("Invalid number");
		}
     System.out.println(message);
	}

}
