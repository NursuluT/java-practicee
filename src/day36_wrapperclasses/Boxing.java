package day36_wrapperclasses;

public class Boxing {

	public static void main(String[] args) {
		//AutoBoxing ->primitive >object
		Integer num1 = 1234;
		int n =5;
		Integer num2 =n;
		//Unboxing ->object >primitive
		Double d1 = new Double(34.2);
		double d2 =d1;
		System.out.println("d1: "+d1);
		System.out.println("d2: "+d2);
		
		long l1 =new Long(6000000);//unboxing
        Long l2=new Long(3456987);//no boxing
        long l3 = l2;//unboxing
        Long l4 =l3;//Autoboxing
        
        Integer num3 = Integer.valueOf(345);
       // Double d3 = num3; casting not possible 
	}

}
