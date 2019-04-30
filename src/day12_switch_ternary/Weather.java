package day12_switch_ternary;
import java.util.Scanner;
public class Weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String weather;
		Scanner scan = new Scanner(System.in);
		System.out.println("How is the weather?");
		weather = scan.next();
		switch (weather){
		case "sunny":
			System.out.println("Go to park");
			break;
			
		case "hot":
			System.out.println("Go swimming");
			System.out.println("Code java");
			break;
		case "windy":
		System.out.println("Fly a kite");
		System.out.println("Code java");
		break;
		case "rainy":
		System.out.println("Go shopping");
		System.out.println("Code java");
		break;
		case "snow":
			System.out.println("chain your tyres");
			System.out.println("Code java");
			break;
			default:
				System.out.println("no such a weather");
				System.out.println("stay home, code java");
		
			
		}

	}

}
