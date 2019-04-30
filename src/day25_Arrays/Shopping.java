package day25_Arrays;

public class Shopping {

	public static void main(String[] args) {
		 String [] products = {"Timberland Shoes", "H&M Shirt","Swatch Watch","Gucci Bag", "Adidas socks"};
		 double [] prices = {120.0, 5.99, 150.50, 3000.5, 6.99};
		 int [] itemsId = {12345, 45678, 12345, 78965, 45632};
		 
		 // loop through products and print each one in separate line
		 //Print count of products
		 //check if products prices and item's ID has same count
		 System.out.println("Products count: " +products.length);
		 if(products.length==prices.length && itemsId.length==products.length) {
			 System.out.println("Shopping list looks good");
		 }else {
			 System.out.println("Something is wrong in this list");
			 return;
			 
		 }
       for(String product:products) {
    	   System.out.println(product);
	}
      for(int i =0; i< prices.length; i++) {
    	  System.out.println(prices[i]);
      }
      //itemsId --> print this in reverse order
      System.out.println(itemsId[itemsId.length -1]);
      for(int idx = itemsId.length -1; idx>=0;idx--) {
    	  System.out.println(itemsId[idx]);
    	  
      }
      //print a report with total price
      //Item 1: 12345 - Timberland SHoes - 120.0
      //total price: 
      System.out.println("##### YOUR SHOPPING RECEPT######");
      double totalPrice = 0.0;
      for(int i =0; i <products.length; i++) {
    	  System.out.println("Item "+(i+1)+": "+itemsId[i]+" - "+ products[i] +" - $"+prices[i]);
    	  totalPrice+=prices[i];
      }
      System.out.println("Total Price: $"+totalPrice);
      //Find the most expensive item in your list and print as a report
      int maxIndex =0;
      double maxPrice =0;
      for(int j =0; j< prices.length; j++) {
    	  if(prices[j]>maxPrice) {
    		  maxPrice =prices[j];
    		  maxIndex =j;
    	  }
      }
      
    	  System.out.println(itemsId[maxIndex] +" - "+ products[maxIndex]+" - $"+maxPrice);
    	  
    	  int minIndex = 0;
  		double minPrice = prices[0];
  		for(int p = 0; p<prices.length; p++) {
  			if(prices[p] < minPrice) {
  				minPrice = prices[p];
  				minIndex = p;
  			}
  	
  		}
  		System.out.println(itemsId[minIndex] + " - " + products[minIndex] + " - $" + minPrice);
  }
      }


