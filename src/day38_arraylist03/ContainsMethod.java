package day38_arraylist03;
import java.util.*;
public class ContainsMethod {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("January");
		list1.add("February");
		list1.add("March");
		list1.add("April");
		list1.add("May");
		System.out.println(list1);
		ArrayList<String> list2 =list1;//list1, list2 point to same object
		//copy all values from list1
		ArrayList<String> months =new ArrayList<>(list1);// copy all values
		System.out.println(months);
		months.add("June");
		months.add("July");
		months.add("August");
	
		System.out.println(months.contains("January"));
		System.out.println(months.contains("December"));
		// how would you check if feb is in second position
		//months.clear();
		System.out.println(months.indexOf("February")==1);
		System.out.println(months.get(1).equals("February"));
		
		ArrayList<String> months2 = new ArrayList<>(list1);
		
		System.out.println("Months: "+months.toString());
		System.out.println("Months: "+months2.toString());
		
		//check if months has all the values of months2
		if(months.containsAll(months2)) {
			System.out.println("Months has all of Months 2");
		}else {
			System.out.println("Some values are missing");
		}
		
		//add one more jan to months2
		months2.add("January");
		if(months.containsAll(months2)) {
			System.out.println("Months has all of Months 2");
		}else {
			System.out.println("Some values are missing");
		}
		
		

	}

}
