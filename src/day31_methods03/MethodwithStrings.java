package day31_methods03;

import java.util.Arrays;

public class MethodwithStrings {

	public static void main(String[] args) {
		countWords("Java is fun");
		googleSearchResults ("About 121,000,000 results (0.57 seconds) ");
		String resultStr = "About 121,000,000 results (0.57 seconds)";
		googleSearchResults(resultStr);
	}
   public static void countWords(String sentence) {
	   String[]words = sentence.split(" ");
	  
	   System.out.println("Words in this sentence "+Arrays.toString(words));
	   System.out.println("Number of words: " + words.length);
	  }

   public static void googleSearchResults(String result) {
	   String[] words = result.split(" ");
	   String count = words[1].replace(",","");
	   String seconds= words[3].replace("(", "");
	   System.out.println("Results count: "+count);
	   System.out.println("Time in seconds: " + seconds);
	   
   } 
	   
   
}
