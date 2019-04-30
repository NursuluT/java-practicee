package day33_methodsWithReturn;

import day31_methods03.Calculator;

public class CalcTest {

	public static void main(String[] args) {
      System.out.println(CalculatorFinal.add(3, 1));
      System.out.println(CalculatorFinal.divide(40.5, 3));
      System.out.println(CalculatorFinal.subtrackt(4.5, 3));
      System.out.println(CalculatorFinal.multiply(7.5, 6));
      
      int addResult = CalculatorFinal.add(21, 41);
      double mResult = CalculatorFinal.multiply(50, 40);
      double nResult = CalculatorFinal.subtrackt(25, 3.5);
      double kResult = CalculatorFinal.divide(25, 6);
      
      System.out.println("AddResult: "+addResult);
      System.out.println("mResult: "+mResult);
      System.out.println("nResult: "+nResult);
      System.out.println("kResuslt: "+kResult);
      
      double a = 10.0, b = 5.0;
      double myResult = CalculatorFinal.subtrackt(a, b);
      System.out.println("myResult: "+myResult);
      
      double[] dNums = {2.0, 4.0};
      double result2 = CalculatorFinal.multiply(dNums[0], dNums[1]);
      System.out.println("result2: "+result2);
      
      if(CalculatorFinal.add(10, 16)==26) {
      System.out.println("add unit test passed");
      }else {
    	  System.out.println("Add Unit test failed");
      }
	}

}
          