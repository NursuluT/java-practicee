package day23_arrays;

import java.util.Scanner;

public class PrintSizWords {

	public static void main(String[] args) {
		// Write program that will take from user 6 words concatenate words with a comma
		// if word is equals to java
		//skip this word
		//print summary at the end of the program
		Scanner scan = new Scanner(System.in);
		String word = "";
String allWords="";
		
		for (int i = 0;i<6;i++) {
			System.out.println("Type the word");
			word = scan.next();
			if(word.contentEquals("java")) {
				continue;
				
			}
			allWords+=word+", ";
		}
     
		
		
		

	}

}
