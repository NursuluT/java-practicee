package test_01nurs;

import java.util.Scanner;

public class GetASandwich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	     String str = scan.next();
	     String tmpString;
	     String finalString;
	     
	      int len = str.length();

		  int start = 0;
		  int finish = 0;
		  boolean found = false;
		   
		  if (len <= 10)
		   
		   
		  for (int i = 0; i < len - 4; i++) {
		    tmpString = str.substring(i, i+5);
		    System.out.println(tmpString);
		    

		     
		    if (tmpString.equals("bread") && found == true)
		      System.out.println(tmpString);
		      finish = i; 
		       
		    if (tmpString.equals("bread") && found == false) {
		       System.out.println(tmpString);
		       start = i+5;
		      found = true;
		      
		    }else{
		      System.out.println("nothing");
		    }

		  }

		   
		}
	

	}


