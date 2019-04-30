package day21_recap;
import java.util.Scanner;
public class Register {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many items did you purchase?");
		int itemsCount = scan.nextInt();
		double totalPrice = 0.0;
		String item = "";
		for(int count =1;  count <=itemsCount; count++) {
			System.out.println("What is item "+count+"?");
			String itemName = scan.next();
			
			System.out.println("How much is " +itemName+"?");
			double itemPrice = scan.nextDouble();
			//add item name to items and itemPrice to totalPrice
			
			item += itemName + ", ";
			totalPrice += itemPrice;
			
		
		}
		//if(items.endsWith(", "))
		//item = item
		System.out.println("Your items: " +item);
		System.out.println("Total price: $" +totalPrice);

}
}