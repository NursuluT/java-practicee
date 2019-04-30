package day28_multid_arrays;

import java.util.Arrays;

public class ReversingSentense {

	public static void main(String[] args) {
		//Create a string variable and assign value
		//find out and print number of words and reverse the sentence and assign to new String called reversed
		// and print the reversed
		String sentence = "you love Java";
		String [] arrSentence = sentence.split(" ");
		System.out.println("Number of words: "+arrSentence.length);
		System.out.println(Arrays.toString(arrSentence));
		String reversed ="";
		for(int i = arrSentence.length -1; i>=0; i--) {
			//System.out.println(arrSentence[i]);
			
			reversed += arrSentence[i]+" ";
			
		}
		 reversed = reversed.trim();
			System.out.println(reversed);
		}

	}


