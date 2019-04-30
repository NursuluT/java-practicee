package day16_substring_manipulation;

public class PutWordInBetween {
	

	public static void main(String[] args) {
		String chars = "{{}}";
		String  word = "va";
		String result = chars.substring(0,2)+word+chars.substring(2,4);
		System.out.println(result);
		
	}
}
		