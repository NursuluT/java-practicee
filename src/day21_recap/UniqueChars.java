package day21_recap;



public class UniqueChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "javva";
		String unique = "";
		
		char ch = word.charAt(0);
		System.out.println(unique.contains(""+ch));
		if(!unique.contains(""+ch)) {
			unique += ch; //unique = unique+ch;
		}
		
		System.out.println("Unique:" + unique);
		if(!unique.contains(""+ch)) {
			
		}
		
		
		
	}

}
