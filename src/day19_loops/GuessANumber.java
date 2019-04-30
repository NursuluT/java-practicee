package day19_loops;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random random = new Random();//used to generate random numbers
		
		System.out.println("#### Welcome to quess a number game####");
		//this will give us a number between 0-100
		int secretNumber =random.nextInt(101);
		int guessNumber;
		do {
			System.out.println("Guess a number");
			guessNumber = scan.nextInt();
			if(guessNumber<secretNumber) {
				System.out.println("Your number is too small");
			}else if(guessNumber>secretNumber) {
				System.out.println("Your number is too large");
			}
		}while(guessNumber!=secretNumber);
		System.out.println("You found it");
		}
	

	}



