package day15_string_manipulation;

public class StartsEndsWith {

	public static void main(String[] args) {
		String word1 = "eclipse";
		//startsWithMethod ==> tests if string starts with another string
		System.out.println(word1.startsWith("e"));//true
		System.out.println(word1.startsWith("ec"));//true
		System.out.println(word1.startsWith(""));
		System.out.println(word1.startsWith("ecli"));//true
		System.out.println(word1.startsWith("Ecli"));//false, starts with upper case
		
		System.out.println(word1.endsWith("e"));//true
		System.out.println(word1.endsWith("se"));//true
		System.out.println(word1.endsWith("lipse"));//true
		System.out.println(word1.endsWith("java"));//false
		
	                          //ECLIPSE     PSE
		System.out.println(word1.toUpperCase().endsWith("PSE"));
		System.out.println(word1.endsWith("eclipse"));
		
		//Ms ==> male
		//Mrs ==> married female
		//Ms. ==> Some woman
		//Dr. ==> Doctor man or woman
		//Unknown status
		String name= "Mrs.Jackson";
		if(name.startsWith("Ms")) {
			System.out.println("male");
		}else if(name.startsWith("Mrs")) {
			System.out.println("Married female");
		}else if(name.startsWith("Ms")) {
			System.out.println("Some woman");
		    
		}else if(name.startsWith("Dr")) {
			System.out.println("Doctor male or female");
		}else {
			System.out.println("Unknow status");
		}
		
		
	
			

		
		

	}

}
