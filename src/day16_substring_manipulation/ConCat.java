package day16_substring_manipulation;

public class ConCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "java";
		System.out.println(word.concat("+selenium"));
		System.out.println(word.concat("in eclipse"));
		System.out.println(word);
		
		word = word.concat("+Eclipse");
		System.out.println(word);
        word = word.concat(" Automation");
        System.out.println(word);
        word = word + "-Cucumber";
        System.out.println(word);
        
       
        word = word +123;
        word = word + true;
        System.out.println(word);
        
        String word2 = "Hi";
        word2 = word2.concat("-hey").concat("-how are you").concat("-good");
        System.out.println(word2);
	}

}

