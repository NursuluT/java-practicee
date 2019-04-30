package test_01nurs;

import java.util.Scanner;

public class WordJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  boolean exists = false;
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		  if(word.startsWith("java")){
		       System.out.println(word.indexOf("java")==0 || word.indexOf("java")==1);
		      
		    }else if(!word.startsWith("java")){
		      System.out.println("false");
		    }
		     
		  

	}

}
