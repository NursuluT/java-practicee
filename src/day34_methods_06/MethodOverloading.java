package day34_methods_06;

public class MethodOverloading {

	public static void main(String[] args) {
	        add(5, 6);
	        add(10.5, 15.8);
	        
	}
	public static void add(int num1, int num2) {
		int result = num1+num2;
		System.out.println("Result: "+result);
	}
	public static void add(double num1, double num2) {
		double result = num1+num2;
		System.out.println("Result: "+result);
	}
	public static void add(String num1, String num2) {
		String result = num1+num2;
		System.out.println("Result: "+result);
	}
}
