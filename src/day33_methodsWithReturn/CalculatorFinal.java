package day33_methodsWithReturn;

public class CalculatorFinal {


		public static void main(String[] args) {
			int result = add(4, 8);
			System.out.println("Result: " + result);
			result = add(10, 30);
			System.out.println("Result: " + result);
			System.out.println(add(6,2));
			
			multiply(5.5, 6.0);
			divide(75.2, 2);
			subtrackt(15.5, 20.0);
			add(78.5, 95.0);
			
			//addVoid(2, 5);
			//below line will not work because addVoid does not
			//return a value. it just perform action
			//int result = addVoid(5, 1);
			//System.out.println(addVoid(3,4));
		}
		/*
		 1) method addVoid
	      return type: void
	      params: int num1, int num2
	      add them and print sum
		 */
		public static void addVoid(int num1, int num2) {
			int sum = num1 + num2;
			System.out.println("Sum: " + sum);
		}
		
		/*
		 2) method name: add
	     return type: int
	     params: int num1, int num2
	     add them and return the sum
		 */
		public static int add(int num1, int num2) {
			int sum = num1 + num2;
			return sum;
		}
		public static double multiply(double n1, double n2) {
			double value = n1 * n2;
			System.out.println("Total is: " + value);
			return value;
		}
		public static double divide(double n1, double n2) {
			double value = n1/ n2;
			System.out.println("Value is: " +value);
			return value;
		}
		public static double subtrackt(double n1, double n2) {
			double value = n1- n2;
			System.out.println("Value is: " +value);
			return value;
		
		}
		public static double add(double n1, double n2) {
			double value = n1+ n2;
			System.out.println("Value is: " +value);
			return value;
		}
	}