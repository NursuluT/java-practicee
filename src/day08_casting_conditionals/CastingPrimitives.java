package day08_casting_conditionals;

public class CastingPrimitives {
	public static void main(String[] args) {
		//cast double value to int
		int i = (int)3.4;
		System.out.println("i: " +i);
		
		double price = 230.50;
		int dollars = (int) price;
		System.out.println("Price: " +dollars);
		
		//Whole number. Byte, short, int
		
		int count = 100;
		byte byteCount =(byte)count;
		System.out.println("count: " + count);
		System.out.println("Byte code: " + byteCount);
		
		long longValue = 34565L;
		int intValue =(int)longValue;
		System.out.println("long value: " + longValue);
		System.out.println("int Value: " + longValue);
		
		int large = 5678;
		short small = (short) large;
		System.out.println("small: "+ small);
		
		int result =(int)(500.4 / 2.0);
		System.out.println("result: " + result);
		
		
		
		
	}

}
