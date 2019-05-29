package test_01nurs;

import java.util.ArrayList;

public class PhoneDemo {

	public static void main(String[] args) {
		Phone test = new Phone();
	    System.out.println(test.toString());
	    System.out.println("How many phones do we have? "+Phone.getNumOfPhones());
	    System.out.println(Phone.arr);
	    
	    Phone iPhone = new Phone("Apple","Silver",1000.0, 6.5, 6);
	    System.out.println(iPhone.toString());
	    System.out.println("How many phones do we have? "+Phone.getNumOfPhones());
	    System.out.println(Phone.arr);
	    Phone.getTotalPriceOfPhone();
	    
	    Phone samsung = new Phone("Samsung","Black", 800, 7, 10);
	    System.out.println(samsung.toString());
	    System.out.println("How many phones do we have? "+Phone.getNumOfPhones());
	    System.out.println(Phone.arr);
	    Phone.getTotalPriceOfPhone();
	    
	    Phone nokia = new Phone("Nokia","Red", 200, 5, 10);
	    System.out.println(nokia.toString());
	    System.out.println("How many phones do we have? "+Phone.getNumOfPhones());
	    System.out.println(Phone.arr);
	    Phone.getTotalPriceOfPhone();
	    
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    
	   System.out.println(findPhonesByPrice(600,900));
	}
	    
	   static ArrayList<Phone>findPhonesByPrice(double start, double end){ 
		   ArrayList<Phone>arr2 = new ArrayList<>();
	    for(Phone o: Phone.arr) {
	    	if(o.getPrice()<=end && o.getPrice()>=start) {
	    		arr2.add(o);
	    	}
	    }
	    return arr2;
	    
	    
	    

	
	
		
	}

}
