package day08_casting_conditionals;

public class ExplicitCasting {
	public static void main(String[] args) {
		
		System.out.println (10/2.0);// result is double
		System.out.println(10.0/2);//result is double
		
		int result = (int)(10/2.0);
		System.out.println("resul: " + result);
		
		int rent1 = 987;
		int rent2 = 1100;
		int rent3 = 894;
		int rent4 = 1234;
		
		double average =(double)(rent1+rent2+rent3+rent4)/4.0;
		
		System.out.println("sum: " + average);
		

  double d= 40.2;
  int i = (byte)d; 
  System.out.println(d);
//in above statment both explicit and implicit casting happening.

//explicit: double > byte,
//implicit: byte > int
  
  
	}

}
