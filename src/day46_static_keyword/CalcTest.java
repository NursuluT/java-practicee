package day46_static_keyword;

public class CalcTest {

	public static void main(String[] args) {
		double result = CalculatorV3.plus(55,7);
		System.out.println("result: "+result);
		
		 result = CalculatorV3.minus(44, 14);
		 System.out.println("result: "+result);
		
		 
		 CalculatorV3 c = new CalculatorV3();
		 System.out.println(c.multiply(4, 2));
		 
		int i = Integer.parseInt("33");
		System.out.println(Character.isDigit('5'));
		System.out.println("hi");

	}

}
