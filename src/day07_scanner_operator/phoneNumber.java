package day07_scanner_operator;

import java.util.Scanner;

public class phoneNumber {
	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	  
	 System.out.println("Enter your area code: ");
	 int areaCode = scan.nextInt();
	 
	 System.out.println("Enter your local number: ");
	 int localNumber = scan.nextInt();
	 // (303) - 2345678
	 String phoneNumber = "("+ areaCode + ")-" +localNumber;
	 System.out.println("Calling number " +phoneNumber);
	 
		
		
		
	}

}
