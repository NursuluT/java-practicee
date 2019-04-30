package test_01nurs;

import java.util.Scanner;

public class ShoppingList2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalProce = 0;
		do{
		  System.out.println("Enter item and its price:");
		  item = scan.next();
		  price = scan.nextDouble();
		}while(count<10);
		count++;
		System.out.println("Add one more item?");
	 while(count<0);
		
			  
		    System.out.println("item1 " +item+"price: " +price+"item2: "+item+"price: "+price+"item3: "+item+"price: "+price);
		    System.out.println("Total price: "+totalProce);
		  }
		    



		 
		
  


	}


