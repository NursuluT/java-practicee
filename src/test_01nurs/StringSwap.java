package test_01nurs;

public class StringSwap {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";
		
		System.out.println("before swapping: ");
		System.out.println("the value of a is: "+a);
		System.out.println("the value of b is: "+b);
		//1. append a and b
		a = a+b; // HelloWorld
		
		//2. Store initial string a in String b:
		b = a.substring(0, a.length()-b.length());
        
		//3. Store initial String b in String a:
		a = a.substring(b.length());
		System.out.println("The value of a and b after swapping");
		System.out.println("the value of a is: "+a);
		System.out.println("the value of b is: "+b);
	}

}
