package day13_ternary_strings_intro;
import java.util.Scanner;
public class CarSelector {

	public static void main(String[] args) {
		//1) American: FORD, DODGE,Tesla,Chevrolet, Lincoln
	   // AveragePrice: 33000
   //2) JAPANESE: Toyota, Mitsubisi,Honda, Subaru,Mazda
		// AveragePrice:32000
  //3)German: BMW, VW, Audi, Mercedes, Porsche
	     // AveragePrice:55000
   //4)Itlian: Alfa Romeo, Ferrari, Lamborghini, Fiat
	    //AveragePrice:85000
		//5)Korean: Kia, Hyundai, Daewoo
	// AveragePrice:25000
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("What type of car you are interested in?");
		System.out.println("1)American\n2)Japanese\n3)German\n4)Italian\n5)Korean");
		int carType = input.nextInt();
		double averagePrice = 0.0;
		String carOption ="";
		
		switch(carType) {
		case 1:
			averagePrice=33000.0;
			carOption = "Ford, Dodge, Tesla, Chevrolet, Lincoln";
			break;
		case 2:
			averagePrice =32000.0;
			carOption = "Toyota, Mitsubisi, Honda, Subaru, MAzda.";
			break;
		case 3:
			averagePrice = 55000.0;
			carOption = "BMW, VW, Audi, Mercedes, Porsche.";
			break;
		case 4: 
			averagePrice = 85000.0;
			carOption = "Alfa Romeo, Ferrari, Lamborghini, Fiat.";
			break;
		case 5:
			averagePrice = 25000.0;
			carOption = "Kia, Hyundai, Daewoo.";
			break;
		default:
				System.out.println("For invalid selection");
				return;
			
		}
		
		System.out.println("you selected " +carOption+" car and your options are");
		System.out.println("Average price: " +averagePrice);

	}

}
