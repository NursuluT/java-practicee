package day18_while_doWhile_loops;
import java.util.*;
public class EnterPincode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int secretPincode = 1234;
		
		int pinCode =0;
		while(pinCode!=secretPincode) {
			System.out.println("Enter pinCode");
			pinCode = scan.nextInt();
		}
		System.out.println("Access granted, select operation");

	}

}
