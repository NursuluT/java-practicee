package day14_string_method;
import java.util.Scanner;
public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 words");
		
		
		String word1 = scan.next();
		String word2 = scan.next();
		if(word1.length() >word2.length()) {
			System.out.println(word1+" is longer than word2");
		}else if(word2.length()< word1.length() ) {
			System.out.println(word2+" is longer than word1");
		}else {
		System.out.println(word1+" and" +word2+"are same length");
		}

	}

}
