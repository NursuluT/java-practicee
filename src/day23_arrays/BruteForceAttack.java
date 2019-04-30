package day23_arrays;

import java.util.Scanner;

public class BruteForceAttack {

	public static void main(String[] args) {
		String expectedUserName ="admin";
		String expectedPassword ="admin123";
		String username = "";
		String password ="";
		int attempts = 5;
		Scanner scan = new Scanner(System.in);
		do {
			if(attempts==0) {
				System.out.println("You have exceeded number of attempts");
				System.out.println("This user has been deactivated for 30 minutes");
				return;
			}
			attempts--;
			System.out.println("Please enter user name");
			username = scan.next();
			if(!username.equals(expectedUserName)){
				System.out.println("Wrong user name");
				System.out.println("Attemtps left: "+attempts);
				continue;
		
			}
			System.out.println("Enter password");
			password = scan.next();
			if(!password.equals(expectedPassword)) {
				System.out.println("Wrong password");
				System.out.println("Attempts left: "+attempts);
				break;
			}
			
		}while(username.equals(expectedUserName) ||!password.equals(expectedPassword));
		 System.out.println("Log in successful!");

	}

}
