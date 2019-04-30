package day33_methodsWithReturn;

public class AgeCalculator {

		
	
	public static int calculateAge (int yearBorn, int currentYear) {
		int currentYear1 = 2019;
		int age =currentYear1- yearBorn;
		if(age <0 ) {
			System.out.println("Invalid Age!");
		}
		else if(age>=0 && age <15) {
			System.out.println("Child");
		}
		else if(age>=26 && age<= 64) {
			System.out.println("Adult");
		}else{
			
			System.out.println("Senior");
		
		}
			return age ;
		
	}

}
