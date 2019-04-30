package day22_practice_day;

public class LookForWordInString {

	public static void main(String[] args) {
		// check if temp = hi, if true, add to count
		String sentence ="He said hi, then she replied hi. hi quys!";
       int count =0;
		for(int i = 0; i < sentence.length()-1;i++) {
				String temp  = sentence.substring(i, i+2);
				if(temp.equals("hi")) {
					count++;
					
				
				}
				}
			System.out.println("Count "+count);
		
		
		
	}

}
