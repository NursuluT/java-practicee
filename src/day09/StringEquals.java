package day09;

public class StringEquals {
public static void main(String[] args) {
	String str1 = "java";
	String str2 = "java";
	//using ==
	System.out.println(str1==str2);
	System.out.println(str1=="java");
	System.out.println(str2=="Java");
	//equals method
	System.out.println(str1.equals(str2));
	System.out.println(str1.equals("java"));
	System.out.println(str1.equals("Java"));
	
	//String month ="March";
	String month = new String("March");
	String month2 = new String("March");
	
	System.out.println(month==month2);
	System.out.println(month.equals(month2));
	System.out.println(month.equals("March"));
}
}
