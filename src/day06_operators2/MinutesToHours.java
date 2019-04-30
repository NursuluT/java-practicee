package day06_operators2;

public class MinutesToHours {
	public static void main(String[] args) {
		//minutes ==125;
		//2 hours, 5 minute;
		//print 5 hours and 5 minutes
		int minutes = 135;
		int hours = minutes / 60;
		int remainingMinutes = minutes % 60;
		System.out.println(hours);
		System.out.println(remainingMinutes);
		System.out.print(minutes+ " minutes is ");
		System.out.println(hours + " hours and " + remainingMinutes + " minutes");
		System.out.println("Hello " + 6 + 10 );
		
		
	}

}
