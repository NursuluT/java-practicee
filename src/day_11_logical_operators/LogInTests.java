package day_11_logical_operators;
import java.util.Scanner;
public class LogInTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your username:");
		String username =scan.next();
		System.out.println("Enter your password:");
		String password=scan.next();
		
		String validUsername ="cybertek";
		String validPassword ="WoodenSpoon";
		
	if(username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
		System.out.println("Login Successful, welcome!");
	}else if(!username.equalsIgnoreCase(validUsername) && password.equalsIgnoreCase(validPassword)) {
		
		System.out.println("Invalid username and invalid password");
	}else if(username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)) {
		System.out.println("Invalid password");
	}
	
		

	}

}
