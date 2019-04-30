package test_01nurs;

public class RemoveJunk {

	public static void main(String[] args) {
		String s = "$%^&* Love Java %^&*";
		
		//regular expression:[a-zA-Z0-9];
		s = s.replaceAll("$%^&*", "");
		System.out.println(s);
		

	}

}
