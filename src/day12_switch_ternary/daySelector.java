package day12_switch_ternary;
import java.util.Scanner;
public class daySelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter day: ");
	     day = scan.nextInt();
		switch(day) {
		case 1:
		System.out.println("today is Monday");
	break;
		case 2:
		System.out.println("today is Tuesday");
		break;
		case 3:
			System.out.println("today is Wednesday");
			break;
		case 4:
			System.out.println("today is Thursday");
			break;
		case 5:
			System.out.println("today is Friday");
			break;
	
		case 6:
			System.out.println("today is Saturday");
			break;
		case 7:
			System.out.println("today is Sunday");
			break;
			default:
				System.out.println("No such a day");
		
		
		
		
		}
		
		
		

	}

}
