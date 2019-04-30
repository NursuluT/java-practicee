package day08_casting_conditionals;

import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		// program to tell if you are eligibile to vote
		//voting age 18
		//your age = take from scanner 
		//if you are eligible to vote
		//print you are eligible to vote
		// you have been eligible for 3 years
        //you are not eligible to vote, you still have 3 more years
		Scanner scan = new Scanner(System.in);
		int votingAge = 18;
		System.out.println("How old are you, Are you eligible to vote?");
		int yourAge = scan.nextInt();
		if (votingAge< yourAge) {
			int years = yourAge - votingAge;
			System.out.println(" Yes, You are eligible to vote"+ votingAge);
			System.out.println("you have been eligible for " +years+" years");
		}else {
			System.out.println("You are not eligible to vote, you still have 3 more years");
		
			
		}

		  
		 
		

	}

}
