package day16_substring_manipulation;
import java.util.Scanner;
public class Url {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter url");
		String url = scan.next();
		if(url.startsWith("www")) {
			System.out.println("url starts with www");
		}else {
			System.out.println("invalid");
			return;
		}
		
		 int dotIndex = url.length() -4;
		 if(url.charAt(dotIndex)=='.') {
			 System.out.println("Dot is there before extension");
				
		 }else {
			
			System.out.println("might be missplaced");
			
			// if(url.charAt(url.length() -4) =='.'){
			//}
			String domain = url.substring(4, dotIndex);
			System.out.println(domain);
			String extension = url.substring(dotIndex+1, url.length());
			System.out.println(extension);
	}
}

}


