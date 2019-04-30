package day19_loops;

import java.util.Scanner;

public class ZombieAttack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int inhabitants = scan.nextInt();
		int day = scan.nextInt();
		while(inhabitants>3) {
			System.out.println("Day " +day+" "+inhabitants);
			
		}
		

	}

}
