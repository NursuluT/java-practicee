package test_01nurs;
import java.util.*;

public class TimeConversion {

	public static void main(String[] args) {
		// Input is String
		// Output is int, string
		//remove PM substring, split, replace
		//replace all(regular expression)
		//if pm, add 12 hrs.
		Scanner scan = new Scanner(System.in);
		timeConversion("07:05:45PM");
		
	}
	

	public static void timeConversion(String s) {
		String [] arr = s.split(":");
		System.out.println(Arrays.toString(arr));
		
		if(arr[2].contains("PM")) {
			arr[0]=Integer.toString((Integer.parseInt(arr[0])+12));
	    }
		System.out.println(Arrays.toString(arr));
		
		arr[2]=arr[2].replaceAll("\\D", "");
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i!=arr.length-1) {
				System.out.print(":");
			}
		}
		
		
	}

}
