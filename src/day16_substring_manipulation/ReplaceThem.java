package day16_substring_manipulation;

public class ReplaceThem {

	public static void main(String[] args) {
		String sentence = "Coding is fun, it is my hobby!!";
		String withNoSpaces = sentence.replace(" ","");
		System.out.println(withNoSpaces);
	    sentence=sentence.replace(",","!!!");
	    System.out.println(sentence);
	    
	    String mixed = "^&^&*%ja-va|?^&*";
	    mixed = mixed.replace("^&^&*%", "");
	    System.out.println(mixed);
	    mixed = mixed.replace("|?^&*", "");
	    System.out.println(mixed);
	    mixed = mixed.replace("-", "");
	    System.out.println(mixed);
	    mixed = mixed.replace("-", "").replace("|", "");
	    System.out.println(mixed);
	    
	    mixed = mixed.replace("a", "");
	    System.out.println(mixed);
	    
	    String result = "About 115,000,000 results (0.57 seconds)";
	    result = result.replace("About ", "");
	    result = result.substring(0, result.indexOf(" "));
	    System.out.println(result);
	    
	    result = result.replaceFirst(",", "");//replace first comma
	    System.out.println(result);
	    
	    
		
		
		

	}

}
