package day09;
import java.util.*;
public class Canada {
	public static void main(String[] args) {
		System.out.println("What is the capitol of Canada?");
		Scanner scan =new Scanner(System.in);
	String capital = scan.nextLine();
	
	if(capital.equalsIgnoreCase("Ottawa")) {
		System.out.println("Your answer is correct!");
	}else {
		System.out.println("Your answer is incorrect! "+capital+" is not capital of Canada");
	}
	
	}

}
