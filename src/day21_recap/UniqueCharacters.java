package day21_recap;
import java.util.Scanner;
public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word");
		String word = scan.next();
		String unique = "";
		
		//for(int i =0; i<word.length(); i++) {
		//	System.out.println(i);
		//	System.out.println(word.charAt(i));
		for(int i =0; i < word.length(); i++) {
			//read the letter and assign
			char letter = word.charAt(i);
			//System.out.println(letter);
			if(!unique.contains(""+letter)) {
				unique += letter;
				
			}
		}
		System.out.println(unique);
		}

	}


