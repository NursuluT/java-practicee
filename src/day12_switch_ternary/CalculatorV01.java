package day12_switch_ternary;
import java.util.Scanner;
public class CalculatorV01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		double num1 = input.nextDouble();
		System.out.println("Enter second number:");
		double  num2 = input.nextDouble();
		System.out.println("Select Operator: +, -, *, /, %");
		String operator = input.next();
		
		double result = 0.0;
		
		if(operator.equals("+")) {
			result = num1+num2; 
			System.out.println("Result: " + result);
		}else if(operator.equals("-")) {
			result = num1-num2;
			System.out.println("Result: " +result);
		}else if(operator.equals("*")) {
			result = num1*num2;
			System.out.println("Result: " +result);
			
		}else if(operator.equals("/")) {
		    result = num1/num2;
		    System.out.println("Result: " +result);
		}else if(operator.equals("%")) {
			result = num1%num2;
			System.out.println("Result: " +result);
		}else {
			System.out.println("Invalid operator selected: " +operator);
			return;// do not execute the remaining code. STOP HERE
		}
			
                 
	}

}
