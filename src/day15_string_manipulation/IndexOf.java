package day15_string_manipulation;

public class IndexOf {

	public static void main(String[] args) {
		//             012345
		String word1 ="github";
		System.out.println(word1.indexOf('g'));
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("hub"));
		System.out.println(word1.indexOf("java"));

		String url = "www.okta.com";
		int index = url.indexOf(".");
		System.out.println("Position of . :"+index);
		System.out.println(url.charAt(index+8));
		
		String title ="Java - Google serach";
		int position = title.indexOf("-");
		System.out.println("Position of: - " +position);
		System.out.println(title.charAt(position+6));
		
		String country = "United states of America";
		int states = country.indexOf("states");
		System.out.println("States "+ states);
		
		String word2 = "java, c++, python, tomcat, eclipse,";
		if(word2.contains("c++")) {
			System.out.println("C++ is there ");
		}else {
			System.out.println("c++ is not there");
			
		}
		  if(word2.indexOf("c++")>= 0) {
		System.out.println("c++ is there");
	}else {
		System.out.println("is not there");
	}
	}
}
