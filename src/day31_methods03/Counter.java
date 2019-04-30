package day31_methods03;

import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		             countUp(10);
		             countDown(10);
		             countDown(-3);
		             Scanner scan = new Scanner(System.in);
		             System.out.println("Enter num to countUp");
		             int inputNum = scan.nextInt();
		             countUp(inputNum);
}
	 public static void countUp(int num) {
	        if (num < 1) {
	            System.out.println("Invalid number "+num);
	        } else {
	            for (int i = 1; i <= num; i++) {
	                System.out.print(i + " ");
	            }
	           System.out.println();
	        }
	    }
	        public static void countDown(int num) {
	        	if(num<1) {
	        		System.out.println("Invalid input");
	        	}else {
	        	for(int n = num; n>=0; n--) {
	        		System.out.print(n+" ");
	        	}
	        	System.out.println();
	        }
	    }
}