package day15_string_manipulation;

public class EmojiWarmUp {

	public static void main(String[] args) {
		String emoji =":)";
			
	 if(emoji.length()!=2 ){
		 System.out.println("Invalid emoji");
		 return;
			 }
	 char first = emoji.charAt(0);
	 char second = emoji.charAt(1);
	 if(first == ':') {
		 if(second ==')') {
			 System.out.println("Smile");
		 }else if(second =='(') {
			 System.out.println("Sad");
		 }else if(second =='/') {
			 System.out.println("Upset");
		 }else if(second =='p') {
			 System.out.println("Playful");
		 }else {
			 System.out.println("Unknown emoji");
		 }
	 }else if (first==';') {
		 if(second ==')') {
			 System.out.println("Wink");
		 }else if(second =='0') {
			 System.out.println("Surprised");
		 }
	 }else if(first =='(') {
		 if(second ==')') {
			 System.out.println("Smile");
		 }else {
			 System.out.println("Unknown");
		 }
	 }else if(first  ==')'){
			 
	 }else {
		 System.out.println("Invalid emoji");
	 }
		

	}

}
