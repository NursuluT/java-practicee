package day18_while_doWhile_loops;
import java.util.*;
public class PinCodeV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int secretPincode =4321;
		int pincode =0;
		int attempts =1;
		while(pincode!=secretPincode && attempts<=3) {
			System.out.println("enter pincode");
			pincode = scan.nextInt();
			attempts++;
			
		}
		if(attempts ==3 && secretPincode !=secretPincode) {
			System.out.println("Card is blocked");
			return;
		}
       System.out.println("Acces granted, Select option");
	}
         
}
