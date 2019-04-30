package day22_practice_day;

public class FindHowManyUsingReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "including webpages, images";
		//find how many e characters in the word.
		//get the length of word
		// replace all e with empty
		// get the length of word without e
		//do a minus
		int length = word.length();
		word = word.replace("y","");
		int length2 = word.length();
		
		System.out.println("Length " +length);
		System.out.println("length2 "+length2);
		int count = length -length2;
		System.out.println("Count of e: "+count);

	}

}
