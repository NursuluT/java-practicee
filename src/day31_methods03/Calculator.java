package day31_methods03;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		add(10, 5);
		subtract(600,6);
		multiply(8,25.6);
		divide(2500,6);
		remainder(7,3);
		// Add, subtract, multiply, divide, remainder
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		double n1 = scan.nextDouble();
		double n2 =scan.nextDouble();
		System.out.println("Select operation:  '+', '-', '*', '/', '%' ");
		String operator =scan.next();
		 switch(operator) {
		 case "+":
			add(n1,n2);
			 break;
		 case "-":
			 subtract(n1,n2);
			 break;
		 case "*":
			 multiply(n1,n2);
			 break;
		 case "/":
			 divide(n1,n2);
			 break;
		 case "%":
		    remainder(n1,n2);
		 break;
		 default:
			 System.out.println("Invalid operator!");
		 }
}
      public static void add(double num1, double num2) {
    	  double result = num1+num2;
    	  System.out.println("result: "+result);
      }
      public static void subtract(double num1, double num2) {
    	 double result = num1-num2;
    	  System.out.println("result: "+result);
      }
      public static void multiply(double num1, double num2) {
    	 double result = num1*num2;
    	  System.out.println("result: "+result);
      }
      public static void divide(double num1, double num2) {
    	  if(num2==0) {
    		  System.out.println("Can't / by 0");
    		  return;
    	  }
    	 double result = num1/num2;
    	  System.out.println("result: "+result);
      }
      public static void remainder(double num1, double num2) {
    	 double result = num1%num2;
    	  System.out.println("result: "+result);
      }
    	  
}