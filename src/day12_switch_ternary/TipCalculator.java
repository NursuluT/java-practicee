package day12_switch_ternary;
import java.util.Scanner;
public class TipCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double checkAmount, totalToPay, totalTip, totalPerPerson, tipPerPerson;
		System.out.println("Split: ");
		int numberOfPeople;
		String split = scan.next();
		if (split.equals("no")) {
		}else if(split.equals("yes")) {
			System.out.println("Number of people: ");
			String ampersand = (String.repeat(numberOfPeople));
			String str = "&";
			numberOfPeople = scan.nextInt();
			
			System.out.println("Check amount: "); 
			checkAmount = scan.nextDouble();
			
			System.out.println("Service Quality: ");
			String quality = scan.next();
			if(quality.equalsIgnoreCase("Poor"))  {
				totalTip = checkAmount*0.05;
			}else if(quality.equalsIgnoreCase("Fair")){
				totalTip = checkAmount*0.10;
			}else if(quality.equalsIgnoreCase("Good")){
				totalTip = checkAmount*0.15;
			}else if(quality.equalsIgnoreCase("Great")) {
				totalTip = checkAmount*0.20;
			}else if(quality.equalsIgnoreCase("Excellent")) {
				totalTip = checkAmount*0.25;
				totalToPay = checkAmount + totalTip;
				totalPerPerson = totalToPay /numberOfPeople;
				tipPerPerson = totalTip / numberOfPeople;
				
//Number of people entered: &&&&
//Total to pay: 595.0
//Total tip: 119.0
//Total per person: 148.75
//Tip per person: 29.75
				System.out.println("Number of people entered: " + numberOfPeople);
				System.out.println("Total to pay: "+ totalToPay);
				System.out.println("Total tip: " + totalTip);
				System.out.println("Total per person: " + totalPerPerson);
				System.out.println("Tip per person: " + tipPerPerson);
			}
			}
			{
				
			}
			
		
		}
		
		
		
		
		
		
	}
