package day13_ternary_strings_intro;

public class MoreTernary {

	public static void main(String[] args) {
		String quality = "bad";
		int rating = (quality.equals("good")) ? 100 : 0;
		
		System.out.println("Rating: " +rating);
		
		int PMhour = 6;
		boolean rushHour = (PMhour>= 4 && PMhour <=7 ) ? true:false;
		
		String result = rushHour==true? "yes" : "no";		
		System.out.println("Rush hour is "+result);
		
		
		int AMHour = 8;//6-9
		String amRushHour = AMHour >=6 && AMHour <=9? "yes" : "no";
		
		System.out.println(AMHour + " is rush hour? - " +amRushHour);
		
		
		

	}

}
