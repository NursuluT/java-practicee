package day_11_logical_operators;
import java.util.Scanner;
public class TollCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Vehicle Type. ");//1, 2
		int carType= scan.nextInt();
		
		System.out.println("Is it rush hour: yes | no");
		String answer=scan.next();// yes or no
		// check if rushHour if "yes" => assign true to isRushHour
		// if it is "no" , assign false to isRushHour
		
		boolean isRushHour = scan.hasNextBoolean();
		if(answer.equalsIgnoreCase("yes")){
			isRushHour = true;
			
		}else {
			isRushHour = false;
		}
		//System.out.println(isRushHour);
		
		double price = 0.0;
		if(carType ==1) {
			if(isRushHour) {
				price = 30.0;
			}else {
				price = 5.0;
			}
		}else if(carType ==2) {
			if(isRushHour) {
				price = 55.30;
			}else {
				price = 15.99;
				System.out.println("Toll cost " +price);
			}
		}
		
		
	}

}
