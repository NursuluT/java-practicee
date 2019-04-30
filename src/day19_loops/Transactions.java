package day19_loops;
import java.util.Scanner;
public class Transactions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your current balance");
		double balance = scan.nextDouble();
		int count = 0;
		while(balance>=0) {
			count++;//increase transaction by1
			System.out.println("What is transaction "+count+ " amount?");
			double transaction =scan.nextDouble();
			//balance-=transaction;
			if(transaction>balance) {
				System.out.println("you balance is about to be 0 or negative or due this transaction");
			}
			balance-=transaction;
			System.out.println("Current balance "+ balance);
		}
		 System.out.println("You have insufficient, you're balance is " +balance);
		 System.out.println("Transactions total count: " +count);
		
		
			 
		 
	}

}
