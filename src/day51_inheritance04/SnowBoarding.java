package day51_inheritance04;

public class SnowBoarding extends Exercise{
  
	 public int perform(int minutes) {
		int cals =  super.perform(10);//call superclass version of perform
		 System.out.println("Snowboarding for "+minutes+" minutes");
		 return minutes * 7+cals; 
	 }
}
