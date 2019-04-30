package day08_casting_conditionals;
import java.util.Scanner;
public class IfElseWithScanner {
    public static void main(String[] args) {
    	//passingPercentage = 65;
    	//yourScorePercentage = take from scanner
    	//check if you passed or failed
    	Scanner scan = new Scanner(System.in);
    	int passingPersentage = 65;
    	System.out.println("What is your score?");
    	int yourScorePersentage= scan.nextInt();
    	
    	if(yourScorePersentage>=passingPersentage) {
    	
    		System.out.println("You Passed, Congratulations");
    	}else {
    		System.out.println("You Failed, Study more, do not be sad");
    		
    	}
    	System.out.println("Java is fun");
    	
	
}
}
